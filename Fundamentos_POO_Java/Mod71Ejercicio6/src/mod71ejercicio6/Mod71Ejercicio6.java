package mod71ejercicio6;

import java.util.Scanner;

public class Mod71Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte numero;

		System.out.println("Introduce un numero del 1 al 10");
		numero = sc.nextByte();

		if (numero > 0 && numero <= 10) {

			for (int i = 1; i <= 10; i++) {

				System.out.println(numero + "*" + i + "=" + numero * i);

			}

		} else {
			System.out.println("Número fuera de rango");
		}
	}
}
