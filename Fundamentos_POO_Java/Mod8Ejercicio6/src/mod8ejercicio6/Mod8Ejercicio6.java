package mod8ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

import herencia.Mecanico;
import herencia.Piloto;
import herencia.Trabajador;

public class Mod8Ejercicio6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Escuderia> escuderias = new ArrayList<Escuderia>();

		ArrayList<Coche> coches = new ArrayList<Coche>();

		Escuderia ferrari = new Escuderia("Ferrari", 10000000, "Italia");
		escuderias.add(ferrari);

		Coche coche1 = new Coche(1000, 350, "Azul", 15000000);
		ferrari.getCoches().add(coche1);

		Coche coche2 = new Coche(1000, 380, "Rojo", 12500000);
		ferrari.getCoches().add(coche2);

		Piloto piloto1 = new Piloto("Juan", "Perez", 22, 3, 1.7f, 70);
		ferrari.getTrabajadores().add(piloto1);

		Mecanico mecanico1 = new Mecanico("Jose", "Sanchez", 30, 1, true);
		ferrari.getTrabajadores().add(mecanico1);
		mecanico1.setEstudiosSuperiores(true);

		// aquí con un do-while + switch crear el menú para ir llamando a los métodos
		// Escuderia escuderia = new Escuderia(String nombre, int presupuesto, String
		// pais);

		int opcion;

		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("Salir de la aplicación");
				break;
			case 1:
				altaTrabajador(escuderias);
				break;
			case 2:
				mostrarTrabajador(escuderias);
				/*
				 * case 3: bajaTrabajador(escuderias); break;
				 */
			default:
				System.out.println("La opción no es válida");

			}
		} while (opcion != 0);
	}

	public static byte menu() {
		byte opcion = 0;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("Menú Principal\nElija una opción: ");
			System.out.println("1. Dar de alta trabajador");
			System.out.println("2. Mostrar trabajador");
			System.out.println("3. Dar de baja trabajador");

			opcion = sc.nextByte();
			sc.nextLine(); // Consumir el carácter de nueva línea
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void altaTrabajador(ArrayList<Escuderia> escuderias) {

		// antes de dar de alta, tengo que preguntar en que escuderia quiere dar el
		// alta, para ello tengo que preguntar
		// nombre de escuderia
		if (escuderias.isEmpty()) {
			System.out.println("No se han registrado escuderias en nuestra aplicación");
		} else {
			String nombreEscuderia;
			Escuderia escuderia;

			nombreEscuderia = pedirNombreEscuderia();
			escuderia = buscarEscuderia(escuderias, nombreEscuderia);

			if (escuderia != null) {

				System.out.println("Introduzca el tipo de trabajador que quiere dar de alta\n*Piloto - Mecánico*\n");
				String tipoTrabajador = sc.nextLine();

				switch (tipoTrabajador.toUpperCase()) {
				case "PILOTO":
					altaPiloto(escuderias);
					break;
				case "MECANICO":
					altaMecanico(escuderias);
					break;
				default:
					System.out.println("La opción no es válida");
				}

			} else {
				System.out.println("La escuderia no se encuentra en la aplicación");
			}
		}
	}

	public static void altaPiloto(ArrayList<Escuderia> escuderias) {
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
		//ArrayList<Object> datos = new ArrayList<Object>();

		String nombre = "", pais = "";
		int presupuesto = 0;

		System.out.println("Introduzca el nombre del piloto");
		nombre = sc.nextLine();

		Escuderia escuderia = new Escuderia(nombre, presupuesto, pais);

		Piloto piloto = buscarPiloto(trabajadores, nombre);
		if (piloto == null) {
			datosPiloto(escuderia);
			//escuderia.agregarTrabajador(new Piloto(nombre, datos.get(0), datos.get(1), datos.get(2),datos.get(3),
				//	datos.get(4),datos.get(5)));

		} else {
			System.out.println("El piloto que quiere ingresar " + nombre + " ya está dado de alta");
		}

	}

	public static void altaMecanico(ArrayList<Escuderia> escuderias) {
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

		String nombre = "", pais = "";
		int presupuesto = 0;

		System.out.println("Introduzca el nombre del mecánico");
		nombre = sc.nextLine();

		Escuderia escuderia = new Escuderia(nombre, presupuesto, pais);

		Mecanico mecanico = buscarMecanico(trabajadores, nombre);
		if (mecanico == null) {
			datosMecanico(escuderia);
			// escuderia.agregarTrabajador(new Mecanico(nombre, apellido, edad, antiguedad,
			// isEstudiosSuperiores));

		} else {
			System.out.println("El mecánico que quiere ingresar " + nombre + " ya está dado de alta");

		}
	}

	public static void mostrarTrabajador(ArrayList<Escuderia> escuderias) {

		if (escuderias.isEmpty()) {
			System.out.println("No se han registrado escuderias en nuestra aplicación");
		} else {
			String nombreEscuderia;
			Escuderia escuderia;

			nombreEscuderia = pedirNombreEscuderia();
			escuderia = buscarEscuderia(escuderias, nombreEscuderia);

			if (escuderia != null) {

				System.out.println("Introduzca el tipo de trabajador que quiere ver\n*Piloto - Mecánico*\n");
				String tipoTrabajador = sc.nextLine();

				switch (tipoTrabajador.toUpperCase()) {
				case "PILOTO":
					mostrarPiloto(escuderias);
					break;
				case "MECANICO":
					mostrarMecanico(escuderias);
					break;
				default:
					System.out.println("La opción no es válida");
				}

			} else {
				System.out.println("La escuderia no se encuentra en la aplicación");
			}
		}
	}

	public static void mostrarPiloto(ArrayList<Escuderia> escuderias) {
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

		System.out.println("Introduzca el nombre del piloto");
		String nombre = sc.nextLine();

		Piloto piloto = buscarPiloto(trabajadores, nombre);
		if (piloto != null) {
			System.out.println(piloto.toString() + "\n" + piloto.calcularSueldo());
		} else {
			System.out.println("El piloto " + nombre + " que quiere ver, no está dado de alta en esta aplicación");
		}

	}

	public static void mostrarMecanico(ArrayList<Escuderia> escuderias) {
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

		System.out.println("Introduzca el nombre del mecánico");
		String nombre = sc.nextLine();

		Mecanico mecanico = buscarMecanico(trabajadores, nombre);
		if (mecanico != null) {
			System.out.println(mecanico.toString() + "\n" + mecanico.calcularSueldo());

		} else {
			System.out.println("El mecánico " + nombre + " que quiere ver, no está dado de alta en esta aplicación");

		}
	}

	/*
	 * public static void mostrarTrabajador(ArrayList<Escuderia> escuderias) {
	 * ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	 * 
	 * System.out.
	 * println("Indique el tipo de trabajador que quiere ver: \n*Piloto - Mecánico*\n"
	 * ); String tipoTrabajador = sc.nextLine();
	 * 
	 * switch (tipoTrabajador.toUpperCase()) { case "PILOTO":
	 * System.out.println("Introduzca el nombre del piloto"); String nombrePiloto =
	 * sc.nextLine();
	 * 
	 * Piloto piloto = buscarPiloto(trabajadores, nombrePiloto); if (piloto != null)
	 * { System.out.println(piloto.toString() + "\n" + piloto.calcularSueldo());
	 * 
	 * } else { System.out.println("El piloto " + nombrePiloto + " " +
	 * " no está en esta aplicación"); } break; case "MECANICO":
	 * System.out.println("Introduzca el nombre del mecánico"); String
	 * nombreMecanico = sc.nextLine();
	 * 
	 * Mecanico mecanico = buscarMecanico(trabajadores, nombreMecanico); if
	 * (mecanico != null) { System.out.println(mecanico.toString() + "\n" +
	 * mecanico.calcularSueldo()); } else { System.out.println("El mecánico " +
	 * nombreMecanico + " " + " no está en esta aplicación"); } break;
	 * 
	 * } }
	 */

	public static Piloto buscarPiloto(ArrayList<Trabajador> trabajadores, String nombre) {
		Piloto piloto = null;
		int i = 0;

		while (piloto == null && i < trabajadores.size()) {
			if (trabajadores.get(i) instanceof Piloto && trabajadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				piloto = (Piloto) trabajadores.get(i);
			}
			i++;
		}
		return piloto;
	}

	public static Mecanico buscarMecanico(ArrayList<Trabajador> trabajadores, String nombre) {
		Mecanico mecanico = null;
		int i = 0;

		while (mecanico == null && i < trabajadores.size()) {
			if (trabajadores.get(i) instanceof Mecanico && trabajadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				mecanico = (Mecanico) trabajadores.get(i);
			}
			i++;
		}
		return mecanico;

	}

	
	 public static void datosPiloto(Escuderia escuderias) {
	 
	 int edad, antiguedad, peso; float altura; String nombre, apellido;
	 
	 System.out.println("Introduzca los datos del piloto");
	 System.out.println("Introduzca el nombre"); nombre = sc.nextLine();
	 System.out.println("Introduzca el apellido"); apellido = sc.nextLine();
	 System.out.println("Introduzca la edad"); edad = sc.nextInt();
	 System.out.println("Introduzca la antiguedad"); antiguedad = sc.nextInt();
	 System.out.println("Introduzca al altura"); altura = sc.nextFloat();
	 System.out.println("Introduzca el peso"); peso = sc.nextInt();
	 
	 escuderias.agregarTrabajador(new Piloto(nombre, apellido, edad, antiguedad,altura, peso)); 
	 }
	 

	/*public static ArrayList<Object> datosPiloto() {
		ArrayList<Object> datos = new ArrayList<Object>();
		int edad, antiguedad, peso;
		float altura;
		String nombre, apellido;

		System.out.println("Introduzca los datos del piloto");

		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		datos.add(nombre); // datos.add(nombre = sc.nextLine());

		System.out.println("Introduzca el apellido");
		apellido = sc.nextLine();
		datos.add(apellido); // datos.add(apellido = sc.nextLine());

		System.out.println("Introduzca la edad");
		edad = sc.nextInt();
		datos.add(edad); // datos.add(edad = sc.nextInt());

		System.out.println("Introduzca la antiguedad");
		antiguedad = sc.nextInt();
		datos.add(antiguedad); // datos.add(antiguedad = sc.nextInt());

		System.out.println("Introduzca al altura");
		altura = sc.nextFloat();
		datos.add(altura); // datos.add(altura = sc.nextFloat());

		System.out.println("Introduzca el peso");
		peso = sc.nextInt();
		datos.add(peso); // datos.add(peso = sc.nextInt());

		return datos;

	}*/

	public static void datosMecanico(Escuderia escuderias) {
		int edad, antiguedad;
		boolean isEstudiosSuperiores;
		String nombre, apellido, estudios;
		System.out.println("Introduzca los datos del mecánico");
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca el apellido");
		apellido = sc.nextLine();
		System.out.println("Introduzca la edad");
		edad = sc.nextInt();
		System.out.println("Introduzca la antiguedad");
		antiguedad = sc.nextInt();
		System.out.println("El mecánico tiene estudios superiores de mecánica (si/no): ");
		estudios = sc.nextLine();
		sc.nextLine();

		if (estudios.equalsIgnoreCase(estudios)) {
			isEstudiosSuperiores = true;
		} else {
			isEstudiosSuperiores = false;
		}

		escuderias.agregarTrabajador(new Mecanico(nombre, apellido, edad, antiguedad, isEstudiosSuperiores));
	}

	/*
	 * public static ArrayList<Object> datosMecanico(){ ArrayList<Object> datos =
	 * new ArrayList<Object>();
	 * 
	 * int edad, antiguedad; boolean isEstudiosSuperiores; String nombre, apellido,
	 * estudios; System.out.println("Introduzca los datos del piloto");
	 * 
	 * System.out.println("Introduzca el nombre"); datos.add(nombre =
	 * sc.nextLine()); System.out.println("Introduzca el apellido");
	 * datos.add(apellido = sc.nextLine());
	 * System.out.println("Introduzca la edad"); datos.add(edad = sc.nextInt());
	 * System.out.println("Introduzca la antiguedad"); datos.add(antiguedad =
	 * sc.nextInt()); System.out.
	 * println("El mecánico tiene estudios superiores de mecánica (si/no): ");
	 * datos.add(estudios = sc.nextLine());
	 * 
	 * if (estudios.equalsIgnoreCase(estudios)) { isEstudiosSuperiores = true; }
	 * else { isEstudiosSuperiores = false; } return datos;
	 * 
	 * }
	 */

	public static void elegirTipoTrabajado(int opcion) {
		System.out.println();
	}

	private static String pedirNombreEscuderia() {

		String nombre;
		System.out.println("Introduzca el nombre de la escuderia");
		nombre = sc.nextLine();
		return nombre;

	}

	public static Escuderia buscarEscuderia(ArrayList<Escuderia> escuderias, String nombreEscuderia) {
		Escuderia escuderia = null;
		boolean encontrado = false;
		int i = 0;

		while (i < escuderias.size() && escuderia == null) {
			if (nombreEscuderia.equalsIgnoreCase(escuderias.get(i).getNombre())) {
				encontrado = true;
				escuderia = escuderias.get(i);
			}
			i++;
		}
		return escuderia;
	}

	public static void datosCoche(Escuderia escuderia) {
		int potencia, velocidadMax, precioMercado;
		String color;

		System.out.println("Introduzca los datos del coche");
		potencia = sc.nextInt();
		System.out.println("La potencia es " + potencia);
		velocidadMax = sc.nextInt();
		System.out.println("La velocidad máxima es " + velocidadMax);
		precioMercado = sc.nextInt();
		System.out.println("El precio de mercado es " + precioMercado);
		sc.nextLine();
		color = sc.nextLine();
		System.out.println("El color es " + color);

		escuderia.agregarCoche(new Coche(potencia, velocidadMax, color, precioMercado));
	}

}
