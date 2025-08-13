package mod5ejercicio4;

import java.util.Scanner;

public class Mod5Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		byte aleatorio = (byte)Math.ceil((Math.random()*10));
		byte intentos = 0;
		final byte MAXINTENTOS = 5;
		byte escogido;
		
		System.out.println(aleatorio); // para saber cual ha escogido la compu
		
		do {
			System.out.println("Introduce un número");
			escogido = teclado.nextByte();
			intentos +=1;
			
		}while (aleatorio != escogido && intentos < MAXINTENTOS);
		
		if (aleatorio == escogido) {
			System.out.println("Enhorabuena, el número es " + aleatorio + " y has necesitado " + intentos + " intentos para acertarlo");
			
		}else {
			System.out.println("¡Has necesitado demasiados intentos! El número es " + aleatorio);
		}
		

	}

}
