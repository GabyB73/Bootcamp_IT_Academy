package Floristeria.DB;

import Floristeria.Factory.ArbolFactory;
import Floristeria.Factory.DecoracionFactory;
import Floristeria.Factory.FlorFactory;
import Floristeria.Products.Producto;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerArchivo implements Conexion {
    static List<Producto> stockProductoLeido = new ArrayList<>();
    static File stockProductos = new File(Archivo.ruta);
    static Map<String, Integer> mapaProductos = new HashMap<>();

    @Override
    public void conectar() {
    }

    public List<Producto> lectorStockP() {
        mapaProductos.put("Arbol", 0);
        mapaProductos.put("Flor", 0);
        mapaProductos.put("Decoracion", 0);

        try {
            BufferedReader br = new BufferedReader(new FileReader(stockProductos));
            String linea;

            while ((linea = br.readLine()) != null) {
                checkEntrada(linea);
            }
            br.close();
        } catch (IOException ioe) {
            //noinspection CallToPrintStackTrace
            ioe.printStackTrace();
        }
        return stockProductoLeido;
    }

    public static Map<String, Integer> getMapaProductos() {
        return mapaProductos;
    }

    private void checkEntrada(String linea) {
        ArbolFactory aF = new ArbolFactory();
        FlorFactory fF = new FlorFactory();
        DecoracionFactory dF = new DecoracionFactory();
        String patron = "(\\d+)\t([^\t]+)\t(\\d+\\.\\d+)€\t([a-zA-Z0-9]+)";
        Pattern pattern = Pattern.compile(patron);
        Matcher match = pattern.matcher(linea);

        if (match.find()) {
            int id = Integer.parseInt(match.group(1));
            String nombre = match.group(2);
            double precio = Double.parseDouble(match.group(3));
            String tipoS = match.group(4);
            String estoEs;

            try {
                double tipoD = Double.parseDouble(match.group(4));
                estoEs = "double";
            } catch (NumberFormatException e){
                boolean tipoB = Boolean.parseBoolean(match.group(4));
                estoEs = "boolean";
            }

            switch (estoEs) {
                case "double" :
                    stockProductoLeido.add(aF.crearArbol(nombre, precio, Double.parseDouble(tipoS)));
                    mapaProductos.put("Arbol", mapaProductos.get("Arbol") + 1);
                    break;
                case "String" :
                    stockProductoLeido.add(fF.crearFlor(nombre, precio, tipoS));
                    mapaProductos.put("Flor", mapaProductos.get("Flor") + 1);
                    break;
                case "boolean" :
                    stockProductoLeido.add(dF.crearDecoracion(nombre, precio, Boolean.parseBoolean(tipoS)));
                    mapaProductos.put("Decoracion", mapaProductos.get("Decoracion") + 1);
                    break;
                default:
                    System.out.println("Tipo no reconocido");
            }
        }
    }
}
