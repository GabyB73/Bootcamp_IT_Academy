package mod5ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod5Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		byte edad;
		String nombre, respuestaTitulo, respuestaParo;
		final byte BECAS = 5;
		
		ArrayList<String> becados = new ArrayList<String>();
		
		do { 
		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce tu edad");
		edad = teclado.nextByte();
		
		teclado.nextLine();
		
		System.out.println("¿Tienes título universitario? (responde si o no)");
		respuestaTitulo = teclado.nextLine().toLowerCase();
		
		if(respuestaTitulo.equals("si")) {
			respuestaTitulo = "si";
		}
		
		System.out.println("¿Estás en el Paro? (responde si o no)");
		respuestaParo = teclado.nextLine().toLowerCase();
		
		if(respuestaParo.equals("si")) {
			respuestaParo = "si";
		}
		
		//aqui me falta poner la condicion para tener la beca, sino me dice que todos los de arraylist tienen beca
		
		if ((edad >= 18 && respuestaTitulo.equals("si")) || respuestaParo.equals("si")) {
		
		becados.add(nombre);	//para crear el ArrayList
		
		}
		}while (becados.size() < BECAS);
		
		for (int i =0; i < becados.size(); i++);
				
		System.out.println("la lista de los alumnos con becas son: " + becados);
		
		
		
	

}

}