package mod4ejercicio6;

import java.util.Scanner;

public class Mod4Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		byte dia, mes;

		System.out.println("¿En qué día naciste?");
		dia = teclado.nextByte();

		teclado.nextLine();

		System.out.println("¿En qué mes naciste?");
		mes = teclado.nextByte();

		switch (mes) {
		case 1:
			if (dia > 19) {
				System.out.println("Tu signo es ACUARIO");

			} else {
				System.out.println("Tu signo es CAPRICORNIO");
			}
			break;

		case 2:
			if (dia > 18) {
				System.out.println("Tu signo es PISCIS");

			} else {
				System.out.println("Tu signo es ACUARIO");

			}
			break;

		case 3:
			if (dia > 20) {
				System.out.println("Tu signo es ARIES");
			} else {
				System.out.println("Tu signo es PISCIS");
			}
			break;

		case 4:
			if (dia > 19) {
				System.out.println("Tu signo es TAURO");

			} else {
				System.out.println("Tu signo es ARIES");
			}
			break;

		case 5:
			if (dia > 20) {
				System.out.println("Tu signo es GEMINIS");
			} else {
				System.out.println("Tu signo es TAURO");
			}
			break;

		case 6:
			if (dia > 20) {
				System.out.println("Tu signo es CANCER");
			} else {
				System.out.println("Tu signo es GEMINIS");
			}
			break;

		case 7:
			if (dia > 22) {
				System.out.println("Tu signo es LEO");
			} else {
				System.out.println("Tu signo es CANCER");
			}
			break;

		case 8:
			if (dia > 22) {
				System.out.println("Tu signo es VIRGO");
			} else {
				System.out.println("Tu signo es LEO");
			}
			break;

		case 9:
			if (dia > 22) {
				System.out.println("Tu signo es LIBRA");
			} else {
				System.out.println("Tu signo es VIRGO");
			}
			break;

		case 10:
			if (dia > 22) {
				System.out.println("Tu signo es ESCORPIO");
			} else {
				System.out.println("Tu signo es LIBRA");
			}
			break;

		case 11:
			if (dia > 21) {
				System.out.println("Tu signo es SAGITAIO");
			} else {
				System.out.println("Tu signo es ESCORPIO");
			}
			break;

		case 12:
			if (dia > 21) {
				System.out.println("Tu signo es CAPRICORNIO");
			} else {
				System.out.println("Tu signo es SAGITARIO");
			}
			break;
		default:
			System.out.println("Tu fecha de naciento es erronea");

		}
	}

}
