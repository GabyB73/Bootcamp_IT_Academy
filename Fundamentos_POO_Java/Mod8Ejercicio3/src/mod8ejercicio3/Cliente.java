package mod8ejercicio3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuentas; // aquí hago la asociación entre cliente y cuenta

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void agregarCuenta(Cuenta cuenta) { // hace el add al array de cuentas
		cuentas.add(cuenta);
	}

	public void mostrarCuenta() {
		for (Cuenta cuenta : cuentas) {
			cuenta.toString();
		}

	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
