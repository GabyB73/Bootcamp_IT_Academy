package Floristeria.Products;

import Floristeria.Client.Floristeria;

public class Arbol extends Producto{
    private final double altura;

    public Arbol(String nombre, double precio, double altura) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return id + "\t" + nombre + "\t" + precio +"€\t" + altura + "\n";
    }
}
