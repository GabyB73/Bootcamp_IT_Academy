package Floristeria.Products;

public class Decoracion extends Producto {
    private boolean materialIsWood;

    public Decoracion(String nombre, double precio, boolean material) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
        this.materialIsWood = material;
    }
    public boolean getMaterialIsWood() {
        return materialIsWood;
    }
    @Override
    public String toString() {
        return "Decoracion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", Wood?=" + materialIsWood +
                '}';
    }

}
