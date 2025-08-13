package ejercicio1marzo;

import java.util.Scanner;

public class Ejercicio1Marzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;
		byte edad;
		
		System.out.println("Introduzca su nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Introduzca su apellido");
		apellido = teclado.nextLine();
		
		System.out.println("Introduzca su edad");
		edad = teclado.nextByte();
		
		System.out.println("Su nombre es "+nombre+" , su apellido es "+apellido+" y tiene "+edad+" años.");
		
		teclado.close();
		
		

	}

}
