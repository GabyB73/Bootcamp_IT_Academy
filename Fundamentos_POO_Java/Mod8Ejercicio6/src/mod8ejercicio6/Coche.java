package mod8ejercicio6;

public class Coche {
	
	private static int idContador = 0;
	private final int id;
	private int potencia;
	private int VelocidadMax;
	private String color;
	private int precioMercado;
	
	public Coche(int potencia, int velocidadMax, String color, int precioMercado) {
		this.potencia = potencia;
		VelocidadMax = velocidadMax;
		this.color = color;
		this.precioMercado = precioMercado;
		this.id = idContador++;
	
		
	}
	public static int getIdContador() {
		return idContador;
	}
	public static void setIdContador(int idContador) {
		Coche.idContador = idContador;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidadMax() {
		return VelocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		VelocidadMax = velocidadMax;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecioMercado() {
		return precioMercado;
	}
	public void setPrecioMercado(int precioMercado) {
		this.precioMercado = precioMercado;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", potencia=" + potencia + ", VelocidadMax=" + VelocidadMax + ", color=" + color
				+ ", precioMercado=" + precioMercado + "]";
	}
	

}
