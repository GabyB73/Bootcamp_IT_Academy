package mod4ejerc3profesor;

import java.util.Scanner;

public class Mod4Ejerc3Profesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String lectura;
		byte edad;
		char titulo, paro;
		final char AFIRMACION = 's';
		final byte MAYOREDAD = 18;
		
		System.out.println("Introduce tu edad");
		edad = sc.nextByte();
		sc.nextLine(); // Limpia el buffer del teclado
		
		System.out.println("¿Tienes título universitario?");
		lectura = sc.nextLine();
		lectura = lectura.toLowerCase();
		titulo = lectura.charAt(0);
		
		System.out.println("¿Estás en el paro?");
		lectura = sc.nextLine();
		lectura = lectura.toLowerCase();
		paro = lectura.charAt(0);
		
		if ((edad >= MAYOREDAD && titulo == AFIRMACION) || paro == AFIRMACION) {
			System.out.println("*Tienes beca*");
			
		}else {
			System.out.println("*No tienes beca*");
		}
		

	}

}
