package s102n1ejercicio1;

public class VentaVaciaException extends Exception { // la clase exception obliga a try-catch

	public VentaVaciaException() {}

public VentaVaciaException(String mensaje) {
	super(mensaje);
	
}
}
