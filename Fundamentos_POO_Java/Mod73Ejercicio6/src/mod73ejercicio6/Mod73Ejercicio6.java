package mod73ejercicio6;

import java.util.ArrayList;

public class Mod73Ejercicio6 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(12);
		numeros.add(20);
		numeros.add(8);
		numeros.add(1);
		numeros.add(3);
		numeros.add(11);

		int size = numeros.size();
		int pares = 0, impares = 0;

		for (int i = 0; i < size; i++) {
			if (numeros.get(i) % 2 == 0) {
				pares += numeros.get(i);
			} else {
				impares += numeros.get(i);
			}
		}
		System.out.println("Los números del array son: " + numeros);
		System.out.println("La suma de los números pares es: " + pares);
		System.out.println("La suma de los números impares es: " + impares);

	}

}
