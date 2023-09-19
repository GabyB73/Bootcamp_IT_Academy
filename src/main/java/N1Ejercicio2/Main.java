package N1Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Pérez", 30);
        String cadena = "Hola, soy una cadena";
        int numero = 42;

        // Llama al método genérico con diferentes tipos de parámetros
        GenericMethods.imprimirArgumentos(persona, cadena, numero);
    }
}
