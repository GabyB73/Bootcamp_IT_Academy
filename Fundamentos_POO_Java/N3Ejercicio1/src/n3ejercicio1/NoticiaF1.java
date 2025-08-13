package n3ejercicio1;

public class NoticiaF1 extends Noticia{
	
	private String escuderia;

	public NoticiaF1(String titular, String texto, int puntuacion, float precio, String escuderia) {
		super(titular, texto, puntuacion, precio);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public String calcularPrecioNoticia() {
		
		int precioInicial = 100;
		int ferrariMercedes = 50;
		
		int precioFinal = precioInicial + ferrariMercedes;
		
		String mensaje = "El precio de esta noticia es: " + precioFinal;
		return mensaje;
	}

	@Override
	public String calcularPuntuacionNoticia() {
		
		int puntosInicial = 4;
		int ferrariMercedes = 2;
		
		int puntosTotales = puntosInicial + ferrariMercedes;
		
		String mensaje = "Los puntos totales de esta noticia son: " + puntosTotales;
		
		return mensaje;
	}
	
	

}
