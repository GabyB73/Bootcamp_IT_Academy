package Floristeria.Client;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;
import Floristeria.Products.Producto;

import java.util.List;

public class Floristeria {
    private static Floristeria instance;
    private String nombre;
    private List<Producto> stockProductos;
    private List<Ticket> tickets;
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

    public double getValorStock() {
        return valorStock;
    }

    // Método para imprimir los productos
    public void imprimirStock() {
        System.out.println("Productos en la floristería:");
        for (Producto producto : stockProductos) {
            System.out.println(producto.toString());
        }
    }

    // Método para imprimir el stock con cantidades
    public void imprimirStockConCantidades() {
        int countArboles = 0;
        int countFlores = 0;
        int countDecoraciones = 0;

        // Recorremos la lista de productos en el stock
        for (Producto producto : stockProductos) {
            // Utilizamos 'instanceof' para determinar el tipo de producto
            if (producto instanceof Arbol) {
                countArboles++;  // Incrementamos el contador de cada producto
            } else if (producto instanceof Flor) {
                countFlores++;
            } else if (producto instanceof Decoracion) {
                countDecoraciones++;
            }
        }
        // Imprimimos la cantidad de cada tipo de producto en el stock
        System.out.println("Cantidad de Árboles en stock: " + countArboles + "\n" +
                "Cantidad de Flores en stock: " + countFlores + "\n" +
                "Cantidad de Decoraciones en stock: " + countDecoraciones);
    }

    // Método para calcular el valor total de la Floristería
    public void imprimirValorTotalFloristeria() {
        valorStock = stockProductos.stream().mapToDouble(Producto::getPrecio).sum();
        System.out.println("Valor total de la floristería: " + valorStock + " euros");
    }

    // Evitar duplicación de instancias
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
