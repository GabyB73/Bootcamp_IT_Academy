package N1Ejercicio8;

public class Main {

    public static void main(String[] args) {

        /*Crea una Functional Interface que contenga un método llamado reverse().
        Este método debe recibir y debe devolver un String. En el main() de la clase principal,
        inyecta a la interfaz creada mediante una lambda, el cuerpo del método, de modo que devuelva
        la misma cadena que recibe como parámetro pero al revés. Invoca la instancia de la interfaz
        pasándole una cadena y comprueba si el resultado es correcto.*/

        String cadena = "Toto y Boris";
        String invertida = " ";
        FunctionalInterface functionalInterface = (c -> new StringBuilder(c).reverse().toString());
        invertida = functionalInterface.reverse(cadena);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);

    }

}
