package N3Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        leerCVS("ArchivoCSV.csv", personas);

        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    System.out.println("Salir de la aplicación");
                    break;
                case 1:
                    introducirPersona(personas);
                    break;
                case 2:
                    mostrarPorNombreAscendente(personas);
                    break;
                case 3:
                    mostrarPorNombreDescendente(personas);
                    break;

                case 4:
                    mostrarPorApellidoAscendente(personas);
                    break;

                case 5:
                    mostrarPorApellidoDescendente(personas);
                    break;

                case 6:
                    mostrarPorDniAscendente(personas);
                    break;

                case 7:
                    mostrarPorDniDescendente(personas);
                    break;

                default:
                    System.out.println("La opción no es válida");

            }
        } while (opcion != 0);
    }
    public static byte menu() {
        byte opcion = 0;
        final byte MINIMO = 0;
        final byte MAXIMO = 7;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("1. Introducir una persona");
            System.out.println("2. Mostrar a las personas ordenadas por nombre (AZ)");
            System.out.println("3. Mostrar a las personas ordenadas por nombre (ZA)");
            System.out.println("4. Mostrar a las personas ordenadas por apellido (AZ)");
            System.out.println("5. Mostrar a las personas ordenadas por apellido (ZA)");
            System.out.println("6. Mostrar a las personas ordenadas por DNI (1-9)");
            System.out.println("7. Mostrar a las personas ordenadas por DNI (9-1)");
            System.out.println("0. Salir de  la aplicación");

            opcion = sc.nextByte();
            sc.nextLine(); // Consumir el carácter de nueva línea
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }
    public static void introducirPersona(ArrayList<Persona> personas){
        System.out.println("Introduzca el nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el apellido");
        String apellido = sc.nextLine();
        System.out.println("Introduzca el dni");
        String dni = sc.nextLine();

        Persona persona = new Persona(nombre, apellido, dni);
        personas.add(persona);

    }
    public static void mostrarPorNombreAscendente(ArrayList<Persona> personas) {
        // Ordenar la lista en orden ascendente utilizando el comparador personalizado
        Collections.sort(personas, new NombreAZComparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void mostrarPorNombreDescendente(ArrayList<Persona> personas) {
        // Ordenar la lista en orden descendente utilizando el comparador personalizado
        Collections.sort(personas, new NombreZAComparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void mostrarPorApellidoAscendente(ArrayList<Persona> personas){
        // Ordenar la lista en orden ascendente utilizando el comparador personalizado
        Collections.sort(personas, new ApellidoAZComparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void mostrarPorApellidoDescendente(ArrayList<Persona> personas) {
        // Ordenar la lista en orden descendente utilizando el comparador personalizado
        Collections.sort(personas, new ApellidoZAComparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void mostrarPorDniAscendente(ArrayList<Persona> personas){
        // Ordenar la lista en orden ascendente utilizando el comparador personalizado
        Collections.sort(personas, new Dni1_9Comparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void mostrarPorDniDescendente(ArrayList<Persona> personas) {
        // Ordenar la lista en orden descendente utilizando el comparador personalizado
        Collections.sort(personas, new Dni9_1Comparator());

        // Imprimir la lista ordenada
        System.out.println("____Nombre___Apellido___DNI___");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public static void leerCVS(String nombreArchivo, ArrayList<Persona> personas){

        try{
            //Código que puede lanzar excepciones
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader lectorLinea = new BufferedReader(lectorArchivo);

            String linea;

            while ((linea = lectorLinea.readLine()) != null){

                // Dividir la línea en nombre, apellido y dni usando split()
                String[] partes = linea.split(",");
                if(partes.length == 3){
                    String nombre = partes[0];
                    String apellido = partes[1];
                    String dni = partes[2];

                    Persona persona = new Persona(nombre, apellido, dni);
                    personas.add(persona);
                    //System.out.println(persona); //Para verificar que se imprime el fichero correctamente
                }
            }
            //Cerrar el lector de archivo después de terminar de leer
            lectorLinea.close();
            lectorArchivo.close();

        }catch (IOException e){
            // Captura y manejo de excepciones de E/S (IOException)
            e.printStackTrace();
        }
    }
}

