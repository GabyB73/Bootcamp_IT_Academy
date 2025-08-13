package mod3ejercicio3;

import java.util.Scanner;

public class Mod73Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase;
		String palindromo;
		int i = 0;
		int length;
		boolean esPalindromo = true;

		System.out.println("Introduce una frase");
		frase = sc.nextLine();

		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		length = frase.length()-1;
		int size = frase.length();

		while (esPalindromo && i < size) {
			if (frase.charAt(i) != frase.charAt(length - i)) {
				esPalindromo = false;
			}
			i++;
		}
		if (esPalindromo) {
			palindromo = "La frase es un palíndromo";
		} else {
			palindromo = "La frase no es un palíndromo";
		}
		System.out.println(palindromo);

	}

}
