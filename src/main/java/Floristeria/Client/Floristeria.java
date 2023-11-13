package Floristeria.Client;

import Floristeria.Products.Producto;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
    private static Floristeria instance;
    private String nombre;
    private static List<Producto> stockProductos = new ArrayList<>();
    private static List<Ticket> tickets = new ArrayList<>();
    private int id = 0;
    private static int nextId = 1;

    // Evitar instanciación
    private Floristeria() {

    }

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
        id = nextId;
        return stockProductos;
    }
    public static void setStockProductos(List<Producto> stockProductos) {
        Floristeria.stockProductos = stockProductos;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public int getId() {
        return id;
    }

    // Evitar duplicación de instancias
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
