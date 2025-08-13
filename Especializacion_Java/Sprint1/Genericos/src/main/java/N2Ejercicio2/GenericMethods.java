package N2Ejercicio2;

public class GenericMethods<T> {
    public void imprimirArgumentos(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
