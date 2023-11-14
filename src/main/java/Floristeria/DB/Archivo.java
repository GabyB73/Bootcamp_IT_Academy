package Floristeria.DB;

public class Archivo {
    static String rutaStock = "stockProductos.txt";

    public static void setRuta(String rutaStock) {
        Archivo.rutaStock = rutaStock;
    }

    public static String getRuta() {
        return rutaStock;
    }

}
