package com.bustamante.gabriela.itacademy.techtest.skin_api.auth.repositories;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);

    Optional<User> findByUsername(String username);
}
