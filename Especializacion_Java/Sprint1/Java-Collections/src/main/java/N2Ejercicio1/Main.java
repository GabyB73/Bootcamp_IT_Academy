package N2Ejercicio1;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();

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

            opcion = sc.nextByte();
            sc.nextLine(); // Consumir el carácter de nueva línea
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida: 0 / 1");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }
    private static void introducirRestaurante(HashSet<Restaurante> restaurantes) {
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
}

