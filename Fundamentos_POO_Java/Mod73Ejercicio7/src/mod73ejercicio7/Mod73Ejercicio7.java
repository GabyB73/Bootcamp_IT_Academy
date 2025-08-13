package mod73ejercicio7;

import java.util.Scanner;

public class Mod73Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el precio del kilo de fideos");
		float precioFideos = sc.nextFloat();

		System.out.println("Dime el precio del kilo de calamares");
		float precioCalamares = sc.nextFloat();

		System.out.println("Dime el precio del kilo de gambas");
		float precioGambas = sc.nextFloat();

		System.out.println("Dime cuántas personas serán para comer");
		byte totalAmigos = sc.nextByte();

		// cantidad de ingredientes por persona
		float cantFideos = 0.5f / 4;
		float cantCalamares = 0.4f / 4;
		float cantGambas = 0.2F / 4;

		// cantidad total de ingredientes
		float totalFideos = cantFideos * totalAmigos;
		float totalCalamares = cantCalamares * totalAmigos;
		float totalGambas = cantGambas * totalAmigos;

		// precio por persona
		float precioPorPersona = cantFideos * precioFideos + cantCalamares * precioCalamares
				+ cantGambas * precioGambas;

		// precio total de la fideuá
		float precioTotal = precioPorPersona * totalAmigos;

		System.out.println("Necesitarás para hacer la fideuá: " + totalFideos + " kilos de fideos, " + totalCalamares
				+ " kilos de calamares y " + totalGambas + " kilos de gambas.");
		System.out.println("El precio por persona es " + precioPorPersona + "€");
		System.out.println("El precio total es " + precioTotal + "€");

	}

}
