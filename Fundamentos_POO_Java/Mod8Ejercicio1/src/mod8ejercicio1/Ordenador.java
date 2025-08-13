package mod8ejercicio1;

public class Ordenador {
	
	private String marca;
	private String modelo;
	private String procesador;
	private int memoriaRam;
	private int capacidadDiscoDuro;
	
	public Ordenador(String marca, String modelo, String procesador, int memoriaRam, int capacidadDiscoDuro) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoriaRam = memoriaRam;
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}
		public Ordenador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
		public String getMarca() {
			return marca;
		}
		public String getModelo() {
			return modelo;
		}
		public String getProcesador() {
			return procesador;
		}
		public void setProcesador(String procesador) {
			this.procesador = procesador;
		}
		public int getMemoriaRam() {
			return memoriaRam;
		}
		public void setMemoriaRam(int memoriaRam) {
			this.memoriaRam = memoriaRam;
		}
		public int getCapacidadDiscoDuro() {
			return capacidadDiscoDuro;
		}
		public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
			this.capacidadDiscoDuro = capacidadDiscoDuro;
		}
		public String ejecutarPrograma(String programa) {
			return "Se está ejecutando " + programa + ".";
		}
		@Override
		public String toString() {
			return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", memoriaRam="
					+ memoriaRam + ", capacidadDiscoDuro=" + capacidadDiscoDuro + "]";
		}
		
		
		
		}
	
		
	
	
	


