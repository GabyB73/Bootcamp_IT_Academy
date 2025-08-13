package N1Ejercicio2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDirectorioConRecursividad {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static Scanner sc = new Scanner(System.in);
    File file;
    public static void main(String[] args) {
        String path;

        if (args.length == 1) {
            // Si se proporciona un argumento de línea de comandos, toma la ruta desde los argumentos.
            path = args[0];
        } else {
            // Si no se proporciona argumento, solicita la ruta al usuario.
            System.out.println("Por favor, proporciona la ruta del directorio que desea listar:");
            path = sc.nextLine();
        }

        File directorio = new File(path);

        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta proporcionada no es un directorio válido.");
            return;
        }

        System.out.println("Árbol de directorios:");
        listarDirectorioRecursivo(directorio, "");
    }

    private static void listarDirectorioRecursivo(File directorio, String espacio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            Arrays.sort(archivos);
            for (File archivo : archivos) {
                System.out.print(espacio);
                if (archivo.isDirectory()) {
                    System.out.println("D: " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")");
                    listarDirectorioRecursivo(archivo, espacio + "  "); // Llamada recursiva para listar el contenido del subdirectorio
                } else {
                    System.out.println("F: " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")");
                }
            }
        }
    }

    private static String obtenerFechaModificacion(File archivo) {
        long timestamp = archivo.lastModified();
        return dateFormat.format(timestamp);
    }
}
