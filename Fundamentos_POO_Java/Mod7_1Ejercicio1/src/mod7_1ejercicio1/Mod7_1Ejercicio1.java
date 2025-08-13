package mod7_1ejercicio1;

import java.util.Scanner;

public class Mod7_1Ejercicio1 {

	public class CalculadoraDeMedias {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double nota1, nota2, nota3;

			System.out.println("Ingrese la nota 1: ");
			nota1 = scanner.nextDouble();

			System.out.println("Ingrese la nota 2: ");
			nota2 = scanner.nextDouble();

			System.out.println("Ingrese la nota 3: ");
			nota3 = scanner.nextDouble();

			double media = calcularMedia(nota1, nota2, nota3);
			mostrarResultado(media);

			scanner.close();
		}

		public static double calcularMedia(double nota1, double nota2, double nota3) {
			return (nota1 + nota2 + nota3) / 3;
		}

		public static void mostrarResultado(double media) {
			if (media < 5) {
				System.out.println("No has superado el curso. Tienes que recuperar");
			} else if (media >= 5 && media <= 7) {
				System.out.println("¡Enhorabuena! Has aprobado, pero deberías seguir practicando");
			} else {
				System.out.println("¡Enhorabuena! ¡Has superado el curso! ¡Pasa ya al siguiente nivel!");
			}
		}
	}

	/*
	 * Scanner teclado = new Scanner(System.in); int nota1, nota2, nota3; float
	 * mediaNotas;
	 * 
	 * System.out.println("Ingrese la nota 1: "); nota1 = teclado.nextInt();
	 * 
	 * System.out.println("Ingrese la nota 2: "); nota2 = teclado.nextInt();
	 * 
	 * System.out.println("Ingrese la nota 3: "); nota3 = teclado.nextInt();
	 * 
	 * mediaNotas = (float)(nota1 + nota2 + nota3)/3;
	 * 
	 * //System.out.println("La media de sus notas es: " + mediaNotas);
	 * 
	 * if (mediaNotas <5) {
	 * System.out.println("No has superado el curso. Debes recuperar"); }else if
	 * (mediaNotas >=5 && mediaNotas <= 7) { System.out.
	 * println("Enhorabuena! Has aprobado el curso, pero debes seguir practicando");
	 * }else if (mediaNotas > 7) {
	 * System.out.println("Enhorabuena! Has superado el curso"); }else {
	 * 
	 * }
	 * 
	 * //modificarlo para hacerlo con funciones }
	 */

}
