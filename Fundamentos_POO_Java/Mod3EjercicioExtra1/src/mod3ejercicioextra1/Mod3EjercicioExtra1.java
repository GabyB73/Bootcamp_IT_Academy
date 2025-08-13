package mod3ejercicioextra1;

import java.util.Scanner;

public class Mod3EjercicioExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero, doble, triple;
		
		System.out.println("Ingresa un numero entero");
		numero = teclado.nextInt();
		
		doble = numero*2;
		triple = numero*3;
		
		System.out.println("El doble de " + numero + " es " + doble + " y el triple de " + numero + " es " + triple);

	}

}
