package Floristeria.Products;

public class Arbol extends Producto {
    private double altura;

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
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", altura=" + altura +
                '}';
    }
}
