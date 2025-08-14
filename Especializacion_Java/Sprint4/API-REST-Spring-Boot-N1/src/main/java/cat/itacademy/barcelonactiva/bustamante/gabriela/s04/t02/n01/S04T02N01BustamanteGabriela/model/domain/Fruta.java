package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "frutas")
public class Fruta {
    @Id  // Para indicar que es la PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para indicar que el Id será autoincremental
    private int id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int cantidadKilos;

    public Fruta() {
    }

    public Fruta(String nombre, int cantidadKilos) {
        this.nombre = nombre;
        this.cantidadKilos = cantidadKilos;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(int cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }
}
