package mod5ejercicioextra;

import java.util.Scanner;

public class Mod5EjercicioExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		byte aleatorio = (byte)Math.ceil((Math.random()*10));
		byte intentos = 0;
		final byte MAXINTENTOS = 3;
		byte escogido;
		
		System.out.println(aleatorio);
		
		do {
			System.out.println("Introduce un número");
			escogido = teclado.nextByte();
			intentos +=1;
			
			if (aleatorio < escogido) {
				System.out.println("demadiado grande");
				
			}else if (aleatorio > escogido) {
				System.out.println("demasiado pequeño");
			}	
		}while (aleatorio != escogido && intentos < MAXINTENTOS);
		
		if (aleatorio == escogido) {
			
			System.out.println("Enhorabuena el número es:" + aleatorio);
		}else {
			System.out.println("Has utilizado el número máximo de intentos " + MAXINTENTOS + "; el número era el " + aleatorio);
		}
	}
	

}
