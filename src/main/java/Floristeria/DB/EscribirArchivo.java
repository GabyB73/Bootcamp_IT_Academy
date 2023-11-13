package Floristeria.DB;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;
import Floristeria.Products.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirArchivo implements Conexion {

    private static File stockProductos;

    @Override
    public void conectar() {
        try {
            stockProductos = new File(Archivo.ruta);
            if (stockProductos.createNewFile()) {
                System.out.println("BBDD .txt creada: " + stockProductos.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void guardarStock(List<Producto> stock) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(stockProductos, false));
            guardarArbol(stock, bw);
            guardarFlor(stock, bw);
            guardarDecoracion(stock, bw);

            /*for (Producto p : stock) {
                bw.write(p.toString());
            }*/
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    private void guardarArbol(List<Producto> stock, BufferedWriter bw) throws IOException {
        bw.write("Arbol:\nId\tNombre\tPrecio\tAltura\n");
        for (Producto p : stock){
            if (p instanceof Arbol){
                bw.write(p.toString());
            }
        }
    }

    private void guardarFlor(List<Producto> stock, BufferedWriter bw) throws IOException {
        bw.write("Flor:\nId\tNombre\tPrecio\tColor\n");
        for (Producto p : stock){
            if (p instanceof Flor){
                bw.write(p.toString());
            }
        }
    }

    private void guardarDecoracion(List<Producto> stock, BufferedWriter bw) throws IOException {
        bw.write("Decoracion:\nId\tNombre\tPrecio\tEsMadera?\n");
        for (Producto p : stock){
            if (p instanceof Decoracion){
                bw.write(p.toString());
            }
        }
    }
}
