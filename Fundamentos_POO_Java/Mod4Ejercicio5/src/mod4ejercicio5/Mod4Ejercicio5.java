package mod4ejercicio5;

import java.util.Scanner;

public class Mod4Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		float resultado = 0;

		System.out.println("Introduce un número");
		float num1 = teclado.nextFloat();

		System.out.println("Introduce otro numero");
		float num2 = teclado.nextFloat();

		teclado.nextLine();

		System.out.println("Elige un operador: +, -, *, /");
		String operador = teclado.nextLine();
		char ope = operador.charAt(0);

		switch (ope) {
		case '+':
			System.out.println("El resultado de la suma es: " + (num1 + num2));
			break;
		case '-':
			System.out.println("El resultado de la resta es: " + (num1 - num2));
			break;
		case '*':
			System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
			break;
		case '/':
			if (num2 != 0) {
				System.out.println("El resultado de la división es: " + (num1 / num2));
			} else {
				System.out.println("El divisor no puede ser cero");
			}

			break;
		default:
			System.out.println("Esta operación no es válida");

		}

	}
}
