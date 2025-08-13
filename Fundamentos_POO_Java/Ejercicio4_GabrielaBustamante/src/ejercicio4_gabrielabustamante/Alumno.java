package ejercicio4_gabrielabustamante;

public class Alumno {
	
	private String nombre;
	private String dni;
	private String asignaturaCursando;
	private int numCreditos;
	private int notas;
	
	
	public Alumno(String nombre, String dni, String asignaturaCursando, int numCreditos, int notas) {
		this.nombre = nombre;
		this.dni = dni;
		this.asignaturaCursando = asignaturaCursando;
		this.numCreditos = numCreditos;
		this.notas = notas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getAsignaturaCursando() {
		return asignaturaCursando;
	}


	public void setAsignaturaCursando(String asignaturaCursando) {
		this.asignaturaCursando = asignaturaCursando;
	}


	public int getNumCreditos() {
		return numCreditos;
	}


	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}


	public int getNotas() {
		return notas;
	}


	public void setNotas(int notas) {
		this.notas = notas;
	}
	
	public void notaMedia(int notas) {
		int notaMedia = notas += notas / notas;
		System.out.println("La nota media del alumno es " + notaMedia);
	}
	public void totalCreditos ( int numCreditos) {
		int totalCreditos = numCreditos=+ numCreditos;
		System.out.println("El total de los créditos es " + totalCreditos);
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", asignaturaCursando=" + asignaturaCursando
				+ ", numCreditos=" + numCreditos + ", notas=" + notas + "]";
	}
	
	

}
