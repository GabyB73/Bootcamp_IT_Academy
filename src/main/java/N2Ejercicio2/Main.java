package N2Ejercicio2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        TreeSet<Restaurante> restaurantes = new TreeSet<Restaurante>();

        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    System.out.println("Usted ha salido de la aplicación");
                    break;
                case 1:
                    introducirRestaurante(restaurantes);
                    break;
                case 2:
                    mostrarRestaurantes(restaurantes);
                    break;
                default:
                    System.out.println("La opción no es válida, introduzca 0 o 1");
            }
        } while (opcion != 0);
    }
    public static byte menu() {
        byte opcion = 0;
        final byte MINIMO = 0;
        final byte MAXIMO = 2;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("0. Salir de la aplicación");
            System.out.println("1. Introducir un nuevo restaurante");
            System.out.println("2. Mostrar restaurantes");

            opcion = sc.nextByte();
            sc.nextLine(); // Consumir el carácter de nueva línea
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }
    private static void introducirRestaurante(TreeSet<Restaurante> restaurantes) {
        System.out.println("Introduzca el nombre del restaurante: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca una puntuación: ");
        int puntuacion = sc.nextInt();
        sc.nextLine();

        Restaurante restaurante = new Restaurante(nombre, puntuacion);

        if (restaurantes.contains(restaurante)) {
            System.out.println("Ya existe un restaurante con este nombre y puntuación");
        } else {
            restaurantes.add(restaurante);
            System.out.println(restaurante); // Utilizar el método toString() de Restaurante
        }
    }
    private static void mostrarRestaurantes(TreeSet<Restaurante> restaurantes) {
        System.out.println("Restaurantes ordenados por nombre y puntuación:");
        for (Restaurante restaurante : restaurantes) {
            System.out.println(restaurante);
        }
    }
}
