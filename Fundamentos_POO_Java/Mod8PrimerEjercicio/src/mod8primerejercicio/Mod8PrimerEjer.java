package mod8primerejercicio;

import java.util.Scanner;

public class Mod8PrimerEjer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un nombre");
		String nombre = sc.nextLine();
		System.out.println("introduce un apellido");
		String apellido = sc.nextLine();
		System.out.println("introduce un dni");
		String dni = sc.nextLine();
		System.out.println("introduce una edad");
		int edad = sc.nextInt();
		
		Alumno alumno = new Alumno(nombre, apellido, dni, edad);
		
		System.out.println(alumno.toString());
		
		alumno.birthday();
		
		System.out.println(alumno);
		
		
	}

}
