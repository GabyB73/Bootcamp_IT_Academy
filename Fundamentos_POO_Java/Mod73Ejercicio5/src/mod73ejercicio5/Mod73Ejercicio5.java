package mod73ejercicio5;

import java.util.Scanner;

public class Mod73Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase = "";

		System.out.println("Escribe una frase");
		frase = sc.nextLine();

		if (esMayusculas(frase)) {
			System.out.println("La frase está toda en mayúsculas");
		} else if (esMinusculas(frase)) {
			System.out.println("La frase está toda en minúsculas");
		} else {
			System.out.println("La frase está en mayúsculas y minúsculas");
		}

	}

	public static boolean esMayusculas(String frase) {
		return frase.equals(frase.toUpperCase());
	}

	public static boolean esMinusculas(String frase) {
		return frase.equals(frase.toLowerCase());
	}

}
