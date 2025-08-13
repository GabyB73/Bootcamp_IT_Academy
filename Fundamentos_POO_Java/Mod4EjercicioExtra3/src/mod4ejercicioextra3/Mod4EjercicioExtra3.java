package mod4ejercicioextra3;

import java.util.Scanner;

public class Mod4EjercicioExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int eleccionUsuario;

		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERA = 3;

		int numRandom = (int) (Math.random() * 3) + 1;

		int eleccionComp = numRandom;

		System.out.println("Jugamos a piedra, papel o tijeras: \n\n1.Piedra\n2.Papel\n3.Tijera\n\nElección(1-3)");
		eleccionUsuario = teclado.nextInt();

		switch (eleccionUsuario) {

		case PIEDRA:

			if (eleccionUsuario == 1 && eleccionComp == 1) {
				System.out.println("Tú piedra " + eleccionUsuario + " y yo piedra " + eleccionComp + " ¡Empate!");

			} else if (eleccionUsuario == 1 && eleccionComp == 2) {
				System.out.println("Tú piedra " + eleccionUsuario + " y yo papel " + eleccionComp + " ¡He ganado!");

			} else if (eleccionUsuario == 1 && eleccionComp == 3) {
				System.out.println("Tú piedra " + eleccionUsuario + " y yo tijeras " + eleccionComp + " ¡Has ganado!");
			} else {
				break;
			}
		case PAPEL:

			if (eleccionUsuario == 2 && eleccionComp == 1) {
				System.out.println("Tú papel " + eleccionUsuario + " y yo piedra " + eleccionComp + " ¡Has ganado!");

			} else if (eleccionUsuario == 2 && eleccionComp == 2) {
				System.out.println("Tú papel " + eleccionUsuario + " y yo papel " + eleccionComp + " ¡Empate!");

			} else if (eleccionUsuario == 2 && eleccionComp == 3) {
				System.out.println("Tú papel " + eleccionUsuario + " y yo tijera " + eleccionComp + " ¡He ganado!");
			} else {

			}
			break;

		case TIJERA:

			if (eleccionUsuario == 3 && eleccionComp == 1) {
				System.out.println("Tú tijera " + eleccionUsuario + " y yo piedra " + eleccionComp + " ¡He ganado!");

			} else if (eleccionUsuario == 3 && eleccionComp == 2) {
				System.out.println("Tú tijera " + eleccionUsuario + " y yo papel " + eleccionComp + " ¡Has ganado!");

			} else if (eleccionUsuario == 3 && eleccionComp == 3) {
				System.out.println("Tú tijera " + eleccionUsuario + " y yo tijera " + eleccionComp + "¡Empate!");

			} else {
				System.out.println("Entiendo que no quieres jugar. Adiós");
			}
			break;

		}

	}
}
