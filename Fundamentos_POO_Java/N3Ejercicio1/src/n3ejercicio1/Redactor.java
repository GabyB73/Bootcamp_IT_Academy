package n3ejercicio1;

public class Redactor {
	
	private String nombre;
	private final String dni = "";
	private float sueldo;
	
	public Redactor(String nombre, float sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}
	

	@Override
	public String toString() {
		return "Redactor [nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
