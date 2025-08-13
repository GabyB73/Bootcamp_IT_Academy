package mod4ejercicio4;

import java.util.Scanner;

public class Mod4Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		byte mes;

		System.out.println("Dime un mes (1-12):");
		mes = teclado.nextByte();

		switch (mes) {
		case 1:
			System.out.println("El mes de enero tiene 31 días");
			break;
		case 2:
			System.out.println("El mes de febrero tiene 29 días");
			break;
		case 3:
			System.out.println("El mes de marzo tiene 31 días");
			break;
		case 4:
			System.out.println("El mes de abril tiene 30 días");
			break;
		case 5:
			System.out.println("El mes de mayo tiene 31 días");
			break;
		case 6:
			System.out.println("El mes de junio tiene 30 días");
			break;
		case 7:
			System.out.println("El mes de julio tiene 31 días");
			break;
		case 8:
			System.out.println("El mes de agosto tiene 31 días");
			break;
		case 9:
			System.out.println("El mes de septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("El mes de octubre tiene 31 días");
			break;
		case 11:
			System.out.println("El mes de noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("El mes de diciembre tiene 31 días");
			break;

		default:
			System.out.println("Este número no corresponde a un mes del año, adiós!");

		}

	}

}
