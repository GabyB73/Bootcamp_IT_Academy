package N1Ejercicio2;

public class GenericMethods {
    public static <T> void imprimirArgumentos(T arg1, T arg2, T arg3) {
        System.out.println("Argumento 1: " + arg1);
        System.out.println("Argumento 2: " + arg2);
        System.out.println("Argumento 3: " + arg3);
    }
}
