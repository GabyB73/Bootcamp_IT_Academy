package Floristeria.DB;

import Floristeria.Products.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirArchivo implements Conexion{

    private static File stockProductos;
    @Override
    public void conectar() {
        try {
            stockProductos = new File(Archivo.ruta);
            if (stockProductos.createNewFile()){
                System.out.println("BBDD .txt creada: " + stockProductos.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void guardarStock(List<Producto> stock){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(stockProductos, false));
            for (Producto p : stock) {
                bw.write(p.toString());
            }
            bw.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
