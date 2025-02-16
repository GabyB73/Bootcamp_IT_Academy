package com.bustamante.gabriela.itacademy.techtest.skin_api.model.entities;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skins")
@Schema(description = "Entidad que representa una skin en el videojuego")
public class Skin {
    @Schema(description = "Identificador único de la skin")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Schema(description = "Nombre de la skin")
    @Column(nullable = false)
    private String name;

    @Schema(description = "Tipo de la skin")
    @Column(nullable = false)
    private String type;

    @Schema(description = "Precio de la skin")
    @Column(nullable = false)
    private double price;

    @Schema(description = "Color de la skin")
    @Column(nullable = false)
    private String color;

    @Schema(description = "Usuario que ha comprado la skin")
    @ManyToOne
    @JoinColumn(name = "user_id") // Relación con el usuario
    private User user;
}
