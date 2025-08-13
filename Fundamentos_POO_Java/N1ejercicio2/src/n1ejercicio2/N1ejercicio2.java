package n1ejercicio2;

public class N1ejercicio2 {

	public static void main(String[] args) {

		Coche coche1 = new Coche("X5", 265);
		Coche coche2 = new Coche("X2", 190);

		//String marcaCoche = Coche.getMarca();

	    //System.out.println("Marca del coche: " + marcaCoche);
	    //System.out.println("Coche 1: " + coche1.getModelo() + coche1.getPotencia());
	   // System.out.println("Coche 2: " + coche2.getModelo() + coche2.getPotencia());


		// Llamo al método estático frenar
		System.out.println(Coche.frenar());

		// Llamo al método no estático acelerar
		System.out.println(coche1.acelerar());
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());

	}

}
