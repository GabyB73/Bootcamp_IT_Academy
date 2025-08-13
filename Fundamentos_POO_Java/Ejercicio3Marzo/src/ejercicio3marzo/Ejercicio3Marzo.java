package ejercicio3marzo;

import java.util.Scanner;

public class Ejercicio3Marzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3;
		
		System.out.println("Ingrese la nota 1: ");
		nota1 = teclado.nextInt();
		
		System.out.println("Ingrese la nota 2: ");
		nota2 = teclado.nextInt();
		
		System.out.println("Ingrese la nota 3: ");
		nota3 = teclado.nextInt();
		
		System.out.println("La media de sus notas es: " + (float)(nota1 + nota2 + nota3)/3);
		
	}

}
