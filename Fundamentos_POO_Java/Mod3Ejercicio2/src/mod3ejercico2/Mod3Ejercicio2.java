package mod3ejercico2;

import java.util.Scanner;

public class Mod3Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Ingrese un número entero");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingrese otro número entero");
		numero2 = teclado.nextInt();
		
		System.out.println("La suma entre " + numero1 + " y " + numero2 + " es " + (numero1+numero2));
		
		System.out.println("La resta entre " + numero1 + " y " + numero2 + "  es " + (numero1-numero2));
		
		System.out.println("La multiplicación entre " + numero1 + " y " + numero2 + " es " + numero1*numero2);
		
		System.out.println("La división entre " + numero1 + " y " + numero2 + " es " + (float)numero1/numero2);
		
		

	}

}
