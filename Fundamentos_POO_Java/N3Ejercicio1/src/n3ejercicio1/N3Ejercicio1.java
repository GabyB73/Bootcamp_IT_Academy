package n3ejercicio1;
import java.util.Scanner;

public class N3Ejercicio1 {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//menu:
		//Introducir redactor
		//Eliminar redactor
		//Introducir noticia a un redactor
		//Eliminar noticia (debe pedir redactor y titular de la noticia)
		//Mostrar todas las noticias
		//Calcular puntuacion de la noticia
		//Calcular el precio de la noticia

	}
	int opcion;
	do {
		opcion = menu();

		switch (opcion) {

		case 0:
			System.out.println("salir de la aplicación");
			break;
		case 1:
			introducirRedactor();
			break;
		case 2:
			eliminarRedactor;
			break;
		case 3:
			introducirNoticia();
			break;
		case 4:
			eliminarNoticia();
			break;
		case 5:
			mostrarNoticias();
			break;
		case 6:
			calcularPuntuacionNoticia();
			break;
		case 7:
			calcularPrecioNoticia();
			break;
		default:
			System.out.println("La opción no es válida");
		}
	} while (opcion != 0);

}

public static byte menu() {
	Scanner sc = new Scanner(System.in);
	byte opcion;
	final byte MINIMO = 0;
	final byte MAXIMO = 3;

	do {
		System.out.println("Menú Principal\nElija una opción: ");
		System.out.println("1.Dar de alta Edificio");
		System.out.println("2.Mostrar Edificio");
		System.out.println("3.Dar de baja Edificio");
		System.out.println("0.Salir de la aplicación");

		opcion = sc.nextByte();
		if (opcion < MINIMO || opcion > MAXIMO) {
			System.out.println("Escoja una opción válida");
		}
	} while (opcion < MINIMO || opcion > MAXIMO);
	return opcion;
}
