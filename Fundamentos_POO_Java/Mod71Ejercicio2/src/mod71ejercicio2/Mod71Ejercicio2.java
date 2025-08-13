package mod71ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod71Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Float> notas = new ArrayList<Float>();

		System.out.println("Introduce el número de notas");
		byte numNotas = sc.nextByte();

		notas = calcularNotaMedia(numNotas); // llamo a la función calcularNotaMedia

		mostrarMensaje(notas); // llamo a la función mostrarMensaje

	}

	public static ArrayList<Float> calcularNotaMedia(byte numNotas) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Float> notas = new ArrayList<Float>();
		int i = 0;
		float total = 0f;
		float nota;
		float notaMin = 10f;
		float notaMax = 0f;

		while (i < numNotas) {
			System.out.println("Introduce la nota " + (i + 1) + ":");
			nota = sc.nextFloat();

			if (nota >= 0 && nota <= 10) {
				if (nota > notaMax) { // buscar la notaMin y la notaMax que el usuario ha introducido por teclado
					notaMax = nota;
				}
				if (nota < notaMin) {
					notaMin = nota;
				}
				total += nota;
				i++;
			} else {
				System.out.println("La nota tiene que estar entre 0 y 10");
			}
		}
		total = total / numNotas;

		notas.add(notaMin);
		notas.add(notaMax);
		notas.add(total);

		return notas;
	}

	public static void mostrarMensaje(ArrayList<Float> notas) {
		float media = notas.get(2);
		String mensaje;

		if (media == 5) {
			mensaje = "La nota media de la clase es aprobada por los pelos.";
		} else if (media < 5) {
			mensaje = "La nota media de la clase está suspendida. Los alumnos deberían preguntar sus dudas y trabajar más.";
		} else if (media < 7) {
			mensaje = "La nota media de la clase es buena, pero los alumnos deberían mejorar el trabajo personal.";
		} else {
			mensaje = "La nota media de la clase es muy buena, corresponde con el esfuerzo realizado.";
		}
		System.out.println(mensaje + " La nota máxima de la clase es: " + notas.get(1) + " .La nota mínima es:"
				+ notas.get(0) + ". Y la media es:" + notas.get(2));
	}
}
