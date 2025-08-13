package mod72ejercicio5;

import java.util.Scanner;

public class Mod72Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduce un número");
		numero = sc.nextInt();

		if (calcularPrimo(numero)) {		//llamo a la función
			System.out.println("El número " + numero + " es primo");
		} else {
			System.out.println("El número " + numero + " no es primo");
		}
	}

	public static boolean calcularPrimo(int numero) {		//creo la función
		boolean esPrimo = true;
		int i = 2;		//empiezo por 2 porque todos los numeros son divisibles por 1!!!

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
