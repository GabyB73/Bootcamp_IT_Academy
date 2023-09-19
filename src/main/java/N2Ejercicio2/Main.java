package N2Ejercicio2;

public class Main {
    public static void main(String[] args) {

        GenericMethods<String> generico = new GenericMethods<>();

        generico.imprimirArgumentos("Hola", "Mundo");
        generico.imprimirArgumentos("Java", "es", "genial");
        generico.imprimirArgumentos("perro", "gato", "conejo", "vaca", "caballo");
    }
}
