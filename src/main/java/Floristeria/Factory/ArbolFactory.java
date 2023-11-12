package Floristeria.Factory;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;
import Floristeria.Products.Producto;

public class ArbolFactory implements ProductFactory{
    private final static ArbolFactory instance = null;

    @Override
    public Arbol crearArbol(String nombre, double precio, double altura) {

        return new Arbol(nombre, precio, altura);
    }

    @Override
    public Flor crearFlor(String nombre, double precio, String color) {

        return null;
    }

    @Override
    public Decoracion crearDecoracion(String nombre, double precio, boolean material) {

        return null;
    }
}
