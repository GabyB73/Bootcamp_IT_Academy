package mod71ejercicio1;

import java.util.Scanner;

public class Mod71Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, nota3;		// variables declaradas como float ya que la nota puede ser por ej 5,5

		System.out.println("Ingrese la nota 1: ");
		nota1 = scanner.nextFloat();

		System.out.println("Ingrese la nota 2: ");
		nota2 = scanner.nextFloat();

		System.out.println("Ingrese la nota 3: ");
		nota3 = scanner.nextFloat();

		float media = calcularMedia(nota1, nota2, nota3); 		// llamo a la función calcularMedia
		mostrarResultado(media); 								// llamo a la función mostrar resultado

	}

	public static float calcularMedia(float nota1, float nota2, float nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static void mostrarResultado(float media) {
		if (media < 5) {
			System.out.println("No has superado el curso. Tienes que recuperar");
		} else if (media >= 5 && media <= 7) {
			System.out.println("¡Enhorabuena! Has aprobado, pero deberías seguir practicando");
		} else {
			System.out.println("¡Enhorabuena! ¡Has superado el curso! ¡Pasa ya al siguiente nivel!");
		}
	}
}
