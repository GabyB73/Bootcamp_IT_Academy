package Herencia;

public abstract class Edificio {

	protected String nombre;
	protected int numeroPlantas;
	protected int superficie;

	public Edificio(String nombre, int numeroPlantas, int superficie) {
		this.nombre = nombre;
		this.numeroPlantas = numeroPlantas;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public String limpiar() {
		double tiempoLimpieza = Math.ceil((double) this.superficie / 5); // esto me da el total de minutos por m2, ej:
																			// 4000m2 / 5 = 800 minutos
		double tiempoPlantas = Math.ceil((double) (this.numeroPlantas - 1) * 0.5); // esto es el tiempo que se tarda en
																					// subir las plantas
		double precioTrabajo = Math.ceil(tiempoPlantas + tiempoLimpieza) * 1;
		int calculoCosteMensual = (int) precioTrabajo * 30;

		return "Se ha tardado en limpiar el edificio " + tiempoLimpieza + " minutos," + " con un coste mensual de "
				+ calculoCosteMensual + "€";

	}

	public abstract String calcularCosteVigilancia();

	@Override
	public String toString() {
		return "Edificio [nombre=" + nombre + ", numeroPlantas=" + numeroPlantas + ", superficie=" + superficie + "]";
	}
}