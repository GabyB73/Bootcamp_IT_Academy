package n3ejercicio1;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia {
	
	private String competicion;
	private String club;
	private String jugador;
	
	public NoticiaFutbol(String titular, String texto, int puntuacion, float precio, String competicion, String club,
			String jugador) {
		super(titular, texto, puntuacion, precio);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String calcularPrecioNoticia1() {
		
		int precioInicial = 300;
		int ligaDeCampeones = 100;
		int clubBarcelona= 100;
		int clubMadrid = 100;
		int golDeFerranTorres = 50;
		int golDeBenzema = 50;
		
		
		
		//int precioFinal = precioInicial + ligaDeCampeones + barcaMadrid + ferranTorresBenzema;
		
		String mensaje ="El precio de esta noticia es: " + precioFinal;
		return mensaje;
		
	}
	public void calcularPrecioNoticia() {
		int precioInicial = 300;
		int ligaDeCampeones = 100;
		int clubBarcelona= 100;
		int clubMadrid = 100;
		int golDeFerranTorres = 50;
		int golDeBenzema = 50;
		
		if(precioInicial == 300) {
			System.out.println("El precio de la noticia es: " + precioInicial);
			
		}else if(ligaDeCampeones == 100) {
			System.out.println("El precio de la noticia es: " + (precioInicial + ligaDeCampeones));
		}else if(clubBarcelona == 100) {
			System.out.println("El precio de la noticia es: " + (precioInicial + clubBarcelona));
		}else if(ligaDeCampeones == 100 || clubBarcelona == 100) {
			System.out.println("El precio de la noticia es: " + (precioInicial + ligaDeCampeones + clubBarcelona));
		}else if(ligaDeCampeones == 100 || clubMadrid == 100) {
			System.out.println("El precio de la noticia es: " + (precioInicial + ligaDeCampeones + clubMadrid));
		}else if(ligaDeCampeones == 100 || clubBarcelona == 100 || golDeFerranTorres == 50) {
			System.out.println("El precio de la noticia es: " + (precioInicial + ligaDeCampeones + clubBarcelona + golDeFerranTorres ));
		}else if(ligaDeCampeones == 100 || clubMadrid == 100 || golDeBenzema == 50) {
			System.out.println("El precio de la noticia es: " + (precioInicial + ligaDeCampeones + clubMadrid + golDeBenzema));
		}
		
	}
	
	public static byte seleccionarNoticia() {
		Scanner sc = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("Menú Principal\nElija una opción: ");
			System.out.println("1.La noticia es sobre la liga de campeones?");
			System.out.println("2.La noticia es sobre el Club Barcelona?");
			System.out.println("3.La noticia es sobre el Club Real Madrid?");
			System.out.println("4.La noticia es sobre un gol del jugador Ferran Torres?");
			System.out.println("5.La noticia es sobre un gol del judador Benzema??");
			System.out.println("0.Salir de la aplicación");

			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	@Override
	public String calcularPuntuacionNoticia() {
		int puntosInicial = 5;
		int ligaCampeones = 3;
		int liga = 2;
		int barcaMadrid = 1;
		int ferranTorresBenzema = 1;
		
		int puntosTotales = puntosInicial +ligaCampeones + liga + barcaMadrid + ferranTorresBenzema;
		
		String mensaje = "Los puntos totales de esta noticia son: " + puntosTotales;
		
		return mensaje;
	}



	

}
