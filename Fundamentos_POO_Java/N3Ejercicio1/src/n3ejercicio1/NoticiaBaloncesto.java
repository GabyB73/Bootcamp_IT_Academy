package n3ejercicio1;

public class NoticiaBaloncesto extends Noticia{
	
	private String competicion;
	private String club;
	
	public NoticiaBaloncesto(String titular, String texto, int puntuacion, float precio, String competicion,
			String club) {
		super(titular, texto, puntuacion, precio);
		this.competicion = competicion;
		this.club = club;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String calcularPrecioNoticia() {
		
		int precioInicial = 250;
		int euroliga = 75;
		int barcaMadrid = 75;
		
		int precioFinal = precioInicial + euroliga + barcaMadrid;
		
		String mensaje ="El precio de esta noticia es: " + precioFinal;
			
		return mensaje;
	}

	@Override
	public String calcularPuntuacionNoticia() {
		
		int puntosInicial = 4;
		int euroliga = 3;
		int abc = 2;
		int barcaMadrid = 1;
		
		int puntosTotales = puntosInicial + euroliga + abc + barcaMadrid;
		
		String mensaje = "Los puntos totales de esta noticia son: " + puntosTotales;
		
		return mensaje;
	}
	
	
	

}
