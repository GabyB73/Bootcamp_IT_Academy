package Floristeria.Products;

import Floristeria.Client.Floristeria;

public class Flor extends Producto {
    private final String color;

    public Flor(String nombre, double precio, String color) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return id + "\t" + nombre + "\t" + precio + "€\t" + color + "\n";
    }
}
