package mod7_1ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Mod7_1Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> sumaNotas = new ArrayList<Integer>();
		
		System.out.println("¿cuantas notas quiere introducir?");
		int totalNotas = sc.nextInt();
		
		System.out.println("Introduce nota");
		int nota = sc.nextInt();
		
		while (nota == 0 && nota >= 10) {
			sumaNotas.add(nota);
			
			int mediaNotas = 0;
			for(int i = 0; i < sumaNotas.size(); i++)
		}
	
		System.out.println("error, introducir nota válida");
	}
		public static int mediNotas() {
			int resultado;
			resultado = ;
			return resultado;

	}

}
