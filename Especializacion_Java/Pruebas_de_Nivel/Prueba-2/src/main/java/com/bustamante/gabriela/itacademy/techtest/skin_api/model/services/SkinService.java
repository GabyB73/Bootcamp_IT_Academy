package com.bustamante.gabriela.itacademy.techtest.skin_api.model.services;

import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.BuySkinRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.SkinDTO;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.entities.Skin;

import java.util.List;
import java.util.Optional;

public interface SkinService {
    public List<SkinDTO> getAvailableSkins();
    public SkinDTO buySkin(BuySkinRequest request);
    public Optional<Skin> getSkinById(int id);
    public Skin updateSkinColor(int id, String color);
    public void deleteSkin(int id);
    public List<SkinDTO> getMySkins();
    SkinDTO mapToDTO(Skin skin);

}
