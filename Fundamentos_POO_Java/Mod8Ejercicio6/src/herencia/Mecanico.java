package herencia;

public class Mecanico extends Trabajador {
	
	private boolean estudiosSuperiores;

	public Mecanico(String nombre, String apellido, int edad, int antiguedad, boolean estudiosSuperiores) {
		super(nombre, apellido, edad, antiguedad);
		this.estudiosSuperiores = estudiosSuperiores;
	}

	public boolean isEstudiosSuperiores() {
		return estudiosSuperiores;
	}

	public void setEstudiosSuperiores(boolean estudiosSuperiores) {
		this.estudiosSuperiores = estudiosSuperiores;
	}

	@Override
	public String calcularSueldo() {
		super.setSueldo(super.sueldoBase + super.plusAntiguedad * super.antiguedad);
		return "El sueldo del mecánico es " + super.sueldo;
		
		
	}

	
	public String toString() {
		return "Mecánico: " + super.nombre + " " + super.apellido + " " + ", edad " + super.edad;
	}

}
