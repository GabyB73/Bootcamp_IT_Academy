package N2Ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Properties;

public class Main {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static Scanner sc = new Scanner(System.in);
    File file;

    public static void main(String[] args) {

        File directorio = null; // Declaración de la variable directorio como un objeto File

        Properties propiedades = new Properties();

        try (FileInputStream archivoPropiedades = new FileInputStream("configuracion.properties")) {
            propiedades.load(archivoPropiedades);

            // Leer valores de configuración
            String directorioALeer = propiedades.getProperty("directorio_a_leer");
            String archivoTxtResultante = propiedades.getProperty("archivo_txt_resultante");

            // Utilizar los valores de configuración
            System.out.println("Directorio a leer: " + directorioALeer);
            System.out.println("Archivo TXT resultante: " + archivoTxtResultante);

            // Asignar el valor del directorio como un objeto File
            directorio = new File(directorioALeer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (directorio != null && directorio.exists() && directorio.isDirectory()) {
            FileWriter writer = null;
            try {
                writer = new FileWriter("resultado.txt");
                System.out.println("Árbol de directorios:");
                listarDirectorioRecursivo(directorio, "", writer);
                System.out.println("Resultado guardado en resultado.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(writer != null){
                        writer.close(); //Cierra el archivo después de escribir
                    }
                }catch (IOException e){
                    System.err.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        } else {
            System.out.println("La ruta proporcionada no es un directorio válido.");
        }
    }

    private static void listarDirectorioRecursivo(File directorio, String espacio, FileWriter writer) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            java.util.Arrays.sort(archivos);
            for (File archivo : archivos) {
                try {
                    writer.write(espacio);
                    if (archivo.isDirectory()) {
                        writer.write("D: " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")\n");
                        listarDirectorioRecursivo(archivo, espacio + "  ", writer);
                    } else {
                        writer.write("F: " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static String obtenerFechaModificacion(File archivo) {
        long timestamp = archivo.lastModified();
        return dateFormat.format(timestamp);
    }

}
