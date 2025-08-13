package n3ejercicio1;

public class NoticiaTenis extends Noticia{
	
	private String competicion;
	private String tenista;
	
	public NoticiaTenis(String titular, String texto, int puntuacion, float precio, String competicion,
			String tenista) {
		super(titular, texto, puntuacion, precio);
		this.competicion = competicion;
		this.tenista = tenista;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getTenista() {
		return tenista;
	}

	public void setTenista(String tenista) {
		this.tenista = tenista;
	}

	@Override
	public String calcularPrecioNoticia() {
		
		int precioInicial = 150;
		int federerNadalDjokovic = 100;
		
		int precioFinal = precioInicial + federerNadalDjokovic;
		
		String mensaje = "El precio de esta noticia es: " + precioFinal;
				
		return mensaje;
	}

	@Override
	public String calcularPuntuacionNoticia() {
		
		int puntosInicial = 4;
		int federerNadalDjokovic = 3;
		
		int puntosTotales = puntosInicial + federerNadalDjokovic;
		
		String mensaje = "Los puntos totales de esta noticia son: " + puntosTotales;
		
		return mensaje;
	}
	
	

}
