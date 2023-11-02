package Floristeria.Client;

import Floristeria.Products.Producto;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int id = 0;
    private int nextId = 1;
    private double total;
    List<Producto> productos;

    public Ticket() {
        this.id = nextId++;
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
                "id=" + id +
                ", total=" + total +
                ", productos=" + productos +
                '}';
    }

}
