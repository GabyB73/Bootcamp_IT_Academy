package mod5ejercicioextra2;

import java.util.Scanner;

public class Mod5EjercicioExtra2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final char ASTERISCO = '*';
		byte altura;
		float base;

		System.out.println("Introduce la altura de la L: ");
		altura = sc.nextByte();
		base = altura / 2 + 1;

		for (int i = 1; i < altura; i++) {

			System.out.println(ASTERISCO);
		}

		for (int i = 0; i < base; i++) {

			System.out.print(ASTERISCO);
		}

	}
}