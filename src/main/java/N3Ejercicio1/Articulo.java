package N3Ejercicio1;

public class Articulo {
    private String nombre;
    private double precio;
    private String moneda;

    // Constructor que toma nombre, precio y moneda como parámetros
    public Articulo(String nombre, double precio, String moneda) {
        this.nombre = nombre;
        this.precio = precio;
        this.moneda = moneda;
    }

    // Método para obtener el precio convertido utilizando el ConversorDeMoneda
    public void mostrarPrecio(ConversorDeMoneda conversor, String monedaDestino) {
        double precioConvertido = conversor.convertirMoneda(precio, monedaDestino);
        System.out.println("Precio de " + nombre + " en " + monedaDestino + ": " + precioConvertido);
    }
}
