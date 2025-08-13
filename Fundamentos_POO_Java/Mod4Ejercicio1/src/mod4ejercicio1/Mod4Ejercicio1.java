package mod4ejercicio1;

import java.util.Scanner;

public class Mod4Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;
		byte edad;

		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();

		System.out.println("Introduce tu apellido");
		apellido = teclado.nextLine();

		System.out.println("Introduce tu edad");
		edad = teclado.nextByte();

		if (edad >= 18) {

			System.out.println("Tu nombre es " + nombre + " , tu apellido es " + apellido + " y eres MAYOR de edad");

		} else {

			System.out.println("Tu nombre es " + nombre + " , tu apellido es " + apellido + " y eres MENOR de edad");

		}

	}
}
