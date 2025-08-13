package mod71ejercicio8;

import java.util.Scanner;

public class Mod71Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float celsius;
		float fahrenheit;
				
		System.out.println("Introduce una temperatura en ºC");
		celsius = sc.nextFloat();
		
		fahrenheit = (float)(celsius * 9/5)+32;
		
		System.out.println("La temperatura de " + celsius + " ºC es de " + fahrenheit + " en ºF");

	}

}
