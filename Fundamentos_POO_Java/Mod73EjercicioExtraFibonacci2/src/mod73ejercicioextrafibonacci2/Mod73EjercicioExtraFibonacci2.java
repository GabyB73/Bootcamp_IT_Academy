package mod73ejercicioextrafibonacci2;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod73EjercicioExtraFibonacci2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;

		do {
			System.out.println("Introduce un número");
			int numero = sc.nextInt();
			
			encontrado = esFibonacci(numero);

		} while (!encontrado);

	}

	public static boolean esFibonacci(int numero) {

		ArrayList<Integer> serie = new ArrayList<Integer>();

		boolean esFibonacci = false;
		int i = 2;
		serie.add(0);
		serie.add(1);

		if (numero == 0 || numero == 1) {
			esFibonacci = true;
		} else {
			while (serie.get(i - 1) < numero) {
				if (numero == serie.get(i)) {
					esFibonacci = true;
				}
				i++;
			}
		}
		return esFibonacci;
	}
}
