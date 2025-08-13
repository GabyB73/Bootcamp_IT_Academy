package mod71ejercicio4;

import java.util.Scanner;

public class Mod71Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Introduce un número");
		numero1 = sc.nextInt();

		System.out.println("Introduce otro número");
		numero2 = sc.nextInt();

		if ((numero1 < 0 && numero2 >= 0) || (numero1 >= 0 && numero2 < 0)) {

			System.out.println("Uno de los dos números es negativo");

		}
	}

}
