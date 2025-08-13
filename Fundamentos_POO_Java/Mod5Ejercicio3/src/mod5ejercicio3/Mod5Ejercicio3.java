package mod5ejercicio3;

import java.util.Scanner;

public class Mod5Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		byte num, numRandom;				
		int i = 0;
		
		numRandom = (byte)Math.ceil((Math.random() * 10)); // Math.ceil redondea el numero
		System.out.println(numRandom);
				
		do {
			System.out.println("Introduce un numero");
			num = teclado.nextByte();
			if (num != numRandom) {
				i++;
			}

		
		}while (num != numRandom);
		
		System.out.println("Enhorabuena el numero era " + numRandom);

		
	}

}
