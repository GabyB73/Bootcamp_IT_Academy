package Floristeria.DB;

import Floristeria.Client.Ticket;
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
    static File stockProductos = new File(Archivo.getRuta());
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

    private void checkEntrada(String linea) {
        ArbolFactory aF = new ArbolFactory();
        FlorFactory fF = new FlorFactory();
        DecoracionFactory dF = new DecoracionFactory();
        String patron = "(\\d+)\t([^\t]+)\t(\\d+\\.\\d+)€\t([\\d]+|[a-zA-Z]+|(true|false))";
        Pattern pattern = Pattern.compile(patron);

        Matcher match = pattern.matcher(linea);

        if (match.find()) {
            int id = Integer.parseInt(match.group(1));
            String nombre = match.group(2);
            double precio = Double.parseDouble(match.group(3));
            String tipoS = match.group(4);

            if (tipoS != null) {
                try {
                    double tipoD = Double.parseDouble(tipoS);
                    stockProductoLeido.add(aF.crearArbol(nombre, precio, tipoD));
                    mapaProductos.put("Arbol", mapaProductos.get("Arbol") + 1);
                } catch (NumberFormatException e) {
                    if (tipoS.equalsIgnoreCase("true") || tipoS.equalsIgnoreCase("false")) {
                        boolean tipoB = Boolean.parseBoolean(tipoS);
                        stockProductoLeido.add(dF.crearDecoracion(nombre, precio, tipoB));
                        mapaProductos.put("Decoracion", mapaProductos.get("Decoracion") + 1);
                    } else {
                        stockProductoLeido.add(fF.crearFlor(nombre, precio, tipoS));
                        mapaProductos.put("Flor", mapaProductos.get("Flor") + 1);
                    }
                }
            }
        }
    }
}
