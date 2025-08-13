package mod72ejercicio4;

import java.util.Scanner;

public class Mod72Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		int numero = sc.nextInt();

		calcularFactorial(numero);
	}

	public static void calcularFactorial(int numero) {

		int factorial = 1;

		if (numero < 0) {
			System.out.println("El factorial no se puede calcular");
		} else {
			for (int i = 1; i <= numero; i++) {
				factorial = factorial * i;
			}
			System.out.println("El factorial de " + numero + " es: " + factorial);
		}
	}

}
