package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.services;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.exceptions.FrutaNotFoundException;
import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.domain.Fruta;
import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.repository.FrutaRepositorio;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioFrutaImpl implements ServicioFruta{
    @Autowired
    private final FrutaRepositorio frutaRepositorio;

    public ServicioFrutaImpl(FrutaRepositorio frutaRepositorio) {

        this.frutaRepositorio = frutaRepositorio;
    }
    //Métodos CRUD
    @Override
    public Fruta crearFruta(Fruta fruta) {

        return frutaRepositorio.save(fruta);
    }

    @Override
    public List<Fruta> getAllFruta() {

        return frutaRepositorio.findAll();
    }

    @Override
    public Fruta updateFruta(ObjectId id, String nuevoNombre, float nuevaCantidadKilos) {
        Optional<Fruta> frutaOptional = frutaRepositorio.findById(id);

        if (frutaOptional.isPresent()) {
            Fruta fruta = frutaOptional.get();
            fruta.setNombre(nuevoNombre);
            fruta.setCantidadKilos(nuevaCantidadKilos);
            return frutaRepositorio.save(fruta);
        } else {
            throw new FrutaNotFoundException("Fruta no encontrada con el ID: " + id);
        }
    }

    @Override
    public void deleteFrutaById(ObjectId id) {

        frutaRepositorio.deleteById(id);
    }

    @Override
    public Optional<Fruta> getFrutaById(ObjectId id) {

        return frutaRepositorio.findById(id);
    }

    @Override
    public Fruta addFruta(Fruta fruta) {

        return frutaRepositorio.save(fruta);
    }
}
