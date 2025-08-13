package Herencia;

public class Hotel extends Edificio {

	public static final int PLUSPELIGROSIDAD = 500;
	private int numeroHabitaciones;

	public Hotel(String nombre, int numeroPlantas, int superficie, int numeroHabitaciones) {
		super(nombre, numeroPlantas, superficie);
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public String servicioHabitaciones() {
		double numPersonal = Math.ceil(this.numeroHabitaciones / 20);
		int calculoCoste = (int) numPersonal * 1000;
		return "Se necesitan " + numPersonal + " personas para el servicio de habitaciones con un coste de "
				+ calculoCoste + " €";
	}

	@Override
	public String calcularCosteVigilancia() {
		double vigilantes = Math.ceil((double) super.superficie / 1000);
		double costeVigilante = 1300 + Hotel.PLUSPELIGROSIDAD;
		double costeVigilantes = costeVigilante * vigilantes;
		return "Se necesitan " + vigilantes + " vigilantes, con un coste mensual de " + costeVigilantes + " €";
	}

	@Override
	public String toString() {
		return "Hotel " + super.nombre + " de " + super.superficie + " m2 y " + super.numeroPlantas + " plantas. Tiene "
				+ this.numeroHabitaciones + " habitaciones.";
	}

}
