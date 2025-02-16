package com.bustamante.gabriela.itacademy.techtest.skin_api.model.services;

import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.entities.User;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.exceptions.UsernameNotFoundException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.auth.repositories.UserRepository;
import com.bustamante.gabriela.itacademy.techtest.skin_api.exceptions.FileNotFoundException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.exceptions.SkinNotFoundException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.exceptions.UnauthorizedSkinAccessException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.BuySkinRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.SkinDTO;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.entities.Skin;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.repositories.SkinRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Tag(name = "Skin Service", description = "Service for managing skins")
public class SkinServiceImpl implements SkinService {

    private static final Logger logger = LoggerFactory.getLogger(SkinServiceImpl.class);

    private final SkinRepository skinRepository;
    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;

    @PostConstruct
    public void init() throws IOException {
        try {
            loadSkinsFromFile();
        } catch (IOException e) {
            logger.error("Error loading skins from file: {}", e.getMessage());
        }
    }
    @Override
    @Operation(summary = "Get all available skins")
    public List<SkinDTO> getAvailableSkins() {
        return skinRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Operation(summary = "Buy a skin")
    public SkinDTO buySkin(BuySkinRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        Skin skin = skinRepository.findById(request.getSkinId())
                .orElseThrow(() -> new SkinNotFoundException("Skin not found"));

        // Asociar la skin con el usuario
        skin.setUser(user);
        skinRepository.save(skin);

        return mapToDTO(skin);
    }

    @Override
    @Operation(summary = "Get skin by ID")
    public Optional<Skin> getSkinById(int id) {
        return skinRepository.findById(id);
    }

    @Override
    @Operation(summary = "Update skin color")
    public Skin updateSkinColor(int id, String color) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        Skin skin = skinRepository.findById(id)
                .orElseThrow(() -> new SkinNotFoundException("Skin not found"));

        // Verificar que la skin pertenece al usuario autenticado
        if (skin.getUser().getId() != user.getId()) {

            throw new UnauthorizedSkinAccessException("You do not own this skin");
        }

        skin.setColor(color);
        return skinRepository.save(skin);

    }

    @Override
    @Operation(summary = "Delete skin by ID")
    public void deleteSkin(int id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        Skin skin = skinRepository.findById(id)
                .orElseThrow(() -> new SkinNotFoundException("Skin not found"));

        // Verificar que la skin pertenece al usuario autenticado antes de eliminarla
        if (skin.getUser().getId() != user.getId()) {

            throw new UnauthorizedSkinAccessException("You do not own this skin");
        }

        skinRepository.delete(skin);

    }

    @Override
    public List<SkinDTO> getMySkins() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        List<Skin> skins = skinRepository.findByUserId(user.getId());

        return skins.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public void loadSkinsFromFile() throws IOException {
        ClassPathResource resource = new ClassPathResource("available_skins.json");
        if (!resource.exists()) {
            throw new FileNotFoundException("File not found: available_skins.json");
        }
        List<Skin> skins = objectMapper.readValue(resource.getInputStream(), new TypeReference<List<Skin>>() {});
        skinRepository.saveAll(skins);
    }

    @Override
    public SkinDTO mapToDTO(Skin skin) {
        return SkinDTO.builder()
                .id(skin.getId())
                .name(skin.getName())
                .type(skin.getType())
                .price(skin.getPrice())
                .color(skin.getColor())
                .build();
    }
}
