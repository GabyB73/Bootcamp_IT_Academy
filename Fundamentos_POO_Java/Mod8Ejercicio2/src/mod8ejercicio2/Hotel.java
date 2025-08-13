package mod8ejercicio2;

public class Hotel {

	private String nombre;
	private int numHabitaciones;
	private int numPlantas;
	private int totalSuperficie;
	
	
	public Hotel(String nombre, int numHabitaciones, int numPlantas, int totalSuperficie) {
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.totalSuperficie = totalSuperficie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}
	public int getTotalSuperficie() {
		return totalSuperficie;
	}
	public void setTotalSuperficie(int totalSuperficie) {
		this.totalSuperficie = totalSuperficie;
	}
	public String calcularMantenimiento() {
		int sueldo = 1500;
		int maxHabitaciones = 20;
		float calculoPersonal = (float)this.numHabitaciones/maxHabitaciones;
		calculoPersonal = (float)Math.ceil(calculoPersonal);
		int calculoCoste = (int)calculoPersonal * sueldo;
		return "Se necesita " + (int)calculoPersonal + " personas para el servicio con un coste total de " + calculoCoste;
	}
	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", numHabitaciones=" + numHabitaciones + ", numPlantas=" + numPlantas
				+ ", totalSuperficie=" + totalSuperficie + "]";
	}
	
}
