package mod5ejercicioextra1;

import java.util.Scanner;

public class Mod5EjercicioExtra1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numUsuario = 0;

		int numRandom = (int) Math.ceil((Math.random() * 500));
		System.out.println(numRandom);

		while (numUsuario != numRandom) {

			System.out.println("Introduce un número entre el 1 y el 500");
			numUsuario = sc.nextInt();

			if (numUsuario != numRandom) {
				int diferencia = numUsuario - numRandom;

				if (diferencia >= 50) {
					System.out.println("Frío, Frío, tu número es más grande");

				} else if (diferencia <= -50) {
					System.out.println("Frío, Frío, tu número es más pequeño");

				} else if (diferencia >= 15 && diferencia < 50) {
					System.out.println("Tibio, Tibio, tu número es más grande");

				} else if (diferencia <= -15 && diferencia > -50) {
					System.out.println("Tibio, Tibio, tu número es más pequeño");

				} else if (diferencia > 0 && diferencia < 15) {
					System.out.println("Caliente, Caliente, tu número es más grande");

				} else if (diferencia < 0 && diferencia > -15) {
					System.out.println("Caliente, Caliente, tu número es más pequeño");

				}

			}
		}
		System.out.println("Enhorabuena! Has acertado!");

	}

}
