package mod6ejercicioextrauno;

import java.util.ArrayList;

public class Mod6EjercicioExtraUno {

	public static void main(String[] args) {
		
		
				metodo1();
				ArrayList<Integer> lista = new ArrayList<Integer>(); 	
				lista.add(8);
				lista.add(12);
				lista.add(5);
				lista.add(22);
				lista.add(6);
				int indice = metodo2(lista);
				System.out.println(lista.get(indice));
				ArrayList<String> nombres = new ArrayList<String>();
				nombres.add("Noa");
				nombres.add("Peter");
				nombres.add("Victoria");
				nombres.add("Dani");
				nombres.add("Sara");
				
				indice = metodo3(nombres);
				System.out.println(nombres.get(indice));
				
				ArrayList<Integer> valores = metodo4(1,10);
				for( int valor : valores ){
					System.out.println(valor);
				}
				
				
			}

			public static void metodo1() {
				System.out.println("I am a method");
			}
			
			public static int metodo2(ArrayList<Integer> lista) {
				int mayor = lista.get(0);
				int menor = lista.get(0);
				int posicionMenor = 0;
				
			
				
				for(int i = 1 ;i < lista.size(); i++ ) {
					mayor = (mayor > lista.get(i)) ? mayor : lista.get(i);
					
				}
				System.out.println("El numero mayor es " + mayor);
				for(int i = 1; i < lista.size(); i++) {
					menor = (menor < lista.get(i)) ? menor : lista.get(i);
				
					if(menor < lista.get(i)) {
					menor = menor;
					posicionMenor = posicionMenor;
					
				} else {
					menor = lista.get(i);
					posicionMenor = i;
					
				}
				
				}
				return posicionMenor;
				
				//System.out.println("El numero menor es " + menor + " y la posicion del numero menor es " + posicionMenor);
			}
			
			    public static int metodo3(ArrayList<String> nombres) {
			    int mayor = nombres.get(0).length();
			    int indiceMayor = 0;
			    for( int i = 1; i < nombres.size(); i++ ) {
			    	if( mayor > nombres.get(i).length()) {
			    		indiceMayor = indiceMayor;
			    		
			    	
			    	}
			    	else { 
			    		mayor = nombres.get(i).length();
			    		indiceMayor = i;
			    	}
			    }
			    	return indiceMayor;
			    }
			    public static ArrayList<Integer> metodo4(int num1, int num2) {
			    	ArrayList<Integer> valores = new ArrayList<Integer>();
			    	for(int i = num1; i <= num2; i++ ) {
			    	valores.add(i);
			    	}
			    	return valores;
			    }
		}


	


