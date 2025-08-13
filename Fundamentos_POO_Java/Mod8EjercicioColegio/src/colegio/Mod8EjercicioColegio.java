package colegio;

import java.util.Scanner;

public class Mod8EjercicioColegio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce apellido");
		String apellido = sc.nextLine();
		System.out.println("Introduce dni");
		String dni = sc.nextLine();
		System.out.println("Introduce edad");
		int edad = sc.nextInt();
		
		Alumno alumno = new Alumno(nombre, apellido, dni, edad);
		
		System.out.println(alumno.toString());
		
		alumno.birthday();
		
		System.out.println(alumno);
		
	}

}
