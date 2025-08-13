package mod72ejercicio3;

import java.util.Scanner;

public class Mod72Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char asterisco = '*';
		String texto = "";
		byte numero;

		System.out.println("Introduce un número");
		numero = sc.nextByte();

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				texto += asterisco;
			}
			texto += "\n";

		}
		
		for (int i = numero-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				texto += asterisco;
			}
			texto += "\n";

		}
		System.out.println(texto);

	}
}
