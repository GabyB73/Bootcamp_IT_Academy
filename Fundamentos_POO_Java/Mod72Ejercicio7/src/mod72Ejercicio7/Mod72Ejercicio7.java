package mod72Ejercicio7;

import java.util.Scanner;

public class Mod72Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.println("Introduce un año");
		year = sc.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("El año " + year + " es bisiesto");
		}else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("El año " + year + " es bisiesto");
		}else {
			System.out.println("El año " + year + " no es bisiesto");
		}
	}

}
