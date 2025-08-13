package N1Ejercicio4;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;


public class LecturaArchivo {
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
            System.out.println("Por favor, proporciona la ruta del directorio que desea listar o la ruta de un archivo TXT que desea leer:");
            path = sc.nextLine();
        }

        File archivoODirectorio = new File(path);

        if (archivoODirectorio.exists()) {
            if (archivoODirectorio.isDirectory()) {
                listarDirectorio(archivoODirectorio);
            } else if (archivoODirectorio.isFile() && archivoODirectorio.getName().toLowerCase().endsWith(".txt")) {
                leerArchivoTXT(archivoODirectorio);
            } else {
                System.out.println("La ruta proporcionada no es válida o no es un archivo TXT.");
            }
        } else {
            System.out.println("La ruta proporcionada no existe.");
        }
    }

    private static void listarDirectorio(File directorio) {
        FileWriter writer = null; // Declarar FileWriter fuera del bloque try

        try {
            writer = new FileWriter("resultado.txt"); // Crear un FileWriter para escribir en un archivo resultado.txt

            System.out.println("Árbol de directorios:");
            listarDirectorioRecursivo(directorio, "", writer); // Pasa el FileWriter como argumento

            System.out.println("Resultado guardado en resultado.txt");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Cierra el archivo después de escribir
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo: " + e.getMessage());
            }
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

    private static void leerArchivoTXT(File archivo) {
        BufferedReader reader = null; //Declarar BufferedReader fuera del bloque try
        try {
            reader = new BufferedReader(new FileReader(archivo));
            String linea;
            System.out.println("Contenido del archivo " + archivo.getName() + ":");

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println("Error al cerrar el lector: " + e.getMessage());
            }
        }
    }
}

