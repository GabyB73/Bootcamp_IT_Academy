package mod8ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod8Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();

		for (int i = 1; i < 2; i++) {

			System.out.println("Introduce marca ordenador " + i + ":");
			String marca = sc.nextLine();

			System.out.println("Introduce modelo ordenador " + i + ":");
			String modelo = sc.nextLine();

			System.out.println("Introduce procesador ordenador " + i + ":");
			String procesador = sc.nextLine();

			System.out.println("Introduce memoria RAM ordenador " + i + ":");
			int memoriaRam = sc.nextInt();

			System.out.println("Introduce la capacidad del disco duro ordenador " + i + ":");
			int capacidadDiscoDuro = sc.nextInt();

			Ordenador ordenador1 = new Ordenador(marca, modelo, procesador, memoriaRam, capacidadDiscoDuro);
			ordenadores.add(ordenador1);
			System.out.println(ordenador1);

			Ordenador ordenador2 = new Ordenador(marca, modelo);
			ordenadores.add(ordenador2);
			System.out.println(ordenador2);

		}
		System.out.println(ordenadores.get(0).ejecutarPrograma("Eclipse"));

	}
}
