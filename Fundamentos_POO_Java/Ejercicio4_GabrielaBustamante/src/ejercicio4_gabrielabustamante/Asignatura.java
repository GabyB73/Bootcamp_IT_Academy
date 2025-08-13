package ejercicio4_gabrielabustamante;

public class Asignatura {
	
	private String nombre;
	private String codigo;
	private int numcreditos;
	
	public Asignatura(String nombre, String codigo, int numcreditos) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.numcreditos = numcreditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumcreditos() {
		return numcreditos;
	}

	public void setNumcreditos(int numcreditos) {
		this.numcreditos = numcreditos;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + ", numcreditos=" + numcreditos + "]";
	}
	
	

}
