package mod72ejercicio8versionprofesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod72Ejercicio8VersionProfesor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		System.out.println(fibonacci(numero));	//aquí llamo a la función
	}
	
	public static ArrayList<Integer> fibonacci(int numero) {
		
		ArrayList<Integer> fibonacciArray = new ArrayList<Integer>();
		
		for(int i = 0; i < numero; i++) {
			if(i>1) {
				fibonacciArray.add(fibonacciArray.get(i-1)+(fibonacciArray.get(i-2)));
			}else if (i==0 || i==1) {
				fibonacciArray.add(i);
			}
		}
		return fibonacciArray;
	}

}
