package mod6ejercicio1;

import java.util.Scanner;

public class Mod6Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int resultado = 0;

		System.out.println("Introduzca un número");
		int numero1 = sc.nextInt();

		System.out.println("Introduzca otro número");
		int numero2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca el operador (+,-,*,/,%)");
		char operador = sc.nextLine().charAt(0);

		switch (operador) {
		case '+':
			resultado = sumar(numero1, numero2);
			System.out.println("El resultado de la suma es: " + resultado);
			break;
		case '-':
			resultado = restar(numero1, numero2);
			System.out.println("El resultado de la resta es: " + resultado);
			break;

		case '*':
			resultado = multiplicar(numero1, numero2);
			System.out.println("El resultado de la multiplicación es: " + resultado);
			break;
		case '/':
			dividir(numero1, numero2);
			break;
		case '%':
			resultado = modulo(numero1, numero2);
			System.out.println("El resultado del modulo es: " + resultado);
			break;
		default:
			System.out.println("El operador deber ser alguno de los dismonibles (+,-,*,/,%)");

		}
	}

	public static int sumar(int numero1, int numero2) {
		int resultado;
		resultado = numero1 + numero2;
		return resultado;
	}

	public static int restar(int numero1, int numero2) {
		int resultado;
		resultado = numero1 - numero2;
		return resultado;
	}

	public static int multiplicar(int numero1, int numero2) {
		int resultado;
		resultado = numero1 * numero2;
		return resultado;
	}

	public static void dividir(int numero1, int numero2) {
		float resultado;

		if (numero2 == 0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			resultado = (float) numero1 / numero2;
			System.out.println("El resultado de la división es: " + resultado);
		}
	}

	public static int modulo(int numero1, int numero2) {
		int resultado;
		resultado = numero1 % numero2;
		return resultado;
	}

}
