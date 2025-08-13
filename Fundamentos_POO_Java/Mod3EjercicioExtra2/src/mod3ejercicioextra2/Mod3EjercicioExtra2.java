package mod3ejercicioextra2;

import java.util.Scanner;

public class Mod3EjercicioExtra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int i, numero, varint;

		System.out.println("Ingresa un numero entero");
		numero = teclado.nextInt();

		varint = (numero < 10) ? numero : (varint = 1);

		for (i = 1; i <= 10; i++) {

			System.out.println(varint + "*" + i + "=" + varint * i);

		}
	}
}