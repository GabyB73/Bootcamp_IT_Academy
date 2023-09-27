package N1Ejercicio3;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDirectorioImpreso {
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

        try {
            FileWriter writer = new FileWriter("resultado.txt"); // Crear un FileWriter para escribir en un archivo resultado.txt

            System.out.println("Árbol de directorios:");
            listarDirectorioRecursivo(directorio, "", writer); // Pasa el FileWriter como argumento

            writer.close(); // Cierra el archivo después de escribir
            System.out.println("Resultado guardado en resultado.txt");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void listarDirectorioRecursivo(File directorio, String espacio, FileWriter writer) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            Arrays.sort(archivos);
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
                    System.err.println("Error al escribir en el archivo: " + e.getMessage());
                }
            }
        }
    }

    private static String obtenerFechaModificacion(File archivo) {
        long timestamp = archivo.lastModified();
        return dateFormat.format(timestamp);
    }
}
