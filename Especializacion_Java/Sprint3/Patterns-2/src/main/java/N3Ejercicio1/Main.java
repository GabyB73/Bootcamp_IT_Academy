package N3Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear un artículo con precio en dólares
        Articulo articulo = new Articulo("Laptop", 1000.0, "USD");
        Articulo articulo1 = new Articulo("Tablet", 550.0, "USD");
        Articulo articulo2 = new Articulo("Smartphone", 930.50, "USD");

        // Definir la moneda de origen
        String monedaOrigen = "EUR";  // Puedo cambiar esto según necesidades

        // Crear un conversor de moneda
        ConversorDeMoneda conversor = new ConversorDeMonedaImpl(monedaOrigen);

        // Mostrar el precio en diferentes monedas
        articulo.mostrarPrecio(conversor, "EUR");
        articulo.mostrarPrecio(conversor, "USD");
        articulo1.mostrarPrecio(conversor, "EUR");
        articulo2.mostrarPrecio(conversor, "USD");

    }
}
