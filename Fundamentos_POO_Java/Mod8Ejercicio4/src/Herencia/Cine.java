package Herencia;

public class Cine extends Edificio {

	private int aforo;

	public Cine(String nombre, int numeroPlantas, int superficie, int aforo) {
		super(nombre, numeroPlantas, superficie);
		this.aforo = aforo;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public String proyectarSesion(int numAsistentes, int precioEntrada) {
		int recaudacion = 0;

		if (numAsistentes > this.aforo) {
			System.out.println("El número de asistentes supera el aforo máximo");
			recaudacion = precioEntrada * aforo;
		} else {
			recaudacion = precioEntrada * numAsistentes;
		}

		return "Se han recaudado " + recaudacion + " €";
	}

	@Override
	public String calcularCosteVigilancia() {
		double vigilantes = Math.ceil((double) super.superficie / 3000); // aqui poner super.superficie en lugar de
																			// this.getSuperficie
		double costeVigilantes = (vigilantes * 1300);
		return "Se necesitan " + vigilantes + " vigilantes, con un coste mensual de " + costeVigilantes + " €. ";
	}

	@Override
	public String toString() {
		return "Cine " + super.nombre + ", de " + super.superficie + " m2 y " + super.numeroPlantas + " plantas";
	}
}
