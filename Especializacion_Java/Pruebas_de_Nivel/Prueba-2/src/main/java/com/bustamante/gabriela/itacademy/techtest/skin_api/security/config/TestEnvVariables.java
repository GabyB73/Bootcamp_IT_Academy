package com.bustamante.gabriela.itacademy.techtest.skin_api.security.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestEnvVariables implements CommandLineRunner {
    @Value("${SPRING_DATASOURCE_USERNAME:NOT_FOUND}")
    private String dbUser;

    @Value("${SPRING_DATASOURCE_PASSWORD:NOT_FOUND}")
    private String dbPass;
    @Override
    public void run(String... args) {
        System.out.println("🔹 Usuario DB: " + dbUser);
        System.out.println("🔹 Contraseña DB: " + dbPass);
    }
}
