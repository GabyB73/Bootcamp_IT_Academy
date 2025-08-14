package Floristeria.Products;

public abstract class Producto{
    protected String nombre;
    protected double precio;
    protected int id;
    private static int nextId = 0;

    // Constructor para leer archivo
    public Producto (int id, String nombre, double precio, String tipo){
        super();
        id = nextId;
        nextId++;
    }
    public Producto(String nombre, double precio) {
        id = nextId;
        nextId++;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getId() {
        return id;
    }
}
