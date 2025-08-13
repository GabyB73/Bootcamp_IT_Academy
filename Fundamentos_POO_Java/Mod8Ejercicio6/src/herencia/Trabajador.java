package herencia;

public abstract class Trabajador {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int antiguedad;
	protected static int sueldoBase = 50000;
	protected static int plusAntiguedad = 10000;
	protected int sueldo;

	public Trabajador() {

	}

	public Trabajador(String nombre, String apellido, int edad, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public static int getSueldoBase() {
		return sueldoBase;
	}

	public static void setSueldoBase(int sueldoBase) {
		Trabajador.sueldoBase = sueldoBase;
	}

	public static int getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public static void setPlusAntiguedad(int plusAntiguedad) {
		Trabajador.plusAntiguedad = plusAntiguedad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public abstract String calcularSueldo();

}
