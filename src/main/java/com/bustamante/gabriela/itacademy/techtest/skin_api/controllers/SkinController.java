package com.bustamante.gabriela.itacademy.techtest.skin_api.controllers;

import com.bustamante.gabriela.itacademy.techtest.skin_api.exceptions.SkinNotFoundException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.exceptions.UnauthorizedSkinAccessException;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.BuySkinRequest;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.dto.SkinDTO;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.entities.Skin;
import com.bustamante.gabriela.itacademy.techtest.skin_api.model.services.SkinService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/skins")
@Tag(name = "Skin Controller", description = "Controller for managing skins")
public class SkinController {

    private final SkinService skinService;

    @GetMapping("/available")
    @Operation(summary = "Get all available skins")
    public ResponseEntity<List<SkinDTO>> getAvailableSkins() {
        return ResponseEntity.ok(skinService.getAvailableSkins());
    }

    @PostMapping("/buy")
    @Operation(summary = "Buy a skin")
    public ResponseEntity<?> buySkin(@RequestBody BuySkinRequest request) {
        try {
            SkinDTO skinDTO = skinService.buySkin(request);
            return ResponseEntity.ok(skinDTO);
        } catch (SkinNotFoundException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/myskins")
    @Operation(summary = "Get skins bought by the user")
    public ResponseEntity<?> getMySkins() {
        try {
            List<SkinDTO> skins = skinService.getMySkins();
            return ResponseEntity.ok(skins);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
        }

    @PutMapping("/color")
    @Operation(summary = "Update skin color")
    public ResponseEntity<?> updateSkinColor(@RequestParam int id, @RequestParam String color) {
        try {
            Skin updatedSkin = skinService.updateSkinColor(id, color);
            return ResponseEntity.ok(updatedSkin);
        } catch (UnauthorizedSkinAccessException e) {
            return ResponseEntity.status(403).body(e.getMessage()); // 403 Forbidden si no es el dueño
        } catch (SkinNotFoundException e) {
            return ResponseEntity.status(404).body(e.getMessage()); // 404 si la skin no existe
        }
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete a skin by ID")
    public ResponseEntity<?> deleteSkin(@PathVariable int id) {
        try {
            skinService.deleteSkin(id);
            return ResponseEntity.noContent().build();
        } catch (UnauthorizedSkinAccessException e) {
            return ResponseEntity.status(403).body(e.getMessage());
        } catch (SkinNotFoundException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/getskin/{id}")
    @Operation(summary = "Get a skin by ID")
    public ResponseEntity<SkinDTO> getSkinById(@PathVariable int id) {
        Optional<Skin> skin = skinService.getSkinById(id);
        return skin.map(value -> ResponseEntity.ok(skinService.mapToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
