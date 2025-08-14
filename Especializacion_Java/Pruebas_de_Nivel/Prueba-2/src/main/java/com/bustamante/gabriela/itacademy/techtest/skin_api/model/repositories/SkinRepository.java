package com.bustamante.gabriela.itacademy.techtest.skin_api.model.repositories;

import com.bustamante.gabriela.itacademy.techtest.skin_api.model.entities.Skin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkinRepository extends JpaRepository<Skin, Integer> {
    List<Skin> findByUserId(Integer userId);
}
