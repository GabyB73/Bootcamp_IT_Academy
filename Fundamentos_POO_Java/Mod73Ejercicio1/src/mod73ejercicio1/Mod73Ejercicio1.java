package mod73ejercicio1;

import java.util.Scanner;

public class Mod73Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float resultadoCuadrado, resultadoTriangulo, resultadoRectangulo, resultadoCirculo;

		System.out.println("Elige una opción: \n\n1-cuadrado\n2-triangulo\n3-rectángulo\n4-círculo");
		byte eleccionUsuario = sc.nextByte();

		switch (eleccionUsuario) {

		case 1:
			System.out.println("Indica el valor de un lado de tu cuadrado");
			float lado = sc.nextFloat();

			resultadoCuadrado = calcularCuadrado(lado);
			System.out.println("El área de tu cuadrado es: " + resultadoCuadrado);
			break;

		case 2:
			System.out.println("Indica el valor de la base de tu triángulo");
			float base = sc.nextFloat();

			System.out.println("Indica el valor de la altura de tu triángulo");
			float altura = sc.nextFloat();

			resultadoTriangulo = calcularTriangulo(base, altura);
			System.out.println("El área de tu triángulo es: " + resultadoTriangulo);
			break;

		case 3:
			System.out.println("Indica el valor de la base de tu rectángulo");
			base = sc.nextFloat();

			System.out.println("Indica el valor de la altura de tu rectángulo");
			altura = sc.nextFloat();

			resultadoRectangulo = calcularRectangulo(base, altura);
			System.out.println("El área de tu rectángulo es: " + resultadoRectangulo);
			break;

		case 4:
			System.out.println("Indica el valor del radio de tu círculo");
			float radio = sc.nextFloat();

			resultadoCirculo = calcularCirculo(radio);
			System.out.println("El área de tu círculo es: " + resultadoCirculo);
			break;
		default:

		}

	}

	public static float calcularCuadrado(float lado) {

		float areaCuadrado = lado * lado;

		return areaCuadrado;

	}

	public static float calcularTriangulo(float base, float altura) {

		float areaTriangulo = base * altura / 2;

		return areaTriangulo;

	}

	public static float calcularRectangulo(float base, float altura) {

		float areaRectangulo = base * altura;

		return areaRectangulo;
	}

	public static float calcularCirculo(float radio) {

		float areaCirculo = (float) (Math.PI * radio);

		return areaCirculo;

	}
}
