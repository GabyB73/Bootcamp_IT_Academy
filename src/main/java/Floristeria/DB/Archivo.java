package Floristeria.DB;

public class Archivo {
    static String rutaStock = "stockProductos.txt";
    static String rutaTickets = "tickets.txt";

    public static String getRutaStock() {
        return rutaStock;
    }

    public static void setRutaStock(String rutaStock) {
        Archivo.rutaStock = rutaStock;
    }

    public static String getRutaTickets() {
        return rutaTickets;
    }

    public static void setRutaTickets(String rutaTickets) {
        Archivo.rutaTickets = rutaTickets;
    }

    public static String getRuta() {
        return rutaStock;
    }
    public void setRuta(String ruta) {
        this.rutaStock = ruta;
    }

}
