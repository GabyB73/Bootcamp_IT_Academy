package Herencia;

public class Hospital extends Edificio {

	public static final int RACIONESDIARIAS = 3;
	private int enfermos;

	public Hospital(String nombre, int numeroPlantas, int superficie, int enfermos) {
		super(nombre, numeroPlantas, superficie);
		this.enfermos = enfermos;
	}

	public int getEnfermos() {
		return enfermos;
	}

	public void setEnfermos(int enfermos) {
		this.enfermos = enfermos;
	}

	public String repartirComida() {
		return "Se están repartiendo " + (this.enfermos * Hospital.RACIONESDIARIAS) + " raciones.";
	}

	@Override
	public String calcularCosteVigilancia() {
		double vigilantes = Math.ceil((double) this.getSuperficie() / 1000);
		double costeVigilante = (vigilantes * 1300);
		return "El coste mensual de la contratación de vigilantes es de " + costeVigilante + " €," + " son necesarios "
				+ vigilantes + " vigilantes.";
	}

	@Override
	public String toString() {
		return "Hospital " + super.nombre + ", de " + super.superficie + " m2 y " + super.numeroPlantas
				+ " plantas. En este momento tiene " + this.enfermos + " enfermos.";
	}

}
