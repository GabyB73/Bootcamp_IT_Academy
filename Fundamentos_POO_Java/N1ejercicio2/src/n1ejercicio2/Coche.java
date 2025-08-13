package n1ejercicio2;

public class Coche {
	
	private static final String MARCA = "BMW"; //Constante (static final)
	private static String modelo;			   //variable estática (static)	
	private final int POTENCIA;				   //Constante (final)
	
	// Constructor de la clase Coche
   public Coche(String modelo, int potencia) {
        this.modelo = modelo;
        this.POTENCIA = potencia;
    }
// Getters para modelo y POTENCIA
   public static String getModelo() {
       return modelo;
   }

   public int getPotencia() {
       return POTENCIA;
   }
   //Método estático para frenar
	public static String frenar() {
		String mensaje = "El vehículo está frenando";
		return mensaje;
	}
	
	//Método no estático para acelerar
	public String acelerar() {
		String mensaje = "El vehículo está acelerando";
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "Coche [POTENCIA=" + POTENCIA + ", getPotencia()=" + getPotencia() + ", acelerar()=" + acelerar() + "]";
	}
	
	
}
