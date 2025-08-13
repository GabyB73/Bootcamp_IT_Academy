package mod71ejercicio3;

import java.util.Scanner;

public class Mod71Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Indica un número entero: ");
		numero = sc.nextInt();

		if (esPar(numero)) {

			System.out.println("El número " + numero + " es par");

		} else {

			System.out.println("El número " + numero + " es impar");

		}
	}

	static boolean esPar(int numero) {
		boolean resultado = false;
		resultado = (numero % 2 == 0) ? true : false;	//operador ternario
		return resultado;

	}

}
