package ejercicio1_gabrielabustamante;

import java.util.ArrayList;

public class Ejercicio1_GabrielaBustamante {

	public static void main(String[] args) {
		
		//Dado el siguiente array de números [15,16,8,2,4,6,2,3,10] mostrar por pantalla los múltiplos de 5
		//y el número más grande y el más pequeño del array

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(15);
		numeros.add(16);
		numeros.add(8);
		numeros.add(2);
		numeros.add(4);
		numeros.add(6);
		numeros.add(2);
		numeros.add(3);
		numeros.add(10);

		numMenor(numeros);

		multiplos(numeros);

	}

	public static void numMenor(ArrayList<Integer> numeros) {
		int numMayor = numeros.get(0);
		int numMenor = numeros.get(0);

		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) > numMayor) {
				numMayor = numeros.get(i);
			}
			if (numeros.get(i) < numMenor) {
				numMenor = numeros.get(i);

			}

		}
		System.out.println("El numero más grande es: " + numMayor);
		System.out.println("El numero más pequeño es: " + numMenor);
		// return numMenor;
	}

	public static void multiplos(ArrayList<Integer> numeros) {

		for (int numero : numeros) {
			if (numero % 5 == 0) {
				System.out.println(numero);
			}
		}

	}

}
