package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.services;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.domain.Fruta;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface ServicioFruta {
    Fruta crearFruta(Fruta fruta);
    List<Fruta> getAllFruta();
    Fruta updateFruta(ObjectId id, String nuevoNombre, float nuevaCantidadKilos);
    void deleteFrutaById(ObjectId id);
    //Fruta getOneFruta(int id);
    Optional<Fruta> getFrutaById(ObjectId id);

    Fruta addFruta(Fruta fruta);
}
