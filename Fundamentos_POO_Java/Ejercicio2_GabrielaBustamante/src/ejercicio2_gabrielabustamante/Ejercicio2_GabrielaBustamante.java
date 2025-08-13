package ejercicio2_gabrielabustamante;

import java.util.Scanner;

public class Ejercicio2_GabrielaBustamante {

	public static void main(String[] args) {
		
		//Fer un programa on l’usuari ha d’introduïr números fins que un número introduit sigui parell i positiu a la vegada.
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
							

			
		}while(!esPar(numero) && numero > 0);
			System.out.println("El número es par y positivo");
		
					
	}
	
	static boolean esPar(int numero) {
		boolean resultado = false;
		resultado = (numero % 2 == 0) ? true : false;
		return resultado;
		
	}

}
