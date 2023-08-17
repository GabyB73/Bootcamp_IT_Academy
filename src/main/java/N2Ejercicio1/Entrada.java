package N2Ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    //Clase para controlar las distintas excepciones

    static Scanner sc = new Scanner(System.in);

    public static byte leerByte(String mensaje) {

        byte dato = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                dato = sc.nextByte();
                entradaValida = true; // Si no hay excepción, la entrada es válida
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un byte válido.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);


        return dato;
    }

    public static int leerInt(String mensaje) {

        int dato = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                dato = sc.nextInt();
                entradaValida = true; // Si no hay excepción, la entrada es válida
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número entero.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);


        return dato;

    }

    public static float leerFloat(String mensaje) {

        float dato = 0.0f;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                dato = sc.nextFloat();
                entradaValida = true; // Si no hay excepción, la entrada es válida
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número con decimal usando la coma.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);


        return dato;
    }

    public static double leerDouble(String mensaje) {

        double dato = 0.0d;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                dato = sc.nextDouble();
                entradaValida = true; // Si no hay excepción, la entrada es válida
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un número con decimal usando la coma.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);

        sc.nextLine(); // Limpia el búfer del Scanner
        return dato;

    }

    public static char leerChar(String mensaje) {

        char dato = ' ';
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                String entrada = sc.nextLine();

                if (entrada.length() == 1) {
                    dato = entrada.charAt(0);
                    entradaValida = true;
                } else {
                    System.out.println("Error de formato. Introduce un solo carácter.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduce un solo carácter.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);

        return dato;

    }

    public static String leerString(String mensaje) {

        String dato = " ";
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                dato = sc.nextLine();

                // Verificar si la entrada contiene solo letras usando una expresión regulada
                if (!dato.matches("^[a-zA-Z]+$")) {
                    throw new Exception();
                }

                entradaValida = true; // Si no hay excepción, la entrada es válida
            } catch (Exception e) {
                System.out.println("Error de formato. Introduce solo letras.");
            }
        } while (!entradaValida);

        return dato;
    }

    public static boolean leerSiNo(String mensaje) {

        boolean dato = true;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje);
                String entrada = sc.next().toLowerCase(); // Leer la entrada y convertirla a minúsculas

                if (entrada.equals("s")) {
                    dato = true;
                    entradaValida = true;
                } else if (entrada.equals("n")) {
                    dato = false;
                    entradaValida = true;
                } else {
                    System.out.println("Error de formato. Introduce 'S' para SI o 'N' para NO.");
                }
            } catch (Exception e) {
                System.out.println("Error de formato. Introduce 'S' para SI o 'N' para NO.");
                sc.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);

        sc.nextLine(); // Limpia el búfer del Scanner después de leer la entrada
        return dato;

    }
}
