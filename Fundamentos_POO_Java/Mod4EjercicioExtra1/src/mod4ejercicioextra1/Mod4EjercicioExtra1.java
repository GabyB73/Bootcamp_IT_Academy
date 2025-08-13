package mod4ejercicioextra1;

import java.util.Scanner;

public class Mod4EjercicioExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int dividendo, divisor, resultado;

		System.out.println("Introduce un número entero");
		dividendo = teclado.nextInt();

		System.out.println("Introduce otro número entero");
		divisor = teclado.nextInt();

		resultado = dividendo % divisor;

		if (divisor < 2 || divisor > 7) {

			System.out.println("Error!!!");

		} else if ((resultado == 0)) {

			System.out.println("El " + dividendo + " es múltiplo de " + divisor);

		} else {

			System.out.println("El " + dividendo + " no es múltiplo de " + divisor);
		}
	}
}
