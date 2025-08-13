package mod3ejercicioextra3;

import java.util.Scanner;

public class Mod3EjercicioExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		final int COBERTURALITRO = 12;
		float altoPared, anchoPared, areaRect, totalLitrosPintura;
		int manoPintura;
		
		System.out.println("¿Cuál es el alto de la pared?");
		altoPared = teclado.nextFloat();
		
		System.out.println("¿Cuál es el ancho de la pared?");
		anchoPared = teclado.nextFloat();
		
		System.out.println("¿Cuántas manos de pintura quieres dar?");
		manoPintura = teclado.nextInt();
		
		areaRect = altoPared * anchoPared;
		
		totalLitrosPintura = (areaRect / COBERTURALITRO) * manoPintura;
		
		System.out.println("Necesitarás " + totalLitrosPintura + " litros de pintura para pintar tu pared");

	}

}
