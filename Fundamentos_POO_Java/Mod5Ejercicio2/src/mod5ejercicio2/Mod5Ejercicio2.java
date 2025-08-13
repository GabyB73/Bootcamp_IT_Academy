package mod5ejercicio2;

import java.util.Scanner;

public class Mod5Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		byte i;
		int suma = 0;

		System.out.println("Introduce un número entero");
		byte numero1 = teclado.nextByte();

		System.out.println("Introduce otro número entero");
		byte numero2 = teclado.nextByte();

		if (numero1 == numero2) {
			System.out.println("Los números no pueden ser iguales");

		} else {
			if (numero1 > numero2) { // si numero1 es mayor que numero2, intercambio sus valores (num1=10 ; num2=5)
				byte auxiliar = numero1; // auxiliar = 10;
				numero1 = numero2; // numero1 = 5;
				numero2 = auxiliar; // numero2 = 10;
			}

			for (i = numero1; i <= numero2; i++) {
				suma = suma + i; // es igual que suma +=i;
			}
			System.out.println(
					"La suma de todos los números comprendidos entre " + numero1 + " y " + numero2 + " es: " + suma);
		}
	}
}
