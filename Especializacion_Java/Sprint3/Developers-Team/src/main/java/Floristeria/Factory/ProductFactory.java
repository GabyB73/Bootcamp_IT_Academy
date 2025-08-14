package Floristeria.Factory;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

public interface ProductFactory {
    Arbol crearArbol(String nombre, double precio, double altura);
    Flor crearFlor(String nombre, double precio, String color);
    Decoracion crearDecoracion(String nombre, double precio, boolean material);
}
