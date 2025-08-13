package n2ejercicio1;
import java.util.Scanner;

public class N2ejercicio1 {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone("huawei","p30");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número de teléfono");
		String numero = sc.nextLine();
		
		System.out.println(smartphone.llamar(numero));
		
		System.out.println(smartphone.fotografiar());
		
		System.out.println(smartphone.alarma());
		
		
	}

}
