package mod8ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod8Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();

		Hotel ritz = new Hotel("Ritz", 50, 5, 5000); // esto es para ver como funciona el programa, despues borrar
		Hotel marriot = new Hotel("Marriot", 500, 5, 5000);
		Hotel hilton = new Hotel("Hilton", 500, 5, 5000);
		hoteles.add(ritz);
		hoteles.add(marriot);
		hoteles.add(hilton);

		int opcion = 0;
		int posicion;

		boolean salir = false;

		do {
			opcion = menu();

			switch (opcion) {
			case 1:
				posicion = buscarHotel(hoteles);
				crearHotel(hoteles, posicion);
				verHoteles(hoteles);
				break;
			case 2:
				posicion = buscarHotel(hoteles);
				modificarHotel(hoteles, posicion);
				verHoteles(hoteles);
				break;
			case 3:
				posicion = buscarHotel(hoteles);
				darDeBajaHotel(hoteles, posicion);
				verHoteles(hoteles);
				break;
			case 4:
				verHoteles(hoteles);
				break;
			case 5:
				posicion = buscarHotel(hoteles);
				mostrarHotel(hoteles, posicion);
				break;
			case 0:
				System.out.println("Gracias por utilizar nuestra aplicación");
				salir = true;
				break;
			default:
				System.out.println("Introduce un número válido");
			}

		} while (!salir);
	}

	public static byte menu() {
		Scanner sc = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Opción 1: CREAR HOTEL");
			System.out.println("2. Opción 2: MODIFICAR HOTEL");
			System.out.println("3. Opción 3: DAR DE BAJA HOTEL");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void crearHotel(ArrayList<Hotel> hoteles, int posicion) {
		Scanner sc = new Scanner(System.in);

		if (posicion == -1) {
			System.out.println("Introduzca el nombre del hotel que quiere crear: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el número de habitaciones: ");
			int numHabitaciones = sc.nextInt();
			System.out.println("Introduzca el número de plantas: ");
			int numPlantas = sc.nextInt();
			System.out.println("Introduzca la superficie total: ");
			int totalSuperficie = sc.nextInt();

			Hotel hotel = new Hotel(nombre, numHabitaciones, numPlantas, totalSuperficie);
			hoteles.add(hotel);

			System.out.println(hotel.calcularMantenimiento());
		} else {
			System.out.println("El hotel ya está dado de alta en nuestra aplicación");
		}
	}

	public static int buscarHotel(ArrayList<Hotel> hoteles) {
		Scanner sc = new Scanner(System.in);
		int posicion = -1, i = 0;
		boolean encontrado = false;

		System.out.println("Introduzca el nombre del hotel");
		String nombre = sc.nextLine();

		while (!encontrado && i < hoteles.size()) {
			if (hoteles.get(i).getNombre().equalsIgnoreCase(nombre)) {
				posicion = i;
				encontrado = true;
			}
			i++;
		}
		return posicion;
	}

	public static void darDeBajaHotel(ArrayList<Hotel> hoteles, int posicion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del hotel que quiere dar de baja");
		String nombre = sc.nextLine();

		if (posicion != -1) {
			hoteles.remove(posicion);
		} else {
			System.out.println("El hotel " + nombre + " que desea dar de baja no se encuentra en nuestra aplicación");
		}

	}

	public static void mostrarHotel(ArrayList<Hotel> hoteles, int posicion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del hotel que quiere ver");
		String nombre = sc.nextLine();

		if (posicion != -1) {
			System.out.println("El nombre del hotel es: " + hoteles.get(posicion).getNombre());
			System.out.println("El nombre del hotel es: " + hoteles.get(posicion).getNumHabitaciones());
			System.out.println("El nombre del hotel es: " + hoteles.get(posicion).getNumPlantas());
			System.out.println("El nombre del hotel es: " + hoteles.get(posicion).getTotalSuperficie());
			System.out.println("El nombre del hotel es: " + hoteles.get(posicion).calcularMantenimiento());
		} else {
			System.out.println("El hotel " + nombre + " que desea ver no se encuentra en nuestra aplicación");
		}

	}

	public static void modificarHotel(ArrayList<Hotel> hoteles, int posicion) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		if (posicion != -1) {
			do {
				opcion = menuModificar();
				modificar(opcion, hoteles, posicion);
			} while (opcion != 0);

		} else {
			System.out.println("El hotel no está en nuestra aplicación");
		}

	}

	public static int menuModificar() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Qué desea modificar: ");
			System.out.println("1- Habitaciones");
			System.out.println("2- Plantas");
			System.out.println("3- Superficie");
			System.out.println("0- Volver al menú principal");
			opcion = sc.nextInt();
		} while (opcion < 0 || opcion > 3);

		return opcion;

	}

	public static void modificar(int opcion, ArrayList<Hotel> hoteles, int posicion) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel;

		switch (opcion) {
		case 0:
			System.out.println("Salida del menú modificar hotel");
			break;
		case 1:
			System.out.println("Número de habitaciones: ");
			int habitaciones = sc.nextInt();
			hotel = hoteles.get(posicion);
			hotel.setNumHabitaciones(habitaciones);
			break;
		case 2:
			System.out.println("Número de plantas: ");
			int plantas = sc.nextInt();
			hotel = hoteles.get(posicion);
			hotel.setNumPlantas(plantas);
			break;
		case 3:
			System.out.println("Superficie");
			int superficie = sc.nextInt();
			hotel = hoteles.get(posicion);
			hotel.setTotalSuperficie(superficie);
			break;
		}
	}

	public static void verHoteles(ArrayList<Hotel> hoteles) {
		for (Hotel hotel : hoteles) { // uso el bucle for-each
			System.out.println(hotel.toString());
			System.out.println(hotel.getNombre());
			System.out.println(hotel.calcularMantenimiento());
		}
	}
}
