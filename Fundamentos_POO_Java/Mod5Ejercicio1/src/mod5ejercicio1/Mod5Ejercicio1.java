package mod5ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod5Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<String>();

		String palabra;

		System.out.println("Cuántas palabras quieres introducir?");
		int numPalabras = teclado.nextByte(); // cast automático
		teclado.nextLine(); // limpiar el buffer

		for (int i = 1; i <= numPalabras; i++) {
			System.out.println("Introduce palabra " + i + ":");
			palabra = teclado.nextLine(); // palabras.add(teclado.nextLine()); esto es lo mismo que las dos lineas.
			palabras.add(palabra);
		}

		System.out.println("******Recorriendo el ArrayList******");
		int size = palabras.size();
		for (int i = 0; i < size; i++) {
			System.out.println(palabras.get(i));
		}
	}

}