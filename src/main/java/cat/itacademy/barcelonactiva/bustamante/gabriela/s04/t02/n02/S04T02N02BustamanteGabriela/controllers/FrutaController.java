package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.controllers;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.exceptions.FrutaNotFoundException;
import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.model.domain.Fruta;
import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.model.services.ServicioFruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FrutaController {
    @Autowired
    private ServicioFruta servicioFruta;

    @PostMapping("/add")
    public ResponseEntity<Fruta> createFruta(@RequestBody Fruta fruta) {
        Fruta nuevaFruta = servicioFruta.addFruta(fruta);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaFruta);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateFruta(@PathVariable int id, @RequestBody Fruta frutaActualizada) {
        try {
            servicioFruta.updateFruta(id, frutaActualizada.getNombre(), frutaActualizada.getCantidadKilos());
            return ResponseEntity.ok("Fruta actualizada exitosamente");
        } catch (FrutaNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Fruta>> getAllFruta() {
        List<Fruta> frutas = servicioFruta.getAllFruta();
        return ResponseEntity.ok(frutas);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Fruta> searchFrutaById(@PathVariable int id) {
        Optional<Fruta> frutaOptional = servicioFruta.getFrutaById(id);

        return frutaOptional
                .map(fruta -> ResponseEntity.ok().body(fruta)) // Si la fruta existe
                .orElseGet(() -> ResponseEntity.notFound().build()); // Si la fruta no existe

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFrutaById(@PathVariable int id) {
        servicioFruta.deleteFrutaById(id);
        return ResponseEntity.noContent().build();
    }


}
