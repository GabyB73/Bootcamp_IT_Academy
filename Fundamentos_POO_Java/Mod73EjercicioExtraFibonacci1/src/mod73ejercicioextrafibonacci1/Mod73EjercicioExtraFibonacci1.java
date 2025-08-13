package mod73ejercicioextrafibonacci1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod73EjercicioExtraFibonacci1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean encontrado = false; // variable booleana para controlar el bucle do-while

		do {
			System.out.println("Introduce un número");
			int numero = sc.nextInt();

			ArrayList<Integer> fibonacciArray = fibonacci(numero); // llamo a la funcion y genero el ArrayList de la sucesion con el numero del usuario

			if (fibonacciArray.contains(numero)) {		//esto está bien, pero tenía que hacerlo con lógica
				System.out.println("¡Exacto! El número " + numero + " está en la sucesión de Fibonacci.");
				
				encontrado = true; // actualizo la variable booleana a true para salir del bucle
			}
		} while (!encontrado); // condición del bucle: mientras no se haya encontrado el número en la sucesión de Fibonacci


	}

	public static ArrayList<Integer> fibonacci(int numero) {
		ArrayList<Integer> fibonacciArray = new ArrayList<Integer>();
		for (int i = 0; i < numero; i++) {
			if (i > 1) {
				fibonacciArray.add(fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2));
			} else if (i == 0 || i == 1) {
				fibonacciArray.add(i);
			}
		}
		return fibonacciArray;
	}
}
