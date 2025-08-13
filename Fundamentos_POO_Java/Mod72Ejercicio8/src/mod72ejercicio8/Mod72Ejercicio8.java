package mod72ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod72Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		int f0 = 0;
		int f1 = 1;
		int resultado, numero;
		
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
		}while (numero <= 0); 					//así si el usuario introduce un número negativo, continue pidiendo número hasta que se cumpla la condición
		
		for(int i = 0; i < numero; i++) {
			resultado = f0;						//se genera la sucesión de fibonacci a partir del número que introduce el usuario
			f0 = f1 + resultado;
			f1 = resultado;
			fibonacci.add(resultado);
		}
		System.out.println(fibonacci);

	}

}
