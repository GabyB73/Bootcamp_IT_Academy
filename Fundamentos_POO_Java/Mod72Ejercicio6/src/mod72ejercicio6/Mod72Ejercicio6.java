package mod72ejercicio6;

import java.util.Scanner;

public class Mod72Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		boolean esPrimo = false;

		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();

			esPrimo = calcularPrimo(numero); // llamo a la función para calcular los numeros primos

			if (esPrimo) {
				System.out.println("¡Exacto el número " + numero + " es primo!");
			} else {
				System.out.println("El número " + numero + " no es primo");
			}

		} while (!esPrimo);
	}

	public static boolean calcularPrimo(int numero) {
		boolean esPrimo = true;
		int i = 2;

		if (numero > 1) {
			while (esPrimo && i < numero) {
				if (numero % i == 0) {
					esPrimo = false;
				}
				i++;
			}
		} else {
			esPrimo = false;
		}
		return esPrimo;
	}
}
