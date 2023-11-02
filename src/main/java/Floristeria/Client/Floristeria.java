package Floristeria.Client;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;
import Floristeria.Products.Producto;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
    private static Floristeria instance;
    private String nombre;
<<<<<<< Updated upstream
    private List<Arbol> StockArboles;
    private List<Flor> StockFlores;
    private List<Decoracion> StockDecoracion;
=======
    private static List<Producto> productos = new ArrayList<>();
    private static List<Ticket> tickets = new ArrayList<>();
>>>>>>> Stashed changes
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

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Ticket> getTickets() {
        return tickets;
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
