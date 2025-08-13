package mod6ejercicioextra1;

import java.util.ArrayList;

public class Mod6EjercicioExtra1 {

	public static void main(String[] args) {

		metodoUno(); // aquí llamo al método 1

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(12);
		numeros.add(5);
		numeros.add(22);
		numeros.add(6);

		int numMenor = metodoDos(numeros); // aquí llamo al método 2
		System.out.println("El número más pequeño es: " + numMenor);

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Noa");
		nombres.add("Peter");
		nombres.add("Victoria");
		nombres.add("Dani");
		nombres.add("Sara");

		String nombreMasLargo = metodoTres(nombres); // aquí llamo al método 3
		System.out.println("El nombre más largo es: " + nombreMasLargo);

		int numero1 = 10;
		int numero2 = 18;

		ArrayList<Integer> valores = metodoCuatro(numero1, numero2); // aquí llamo al método 4

		System.out.println("Los números comprendidos entre " + numero1 + " y " + numero2 + " son: " + valores);

	}

	public static void metodoUno() { // método 1 sin parámetros y sin retorno

		System.out.println("Soy un método");
	}

	public static int metodoDos(ArrayList<Integer> numeros) { // método 2 con parámetros y retorno

		int numMayor = numeros.get(0);
		int numMenor = numeros.get(0);
		int indiceNumMenor = 0;

		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) > numMayor) {
				numMayor = numeros.get(i);
			}
			if (numeros.get(i) < numMenor) {
				numMenor = numeros.get(i);
				indiceNumMenor = i;
			}
		}

		System.out.println("El número más grande es: " + numMayor);

		return numMenor;
	}

	public static String metodoTres(ArrayList<String> nombre) { // método 3 con parámetros y retorno

		String nombreMasLargo = "";
		String nombreActual = "";

		for (int i = 0; i < nombre.size(); i++) {
			nombreActual = nombre.get(i);
			if (nombreActual.length() > nombreMasLargo.length()) {
				nombreMasLargo = nombreActual;
			}
		}

		return nombreMasLargo;

	}

	public static ArrayList<Integer> metodoCuatro(int numero1, int numero2) { // método 4 con parámetro y retorno
		ArrayList<Integer> valores = new ArrayList<Integer>();

		for (int i = numero1 + 1; i < numero2; i++) {
			valores.add(i);
		}
		return valores;

	}

}
