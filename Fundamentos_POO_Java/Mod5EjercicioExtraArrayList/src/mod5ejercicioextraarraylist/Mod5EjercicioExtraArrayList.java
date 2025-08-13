package mod5ejercicioextraarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod5EjercicioExtraArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		
		ArrayList<String> personas = new ArrayList<String>();
		
		personas.add("María");		//para crear el ArrayList yo pongo los nombres
		personas.add("Pedro");		//en el caso de maria, si lo introduzco sin acento no lo reconoce
		personas.add("Alicia");
		personas.add("Ernesto");
		
		System.out.println("Introduzca el nombre de la persona que busca");
		nombre = teclado.nextLine();
		nombre = nombre.toLowerCase();
		
		int i = 0;
		boolean encontrado = false;
				
		while (i < personas.size()&& !encontrado) {
			if (personas.get(i).equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else {
				i++;
			}
		}if (encontrado) {
						
			System.out.println("La persona que busca si está en la lista");
			
		}else {
			System.out.println("La persona que busca no está en la lista");
		}
			
			
}
}
		



