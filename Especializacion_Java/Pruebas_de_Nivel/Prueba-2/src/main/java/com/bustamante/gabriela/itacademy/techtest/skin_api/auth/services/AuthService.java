package com.bustamante.gabriela.itacademy.techtest.skin_api.auth.services;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.AuthResponse;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.dto.RegisterRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import org.springframework.security.core.Authentication;

public interface AuthService {
    AuthResponse register(RegisterRequest registerRequest);
    AuthResponse authenticate(RegisterRequest registerRequest);
    User getUserFromAuthentication(Authentication authentication);
}
