package mod8ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod8Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente("Mar", "Soto");
		Cliente cliente2 = new Cliente("Carlos", "García");
		Cliente cliente3 = new Cliente("Luisa", "Pérez");
		Cliente cliente4 = new Cliente("Verónica", "Sánchez");

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);

		Cuenta cuenta1 = new Cuenta(1, 50);
		Cuenta cuenta2 = new Cuenta(1, 50);

		Cliente cliente = clientes.get(1);
		cliente.agregarCuenta(cuenta1);

		clientes.get(2).getCuentas().add(cuenta1);
		int opcion;

		do {
			opcion = menu();

			switch (opcion) {

			case 0:
				System.out.println("Salir de la aplicación");
				break;
			case 1:
				crearCliente(clientes);
				break;
			case 2:
				eliminarCliente(clientes);
				break;
			case 3:
				crearCuenta(clientes);
				break;
			case 4:
				ingresarEurosCuentaCliente(clientes);
				break;
			case 5:
				retirarEurosCuentaCliente(clientes);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	public static byte menu() {
		Scanner sc = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("MENU PRINCIPAL\nSeleccione la oparación que desea realizar: ");
			System.out.println("0. Salir de la aplicación");
			System.out.println("1. Crear cliente");
			System.out.println("2. Eliminar cliente");
			System.out.println("3. Crear cuenta cliente");
			System.out.println("4. Ingresar euros en una cuenta del cliente");
			System.out.println("5. Retirar euros de una cuenta del cliente");

			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void crearCliente(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el nombre del cliente");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el apellido del cliente");
		String apellido = sc.nextLine();

		Cliente cliente = buscarCliente(nombre, apellido, clientes);

		if (cliente != null) {
			System.out.println("El cliente " + nombre + " " + apellido + " " + " ya existe");

		} else {
			Cliente cliente1 = new Cliente(nombre.toUpperCase(), apellido.toUpperCase()); // Instancio nuevo cliente y
																							// añado al ArrayList
			clientes.add(cliente1);

			System.out.println("Nuevo Cliente: " + nombre + " " + apellido);
		}

	}

	private static Cliente buscarCliente(String nombre, String apellido, ArrayList<Cliente> clientes) {
		Cliente clienteEncontrado = null;
		int i = 0;
		int size = clientes.size();

		while (clienteEncontrado == null && i < size) {
			if (nombre.equalsIgnoreCase(clientes.get(i).getNombre())
					&& apellido.equalsIgnoreCase(clientes.get(i).getApellido())) {
				clienteEncontrado = clientes.get(i);
			}
			i++;
		}
		return clienteEncontrado;

	}

	public static void eliminarCliente(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del cliente que quiere eliminar");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el apellido del cliente que quiere eliminar");
		String apellido = sc.nextLine();

		Cliente cliente = buscarCliente(nombre, apellido, clientes);

		if (cliente == null) {
			System.out.println("El cliente que desea eliminar no existe");

		} else {
			clientes.remove(cliente);
			System.out.println("El cliente " + nombre + " " + apellido + " " + " ha sido eliminado");

		}

	}

	public static void crearCuenta(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente = introducirDatosCliente(clientes);

		if (cliente == null) {
			System.out.println("Este cliente no existe");
		} else {
			int numCuenta;
			System.out.println("Introduzca el número de cuenta");
			numCuenta = sc.nextInt();

			Cuenta cuenta = buscarCuentaCliente(numCuenta, cliente.getCuentas());

			if (cuenta == null) {
				Cuenta cuentaCorriente = new Cuenta(numCuenta, 0);
				cliente.agregarCuenta(cuentaCorriente);
				// cliente.getCuentas().add(cuentaCorriente);
				System.out.println("El número de cuenta[" + cuentaCorriente.getNumCuenta() + "] creada con saldo 0 €");
			} else {
				System.out.println(
						"El cliente " + cliente.getNombre() + cliente.getApellido() + " ya tiene una cuenta asignada");
			}
		}

	}

	private static Cliente introducirDatosCliente(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);

		System.out.println("......Indique los datos del cliente......");
		System.out.println("Introduzca el nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el apellido");
		String apellido = sc.nextLine();

		return buscarCliente(nombre, apellido, clientes);
	}

	private static Cuenta introducirDatosCuenta(Cliente cliente) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número de cuenta a consultar");
		int numeroCuenta = sc.nextInt();

		return buscarCuentaCliente(numeroCuenta, cliente.getCuentas());
	}

	private static Cuenta buscarCuentaCliente(int numeroCuenta, ArrayList<Cuenta> cuentas) {
		Cuenta cuenta = null;
		int i = 0;
		while (i < cuentas.size() && cuenta == null) {
			if (cuentas.get(i).getNumCuenta() == numeroCuenta) {
				cuenta = cuentas.get(i);
			}
			i++;

		}
		return cuenta;

	}

	public static void ingresarEurosCuentaCliente(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente = introducirDatosCliente(clientes);

		if (cliente == null) {
			System.out.println("El cliente no existe");
		} else {
			if (cliente.getCuentas().size() == 0) {
				System.out.println("El cliente " + cliente.getNombre() + " " + cliente.getApellido() + " "
						+ " no tiene una cuenta asociada ");
			} else {
				Cuenta cuentaCorriente = introducirDatosCuenta(cliente);
				if (cuentaCorriente == null) {
					System.out.println("La cuenta no existe");
				} else {
					int cantidadIngreso = 0;
					System.out.println("El saldo de su cuenta es: " + cuentaCorriente.getSaldo() + "€");
					System.out.println("¿Qué cantidad desea ingresar?");
					cantidadIngreso = sc.nextInt();
					cuentaCorriente.ingresar(cantidadIngreso);
					System.out.println(
							"El saldo actual de su cuenta es: " + (cuentaCorriente.getSaldo() + cantidadIngreso) + "€");

				}
			}
		}

	}

	public static void retirarEurosCuentaCliente(ArrayList<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente = introducirDatosCliente(clientes);

		if (cliente == null) {
			System.out.println("El cliente no existe");
		} else {
			if (cliente.getCuentas().size() == 0) {
				System.out.println("El cliente " + cliente.getNombre() + " " + cliente.getApellido() + " "
						+ " no tiene una cuenta asociada ");
			} else {
				Cuenta cuentaCorriente = introducirDatosCuenta(cliente);
				if (cuentaCorriente == null) {
					System.out.println("La cuenta no existe");
				} else {
					int cantidadRetiro = 0;
					System.out.println("El saldo de su cuenta es: " + cuentaCorriente.getSaldo() + "€");
					System.out.println("¿Qué cantidad desea retirar?");
					cantidadRetiro = sc.nextInt();
					cuentaCorriente.retirar(cantidadRetiro);
					System.out.println(
							"El saldo actual de su cuenta es: " + (cuentaCorriente.getSaldo() - cantidadRetiro) + "€");

				}
			}
		}
	}
}
