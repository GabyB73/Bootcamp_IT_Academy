package Floristeria.Factory;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

public class DecoracionFactory implements ProductFactory{
    private static DecoracionFactory instance = null;
    @Override
    public Arbol crearArbol(String nombre, double precio, double altura) {
        return null;
    }

    @Override
    public Flor crearFlor(String nombre, double precio, String color) {
        return null;
    }

    @Override
    public Decoracion crearDecoracion(String nombre, double precio, boolean material) {
        return new Decoracion(nombre, precio, material);
    }
}
