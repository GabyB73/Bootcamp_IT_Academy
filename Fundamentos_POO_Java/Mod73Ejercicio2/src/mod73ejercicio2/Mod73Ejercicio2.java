package mod73ejercicio2;

import java.util.Scanner;

public class Mod73Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palabra;
		String palabraAlReves = "";
		int length;

		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();

		length = palabra.length() - 1;
		palabraAlReves = "";

		for (int i = length; i >= 0; i--) {
			palabraAlReves += palabra.charAt(i);

		}

		System.out.println(palabraAlReves);
	}

}
