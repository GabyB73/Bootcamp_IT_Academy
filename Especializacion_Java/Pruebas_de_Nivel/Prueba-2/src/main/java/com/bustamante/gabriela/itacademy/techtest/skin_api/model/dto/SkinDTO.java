package com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkinDTO {
    private int id;
    private String name;
    private String type;
    private double price;
    private String color;
}
