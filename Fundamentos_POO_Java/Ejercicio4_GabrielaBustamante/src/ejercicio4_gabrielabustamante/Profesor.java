package ejercicio4_gabrielabustamante;

public class Profesor {
	
	private String nombre;
	private String dni;
	private String asignaturaImparte;
	
	
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


	public String getAsignaturaImparte() {
		return asignaturaImparte;
	}


	public void setAsignaturaImparte(String asignaturaImparte) {
		this.asignaturaImparte = asignaturaImparte;
	}


	public Profesor(String nombre, String dni, String asignaturaImparte) {
		this.nombre = nombre;
		this.dni = dni;
		this.asignaturaImparte = asignaturaImparte;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", dni=" + dni + ", asignaturaImparte=" + asignaturaImparte + "]";
	}
	
	

}
