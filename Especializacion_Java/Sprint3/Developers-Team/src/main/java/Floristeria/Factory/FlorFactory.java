package Floristeria.Factory;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

public class FlorFactory implements ProductFactory{
    private static FlorFactory instance = null;
    @Override
    public Arbol crearArbol(String nombre, double precio, double altura) {
        return null;
    }

    @Override
    public Flor crearFlor(String nombre, double precio, String color) {
        return new Flor(nombre, precio, color);
    }

    @Override
    public Decoracion crearDecoracion(String nombre, double precio, boolean material) {
        return null;
    }
}
