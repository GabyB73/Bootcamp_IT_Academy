package mod72ejercicioextra;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod72EjercicioExtra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el total de votantes");
		int totalVotantes = sc.nextInt();

	}

	public static void candidatos(char nombre) {
		String lectura;

		final char CANDIDATO1 = 'p';
		final char CANDIDATO2 = 'm';

		Scanner sc = new Scanner(System.in);
		ArrayList<String> candidato1 = new ArrayList<String>();
		ArrayList<String> candidato2 = new ArrayList<String>();

		System.out.println("Vota a tu candidato: Pedro / Maria");
		lectura = sc.nextLine();
		lectura = lectura.toLowerCase();
		nombre = lectura.charAt(0);

		candidato1.add(lectura);
		candidato2.add(lectura);

	}

	public static ArrayList<Integer> totalVotos(int numero) {

		int totalVotantes, votos;

		ArrayList<Integer> candidato1 = new ArrayList<Integer>();
		ArrayList<Integer> candidato2 = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el total de votantes");
		totalVotantes = sc.nextInt();

		switch (totalVotantes) {
		case 1:

			if (totalVotantes == 0 && candidato1.size() == 0) {
				for (int i = 0; i < totalVotantes; i++) {
					candidato1.add(i);
					return candidato1;
				}

			}
			
			break;

		case 2:

			if (totalVotantes == 0 && candidato2.size() == 0) {
				for (int i = 0; i < totalVotantes; i++) {
					candidato2.add(i);
					return candidato2;
				}
			}
			
			
			break;

			
		default:

		}
	}
}
