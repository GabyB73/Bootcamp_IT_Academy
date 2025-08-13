package N1Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDirectorio {

    /*Crea una clase que liste alfabéticamente el contenido de un directorio recibido por parámetro.*/
    File file;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca la dirección del directorio que desea listar: ");
        String path = sc.nextLine();

        ListaDirectorio listaDirectorio = new ListaDirectorio();
        listaDirectorio.listarContenido(path);

    }

    private void listarContenido(String path) {
        file = new File(path);

        try {
            if (!file.exists() || !file.isDirectory()) {
                System.out.println("La ruta proporcionada no es un directorio válido.");
                return;
            }

            System.out.println("Contenido del directorio:");
            System.out.println(file.getAbsolutePath() + "\r\n");
            String[] files = file.list();

            if (files == null || files.length == 0) {
                System.out.println("El directorio está vacío");
            } else {
                Arrays.sort(files);
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i]);
                }
            }
        } catch (SecurityException e) {
            System.err.println("Error al listar el directorio: " + e.getMessage());
        }
    }
}


