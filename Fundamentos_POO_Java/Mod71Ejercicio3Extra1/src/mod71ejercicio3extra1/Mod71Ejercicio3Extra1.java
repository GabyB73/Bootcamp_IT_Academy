package mod71ejercicio3extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod71Ejercicio3Extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Byte> impares = new ArrayList<Byte>();
		byte numero;
		boolean esPar;
		
		do {
			System.out.println("Introduce un número");
			numero = sc.nextByte();
			esPar=parImpar(numero);
			
			if(!esPar) {
				impares.add(numero);
			}
		}while(!esPar);
		
		System.out.println("El número: " + numero + " es par");
		System.out.println("Has introducido " + impares.size() + " números impares");
		System.out.println("Los números impares introducidos son: " + impares);
		
	}
	public static boolean parImpar(byte numero) {
		return numero % 2 == 0;
		
			
	}

}
