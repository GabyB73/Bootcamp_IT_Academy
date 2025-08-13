package mod6ejemplometodos;

import java.util.Scanner;

public class Nod6EjemploMetodos {

	public static void main(String[] args) {
		
		//import java.util.Scanner;

		//public class AppFuncions {

			//public static void main(String[] args) { 

				Scanner input = new Scanner(System.in);
				System.out.println("Escriu un num");
		    	int num1 = input.nextInt();
				
				int n1 = 100;
			    int n2 = 20;

			    //Llamadas a funciones
			    sumaNoParamNoReturn();

			    sumaSiParamNoReturn(n1, 15);
			    sumaSiParamNoReturn(num1, n2);
			    sumaSiParamNoReturn(sumSiParamSiReturn(n2,20), n2);
			  
			    
			    int resultado = sumSiParamSiReturn(n2,20);
			    System.out.println("IMPRIMIMOS EL RETURN DE LA FUNCION"  +resultado);
			    System.out.println("IMPRIMIMOS DE NUEVO EL RETURN DE LA FUNCION"  +sumSiParamSiReturn(n2,20));
			    
			    
			    int resultado2 = sumNoParamSiReturn();
			    System.out.println("IMPRIMIMOS EL RETURN DE LA FUNCION"  +resultado2);
			    System.out.println("IMPRIMIMOS DE NUEVO EL RETURN DE LA FUNCION"  +sumNoParamSiReturn());
			}
			
			
		    static public void sumaNoParamNoReturn(){
		    
		    	Scanner input = new Scanner(System.in);
		        
		        System.out.println("Escriu el num1");
		    	int numero1 = input.nextInt();
		    	input.nextLine();
		    	
		    	System.out.println("Escriu el num2");
		    	int numero2 =input.nextInt();
		        input.nextLine();
		        
		        System.out.println("LA FUNCION ESCRIBE EN CONSOLA LA SUMA"  + (numero1+numero2));
		    }


		    //Método1 SI parametros  NO return
		    static public void sumaSiParamNoReturn(int p1, int p2){ 
		        int resultado = p1 + p2;
		        System.out.println("LA FUNCION ESCRIBE EN CONSOLA LA SUMA"  +resultado);
		        
		    }


		    //Método2 SI parametros  SI return
		    static public int sumSiParamSiReturn(int n1, int n2){
		        return n1 + n2;
		        //int numero1;    //nunca se ejecutaría esta linea
		    }


		    //Método3 NO parametros  SI return
		    static public int sumNoParamSiReturn(){
		    	Scanner input = new Scanner(System.in);
		        
		        System.out.println("Escriu el num1");
		    	int numero1 = input.nextInt();
		    	input.nextLine();
		    	
		    	System.out.println("Escriu el num1");
		    	int numero2 =input.nextInt();
		        input.nextLine();
		        
		        return numero1 + numero2;
		    }
		    
		   

}


