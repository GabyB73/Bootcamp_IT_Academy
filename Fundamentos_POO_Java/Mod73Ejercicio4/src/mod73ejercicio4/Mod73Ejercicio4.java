package mod73ejercicio4;

import java.util.Scanner;

public class Mod73Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		String dni;

		System.out.println("Introduce tu número de DNI (con la letra)");
		dni = sc.nextLine();

		if ((dni.length() != 9) || (Character.isLetter(dni.charAt(8)) == false)) {
			System.out.println("El DNI proporcionado no es válido");
		} else {
			int numero = Integer.parseInt(dni.substring(0, 8));

			String letraString = dni.substring(8);
			letraString = letraString.toUpperCase();
			char letraChar = letraString.charAt(0);

			char letraCalculada = letras[numero % 23];

			if (letraCalculada != letraChar) {
				System.out.println("La letra o el número proporcionado no son correctos");
				System.out.println("La letra correcta de tu DNI es: " + letraCalculada);
			} else {
				System.out.println("El numero de DNI y su letra son correctos");
			}

		}
	}

}
