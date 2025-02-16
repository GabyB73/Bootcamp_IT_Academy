package com.bustamante.gabriela.itacademy.techtest.skin_api.auth.services;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.AuthResponse;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.RegisterRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.Role;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.repositories.UserRepository;
import com.bustamante.gabriela.itacademy.techtest.skin_api.security.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        var user = User.builder()
                .username(registerRequest.getUsername())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .roles(Set.of(Role.USER )) //Asignación del rol al usuario
                .build();
        userRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder().token(jwtToken).build();
    }

    @Override
    public AuthResponse authenticate(RegisterRequest registerRequest) {
        authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
                registerRequest.getUsername(),
                registerRequest.getPassword()
        )
        );
        var user = userRepository.findUserByUsername(registerRequest.getUsername()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder().token(jwtToken).build();
    }

    @Override
    public User getUserFromAuthentication(Authentication authentication) {
        String username = authentication.getName();
        return userRepository.findUserByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found: " + username));
    }

}
