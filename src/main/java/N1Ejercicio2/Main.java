package N1Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("X5", 265);
        Coche coche2 = new Coche("X2", 190);


        // Llamar al método estático frenar
        System.out.println(Coche.frenar());

        // Llamar al método no estático acelerar
        System.out.println(coche1.acelerar());

        System.out.println("Información del coche 1: " + coche1.toString());
        System.out.println("Información del coche 2: " + coche2.toString());

    }


}
