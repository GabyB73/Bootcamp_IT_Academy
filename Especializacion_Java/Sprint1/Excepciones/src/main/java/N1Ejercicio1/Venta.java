package N1Ejercicio1;
import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> productos;
    private float precioTotalVentas;

    public Venta(ArrayList<Producto> productos, float precioTotalVentas) {
        this.productos = productos;
        this.precioTotalVentas = precioTotalVentas;
    }

    public ArrayList<Producto> getProductos() {

        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {

        this.productos = productos;
    }

    public float getPrecioTotalVentas() {

        return precioTotalVentas;
    }

    public void setPrecioTotalVentas(float precioTotalVentas) {

        this.precioTotalVentas = precioTotalVentas;
    }

    public void calcularTotal() throws VentaVaciaException {
        if (productos.isEmpty()) {
            throw new VentaVaciaException("Para hacer una venta primero debes añadir productos");
        } else {
            precioTotalVentas = 0.0f;
            for (Producto producto : productos) {
                precioTotalVentas += producto.getPrecio();
            }
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}




