package n3ejercicio1;

public class NoticiaMotociclismo extends Noticia {
	
	private String equipo;

	public NoticiaMotociclismo(String titular, String texto, int puntuacion, float precio, String equipo) {
		super(titular, texto, puntuacion, precio);
		this.equipo = equipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	@Override
	public String calcularPrecioNoticia() {
		
		int precioInicial = 100;
		int hondaYamaha = 50;
		int precioFinal = precioInicial + hondaYamaha;
		
		String mensaje = "El precio de esta noticia es: " + precioFinal;
		
		
		return mensaje;
	}

	@Override
	public String calcularPuntuacionNoticia() {
		
		int puntosInicial = 3;
		int hondaYamaha = 3;
		
		int puntosTotales = puntosInicial + hondaYamaha;
		
		String mensaje = "Los puntos totales de esta noticia son: " + puntosTotales;
		
		return mensaje;
	}
	
	

}
