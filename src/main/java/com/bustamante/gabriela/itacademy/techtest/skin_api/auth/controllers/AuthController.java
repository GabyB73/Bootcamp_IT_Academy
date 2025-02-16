package com.bustamante.gabriela.itacademy.techtest.skin_api.auth.controllers;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.AuthResponse;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.RegisterRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.repositories.UserRepository;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.services.AuthService;
import com.bustamante.gabriela.itacademy.techtest.skin_api.security.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    private final JwtService jwtService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.ok(authService.register(registerRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.ok(authService.authenticate(registerRequest));
    }
/*
    @GetMapping("/user")
    public ResponseEntity<User> getUser(@AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(userService.getUser(userDetails));
    }

    @GetMapping("/refresh")
    public ResponseEntity<AuthResponse> refresh(@RequestHeader("Authorization") String token) {
        return ResponseEntity.ok(authService.refresh(token));
    }*/
}
