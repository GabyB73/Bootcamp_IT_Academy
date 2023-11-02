package Floristeria.Products;

public abstract class Producto{
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
