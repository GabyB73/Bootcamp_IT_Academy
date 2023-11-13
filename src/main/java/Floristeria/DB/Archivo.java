package Floristeria.DB;

import Floristeria.Client.Floristeria;
import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;

import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Archivo {
    static Scanner sc = new Scanner(System.in);
    static String ruta = escogerRuta();

    public static String escogerRuta() {
        /*System.out.println("Escoja un nombre para el archivo");
        String nombreArchivo = sc.nextLine();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setDialogTitle("Escoge la ruta del archivo");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        String ruta;
        int respuesta = fileChooser.showOpenDialog(fileChooser);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = new File(fileChooser.getSelectedFile().getAbsolutePath());
            ruta = archivoElegido.getAbsolutePath() + nombreArchivo;
        } else {
            System.out.println("No se ha seleccionado ningún archivo");
            ruta = "";
        }*/
        ruta = "stockProductos.txt";
        return ruta;
    }

}
