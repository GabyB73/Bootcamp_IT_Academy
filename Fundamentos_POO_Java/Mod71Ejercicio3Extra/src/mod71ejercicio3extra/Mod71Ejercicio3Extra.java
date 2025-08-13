package mod71ejercicio3extra;

import java.util.Scanner;

public class Mod71Ejercicio3Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		byte numero;

		do {
			System.out.println("Introduce un número");
			numero = sc.nextByte();
			
		}while(!parImpar(numero));
		
			System.out.println("El número " + numero + " es par");
	}
		
		public static boolean parImpar(byte numero) {
			return numero % 2 == 0;
		}
	

}

