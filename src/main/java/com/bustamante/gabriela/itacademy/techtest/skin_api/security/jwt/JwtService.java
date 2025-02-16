package com.bustamante.gabriela.itacademy.techtest.skin_api.security.jwt;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String generateToken(UserDetails userDetails);
    String getUserName(String token);
    boolean validateToken(String token, UserDetails userDetails);
}
