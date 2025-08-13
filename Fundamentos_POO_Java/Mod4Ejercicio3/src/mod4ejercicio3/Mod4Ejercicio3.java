package mod4ejercicio3;

import java.util.Scanner;

public class Mod4Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		byte edad;
		String respuestaTitulo, respuestaParo;

		System.out.println("Introduce tu edad");
		edad = teclado.nextByte();

		teclado.nextLine();

		System.out.println("¿Tienes título universitario? (responde si o no)");
		respuestaTitulo = teclado.nextLine().toLowerCase();

		if (respuestaTitulo.equals("si")) {
			respuestaTitulo = "si";
		}

		System.out.println("¿Estás en el Paro? (responde si o no)");
		respuestaParo = teclado.nextLine().toLowerCase();

		if (respuestaParo.equals("si")) {
			respuestaParo = "si";
		}

		if ((edad >= 18 && respuestaTitulo.equals("si")) || respuestaParo.equals("si")) {

			System.out.println("Enhorabuena tienes tu beca!");

		} else

			System.out.println("Lo sentimos, no cumples con los requisitos");

	}
}