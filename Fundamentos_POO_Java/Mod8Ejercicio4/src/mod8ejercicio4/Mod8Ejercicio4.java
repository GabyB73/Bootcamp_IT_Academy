package mod8ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

import Herencia.Cine;
import Herencia.Edificio;
import Herencia.Hospital;
import Herencia.Hotel;

public class Mod8Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();

		Cine verdi = new Cine("Verdi", 1, 1000, 30);
		Cine bosque = new Cine("Bosque", 2, 3000, 40);
		Hotel vela = new Hotel("Vela", 50, 5000, 150);
		Hotel melia = new Hotel("Melia", 25, 2000, 150);
		Hospital clinic = new Hospital("Clinic", 5, 6000, 313);
		Hospital quironsalud = new Hospital("Quironsalud", 3, 4500, 200);

		edificios.add(verdi);
		edificios.add(bosque);
		edificios.add(vela);
		edificios.add(melia);
		edificios.add(clinic);
		edificios.add(quironsalud);

		// crear con do-while el menú para llamar a los métodos

		int opcion;
		do {
			opcion = menu();

			switch (opcion) {

			case 0:
				System.out.println("salir de la aplicación");
				break;
			case 1:
				darDeAltaEdificio(edificios);
				break;
			case 2:
				mostrarEdificio(edificios);
				break;
			case 3:
				darDeBajaEdificio(edificios);
				break;
			default:
				System.out.println("La opción no es válida");
			}
		} while (opcion != 0);

	}

	public static byte menu() {
		Scanner sc = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("Menú Principal\nElija una opción: ");
			System.out.println("1.Dar de alta Edificio");
			System.out.println("2.Mostrar Edificio");
			System.out.println("3.Dar de baja Edificio");
			System.out.println("0.Salir de la aplicación");

			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void darDeAltaEdificio(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el tipo de Edificio que quiere dar de alta\n*Hotel - Hospital - Cine*\n");
		String tipoEdificio = sc.nextLine();

		switch (tipoEdificio.toUpperCase()) {

		case "HOTEL":
			darDeAltaHotel(edificios);
			break;
		case "HOSPITAL":
			darDeAltaHospital(edificios);
			break;
		case "CINE":
			darDeAltaCine(edificios);
			break;
		default:
			System.out.println("La opción no es válida");
		}
	}

	public static void darDeAltaHotel(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> datos;

		System.out.println("Introduzca el nombre del hotel");
		String nombre = sc.nextLine();

		Hotel hotel = buscarHotel(nombre, edificios);

		if (hotel == null) {
			datos = datosEdificio();

			System.out.println("Introduzca el número de habitaciones");
			int numHabitaciones = sc.nextInt();

			// Hotel hotel = new Hotel(nombre, datos.get(0), datos.get(1), numHabitaciones);
			edificios.add(new Hotel(nombre, datos.get(0), datos.get(1), numHabitaciones));
		} else {
			System.out.println("No se puede crear el hotel" + nombre + " porque ya existe");

		}
	}

	public static void darDeAltaHospital(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> datos;

		System.out.println("Introduzca el nombre del hospital");
		String nombre = sc.nextLine();

		Hospital hospital = buscarHospital(nombre, edificios);

		if (hospital == null) {
			datos = datosEdificio();

			System.out.println("Introduzca el número de enfermos");
			int enfermos = sc.nextInt();

			// Hospital hospital = new Hospital(nombre, datos.get(0), datos.get(1),
			// numHabitaciones);
			edificios.add(new Hospital(nombre, datos.get(0), datos.get(1), enfermos));
		} else {
			System.out.println("No se puede crear el hospital" + nombre + " porque ya existe");
		}
	}

	public static void darDeAltaCine(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> datos;

		System.out.println("Introduzca el nombre del cine");
		String nombre = sc.nextLine();

		Cine cine = buscarCine(nombre, edificios);

		if (cine == null) {
			datos = datosEdificio();

			System.out.println("Introduzca el número de aforo");
			int aforo = sc.nextInt();

			// Cine cine = new Cine(nombre, datos.get(0), datos.get(1), aforo);
			edificios.add(new Cine(nombre, datos.get(0), datos.get(1), aforo));
		} else {
			System.out.println("No se puede crear el cine" + nombre + " porque ya existe");

		}
	}

	public static Hotel buscarHotel(String nombre, ArrayList<Edificio> edificios) {
		Hotel hotel = null;
		int i = 0;

		while (hotel == null && i < edificios.size()) {

			if (edificios.get(i) instanceof Hotel && edificios.get(i).getNombre().equalsIgnoreCase(nombre)) {
				hotel = (Hotel) edificios.get(i);
			}
			i++;
		}
		return hotel;
	}

	public static Hospital buscarHospital(String nombre, ArrayList<Edificio> edificios) {
		Hospital hospital = null;
		int i = 0;

		while (hospital == null && i < edificios.size()) {

			if (edificios.get(i) instanceof Hospital && edificios.get(i).getNombre().equalsIgnoreCase(nombre)) {
				hospital = (Hospital) edificios.get(i);
			}
			i++;
		}
		return hospital;
	}

	public static Cine buscarCine(String nombre, ArrayList<Edificio> edificios) {
		Cine cine = null;
		int i = 0;

		while (cine == null && i < edificios.size()) {

			if (edificios.get(i) instanceof Cine && edificios.get(i).getNombre().equalsIgnoreCase(nombre)) {
				cine = (Cine) edificios.get(i);
			}
			i++;
		}
		return cine;
	}

	public static void mostrarEdificio(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el tipo de Edificio que quiere ver\n*Hotel - Hospital - Cine*\n");
		String tipoEdificio = sc.nextLine();

		System.out.println("Introduzca el nombre del edificio");
		String nombre = sc.nextLine();

		switch (tipoEdificio.toUpperCase()) {

		case "HOTEL":
			Hotel hotel = buscarHotel(nombre, edificios);
			if (hotel != null) {
				System.out.println(hotel.toString() + "\n" + hotel.servicioHabitaciones() + "\n"
						+ hotel.calcularCosteVigilancia() + "\n" + hotel.limpiar());
			} else {
				System.out.println("El hotel " + nombre + " " + "no está en la aplicación");
			}
			break;

		case "HOSPITAL":
			Hospital hospital = buscarHospital(nombre, edificios);
			if (hospital != null) {
				System.out.println(hospital.toString() + "\n" + hospital.repartirComida() + "\n"
						+ hospital.calcularCosteVigilancia() + "\n" + hospital.limpiar());
			} else {
				System.out.println("El hospital " + nombre + " " + "no está en la aplicación");
			}
			break;

		case "CINE":
			Cine cine = buscarCine(nombre, edificios);
			if (cine != null) {

				System.out.println("Introduzca el número de asistentes");
				int numAsistentes = sc.nextInt();
				System.out.println("Introduzca el precio de la entrada");
				int precioEntrada = sc.nextInt();

				// System.out.println(cine.proyectarSesion(numAsistentes, precioEntrada));

				System.out.println(cine.toString() + "\n" + cine.calcularCosteVigilancia() + "\n"
						+ cine.proyectarSesion(numAsistentes, precioEntrada) + "\n" + cine.limpiar());
			} else {
				System.out.println("El cine " + nombre + " " + "no está en la aplicación");
			}
			break;
		}
	}

	public static void darDeBajaEdificio(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el tipo de Edificio que quiere dar de baja:\n*Hotel - Hospital - Cine*\n");
		String tipoEdificio = sc.nextLine();

		switch (tipoEdificio.toUpperCase()) {

		case "HOTEL":
			darBajaHotel(edificios);
			break;
		case "HOSPITAL":
			darBajaHospital(edificios);
			break;
		case "CINE":
			darBajaCine(edificios);
			break;
		default:
			System.out.println("La opción no es válida");
		}

	}

	public static void darBajaHotel(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del hotel");
		String nombre = sc.nextLine();

		Hotel hotel = buscarHotel(nombre, edificios);

		if (hotel != null) {
			edificios.remove(hotel);
			System.out.println("El hotel " + nombre + " se ha eliminado correctamente");
		} else {
			System.out.println("El hotel " + nombre + " no está en la aplicación");
		}
	}

	public static void darBajaHospital(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del hospital que desea dar de baja");
		String nombre = sc.nextLine();

		Hospital hospital = buscarHospital(nombre, edificios);

		if (hospital != null) {
			edificios.remove(hospital);
			System.out.println("El hospital " + nombre + " se ha eliminado correctamente");
		} else {
			System.out.println("El hospital " + nombre + " no está en la aplicación");
		}
	}

	public static void darBajaCine(ArrayList<Edificio> edificios) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del cine");
		String nombre = sc.nextLine();

		Cine cine = buscarCine(nombre, edificios);

		if (cine != null) {
			edificios.remove(cine);
			System.out.println("El cine " + nombre + " se ha eliminado correctamente");
		} else {
			System.out.println("El cine " + nombre + " no está en la aplicación");
		}
	}

	public static ArrayList<Integer> datosEdificio() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> datos = new ArrayList<Integer>();

		System.out.println("Introduzca el número de plantas del edificio");
		datos.add(sc.nextInt());

		System.out.println("Introduzca la superficie del edificio");
		datos.add(sc.nextInt());

		return datos;
	}

}
