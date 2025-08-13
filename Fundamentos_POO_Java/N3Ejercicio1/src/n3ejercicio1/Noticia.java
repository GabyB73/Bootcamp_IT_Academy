package n3ejercicio1;

public abstract class Noticia {

	private String titular;
	private String texto;
	private int puntuacion;
	private float precio;

	public Noticia(String titular, String texto, int puntuacion, float precio) {

		this.titular = titular;
		this.texto = texto;
		this.puntuacion = puntuacion;
		this.precio = precio;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public abstract String calcularPrecioNoticia();
	
	public abstract String calcularPuntuacionNoticia();
		
	

}
