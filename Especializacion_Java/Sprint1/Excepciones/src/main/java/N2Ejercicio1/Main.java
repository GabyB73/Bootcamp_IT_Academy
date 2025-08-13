package N2Ejercicio1;
import java.util.Scanner;
import N2Ejercicio1.Entrada;
public class Main {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        byte edad = Entrada.leerByte("Introduce tu edad:");
        int numero = Entrada.leerInt("Introduce un número entero:");
        float precio = Entrada.leerFloat("Introduce el precio:");
        double saldo = Entrada.leerDouble("Introduce tu saldo:");
        char caracter = Entrada.leerChar("Introduce un carácter:");
        String nombre = Entrada.leerString("Introduce tu nombre:");
        boolean respuesta = Entrada.leerSiNo("¿Estás de acuerdo? (s/n):");

        // Ahora puedes imprimir los valores para verificar que se han leído correctamente
        System.out.println("Edad: " + edad);
        System.out.println("Número: " + numero);
        System.out.println("Precio: " + precio);
        System.out.println("Saldo: " + saldo);
        System.out.println("Carácter: " + caracter);
        System.out.println("Nombre: " + nombre);
        System.out.println("Respuesta: " + respuesta);
    }
}
