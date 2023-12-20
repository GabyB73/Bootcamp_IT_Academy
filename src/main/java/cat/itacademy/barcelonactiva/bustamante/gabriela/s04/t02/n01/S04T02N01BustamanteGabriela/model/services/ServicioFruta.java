package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.model.services;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.model.domain.Fruta;

import java.util.List;
import java.util.Optional;

public interface ServicioFruta {
    Fruta crearFruta(Fruta fruta);
    List<Fruta> getAllFruta();
    Fruta updateFruta(int id, String nuevoNombre, int nuevaCantidadKilos);
    void deleteFrutaById(int id);
    //Fruta getOneFruta(int id);
    Optional<Fruta> getFrutaById(int id);

    Fruta addFruta(Fruta fruta);
}


