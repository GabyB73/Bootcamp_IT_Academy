package ejercicio3_gabrielabustamante;

import java.util.ArrayList;

public class Ejercicio3_GabrielaBustamante {

	public static void main(String[] args) {

		/*
		 * Ens donen dos arrays. En un hi ha hashtags d’una publicació i en l'altre
		 * hashtags que volem saber si estan a la primera llista. Hashtags publicats:
		 * "#work", "#paradise", "#beach", "#working", "#sun", "#barcelona", "#menorca",
		 * "#developer", "#athome", "#natural", "#natura" Hashtags comprobats:
		 * "#paradise", "#sun", "#menorca", "#athome", "#natura", "#llimonada" Crea un
		 * tercer array amb els productes que estan en els dos arrays.
		 */

		ArrayList<String> publicados = new ArrayList<String>();
		publicados.add("#work");
		publicados.add("#paradise");
		publicados.add("#beach");
		publicados.add("#working");
		publicados.add("#sun");
		publicados.add("#barcelona");
		publicados.add("#menorca");
		publicados.add("#developer");
		publicados.add("#athome");
		publicados.add("#natural");
		publicados.add("#natura");
		
		ArrayList<String> comprobados = new ArrayList<String>();
		
		comprobados.add("#paradise");
		comprobados.add("#sun");
		comprobados.add("#menorca");
		comprobados.add("#athome");
		comprobados.add("#natura");
		comprobados.add("#llimonada");
		
		for(String palabra : publicados) {
			if(comprobados.contains(palabra)) {
				ArrayList<String> palabrasRepetidas = new ArrayList<String>();
				palabrasRepetidas.add(palabra);
				
				System.out.println(palabrasRepetidas);
				
			}
		}
		
		

	}

}
