package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "fruta")
public class Fruta {

    @Id
    private ObjectId id;
    private String nombre;
    private float cantidadKilos;

    public ObjectId getId() {

        return id;
    }

    public void setId(ObjectId id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public float getCantidadKilos() {

        return cantidadKilos;
    }

    public void setCantidadKilos(float cantidadKilos) {

        this.cantidadKilos = cantidadKilos;
    }
}
