package mod73ejercicioextrafibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod73EjercicioExtraFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // idea: comparar numero con i dentro del array para saber si está

		ArrayList<Integer> fibonacci = new ArrayList<Integer>();

		int f0 = 0;
		int f1 = 1;
		int resultado;
		int numero;

		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();

		} while (numero <= 0);

		for (int i = 0; i <= numero; i++) {
			resultado = f0;
			f0 = f1 + resultado;
			f1 = resultado;
			fibonacci.add(resultado);

		}

		System.out.println(fibonacci);

	}
}
