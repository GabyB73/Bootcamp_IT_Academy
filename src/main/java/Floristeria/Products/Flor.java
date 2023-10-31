package Floristeria.Products;

public class Flor extends Producto {
    private String color;

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
        return "Flor{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                '}';
    }
}
