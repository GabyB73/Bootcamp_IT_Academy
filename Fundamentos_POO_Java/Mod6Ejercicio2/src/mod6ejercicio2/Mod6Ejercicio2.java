package mod6ejercicio2;

import java.util.Scanner;

public class Mod6Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numPersonas = 0;
        int totalEdades = 0;

        System.out.println("Introduzca el número de personas");
        numPersonas = sc.nextByte();

        totalEdades = pedirEdades(numPersonas); //Llamada a la función pedirEdades
        System.out.println("El total de edades es: " + totalEdades);

        int medias = calcularMedia(totalEdades, numPersonas); //Llamada a la función calcularMedia
        System.out.println("La media de las edades es: " + medias);

    }

    public static int pedirEdades(byte numPersonas) { 
        Scanner sc = new Scanner(System.in);
        int totalEdades = 0;
        int edad;

        for (int i = 1; i <= numPersonas; i++) { // Bucle for para pedir las edades
            System.out.println("Introduzca la edad de la persona " + i+ ":");
            edad = sc.nextInt();

            if (edad >= 0 && edad <= 120) { //Bucle if para controlar que la edad sea válida, sino se vuelve a pedir
                totalEdades = totalEdades + edad;
            } else {
                System.out.println("Introduzca una edad válida");
                i--; // Restar i para pedir de nuevo la misma persona
            }
        }

        return totalEdades;
    }

    public static int calcularMedia(int totalEdades, byte numPersonas) {
        int mediaEdades = totalEdades / numPersonas;
        return mediaEdades;
    }
}
