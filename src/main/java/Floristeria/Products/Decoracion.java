package Floristeria.Products;

import Floristeria.Client.Floristeria;

public class Decoracion extends Producto {
    private final boolean materialIsWood;

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
        return id + "\t" + nombre + "\t" + precio + "€\t" + materialIsWood + "\n";
    }

}
