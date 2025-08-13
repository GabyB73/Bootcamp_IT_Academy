package mod71ejercicio7;

import java.util.Scanner;

public class Mod71Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String resultado = " ";

		System.out.println("Introduzca el tamaño");
		int size = sc.nextByte();
		sc.nextLine();

		System.out.println("Introduzca el caracter");
		char caracter = sc.nextLine().charAt(0);

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				resultado += caracter + " ";
				System.out.print(caracter + " ");

			}
			resultado += "\n";
			System.out.println();
		}

	}
}
