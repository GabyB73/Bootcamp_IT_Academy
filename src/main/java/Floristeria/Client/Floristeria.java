package Floristeria.Client;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

import java.util.List;

public class Floristeria {
    private static Floristeria instance;
    private String nombre;
    private List<Arbol> StockArboles;
    private List<Flor> StockFlores;
    private List<Decoracion> StockDecoracion;
    private double valorStock;

    // Evitar instanciación
    private Floristeria (){}

    public static Floristeria getInstance() {
        if (instance == null) {
            instance = new Floristeria();
        }
        return instance;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Arbol> getStockArboles() {
        return StockArboles;
    }
    public List<Flor> getStockFlores() {
        return StockFlores;
    }

    public List<Decoracion> getStockDecoracion() {
        return StockDecoracion;
    }

    public double getValorStock() {
        return valorStock;
    }

    // Evitar duplicación de instancias
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
