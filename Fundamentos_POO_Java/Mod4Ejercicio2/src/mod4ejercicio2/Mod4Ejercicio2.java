package mod4ejercicio2;

import java.util.Scanner;

public class Mod4Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		byte edad;

		System.out.println("Introduza su edad");
		edad = teclado.nextByte();

		if (edad <= 5) {

			System.out.println("Preescolar");

		} else if (edad >= 5 && edad <= 11) {
			System.out.println("Primaria");

		} else if (edad >= 12 && edad <= 15) {
			System.out.println("ESO");

		} else if (edad >= 16 && edad <= 17) {
			System.out.println("Bachillerato");

		} else if (edad >= 18) {
			System.out.println("FP O UNIVERSIDAD");

		}

	}

}
