package herencia;

public class Piloto extends Trabajador {
	
	private float altura;
	private int peso;
	private static int peligrosidad = 50000;
	
	public Piloto(String nombre, String apellido, int edad, int antiguedad, float altura, int peso) {
		super(nombre, apellido, edad, antiguedad);
		this.altura = altura;
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

	@Override
	public String calcularSueldo() {
		super.setSueldo(super.sueldoBase + super.plusAntiguedad + peligrosidad);
		return "El sueldo del piloto es " + super.sueldo;
		
	}

	@Override
	public String toString() {
		return "Piloto : " + super.nombre + " " + super.apellido + " " + ", edad " + super.edad;
			
	}

	

}
