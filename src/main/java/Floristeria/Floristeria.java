package Floristeria;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
    private String nombre;
    private List<Arbol> stockArboles = new ArrayList<>();
    private List<Flor> stockFlores = new ArrayList<>();
    private List<Decoracion> stockDecoracion = new ArrayList<>();
    private double valorStock;

    public void agregarArbol(Arbol arbol) {
        stockArboles.add(arbol);
    }
    public void agregarFlor(Flor flor){
        stockFlores.add(flor);
    }
    public void agregarDecoracion(Decoracion decoracion){
        stockDecoracion.add(decoracion);
    }
    public void retirarArbol(Arbol arbol){
        stockArboles.remove(arbol);
    }
    public void retirarFlor(Flor flor){
        stockFlores.remove(flor);
    }
    public void retirarDecoracion(Decoracion decoracion){
        stockDecoracion.remove(decoracion);
    }
    public Arbol buscarArbol(String nombre) {
        for (Arbol arbol : stockArboles) {
            if (arbol.getNombre().equalsIgnoreCase(nombre)) {
                return arbol;
            }
        }
        return null; // Devuelve null si no se encuentra el árbol.
    }
}
