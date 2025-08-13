package ejercicio2marzo;

import java.util.Scanner;

public class Ejercicio2Marzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		float suma, resta, multiplicacion, division;
		
		System.out.println("Introduzca un número entero");
		num1 = teclado.nextInt();
		
		System.out.println("Introduzca otro número entero");
		num2 = teclado.nextInt();
		
		suma = num1+num2;
		resta = num1-num2;
		multiplicacion = num1*num2;
		division = num1/num2;
		
		System.out.println("El resultado de la suma es: "+ suma);
		System.out.println("El valor de la resta es "+ resta);
		System.out.println("El valor de la multiplicaicón es "+ multiplicacion);
		System.out.println("El valor de la división es "+ division);
		
		
		
		

	}

}
