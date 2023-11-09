package Floristeria.Client;

import Floristeria.Products.Producto;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int id;
    private static int nextId = 0;
    private double total;
    List<Producto> productos;

    public Ticket() {
        id = nextId;
        nextId++;
        this.total = 0;
        this.productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        total += productos.stream().mapToDouble(Producto::getPrecio).sum();
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "Id=" + id +
                ", Total=" + getTotal() +
                ", Productos= " + productos.stream().count() + "\n" +
                productos +
                '}';
    }

}
