package N1Ejercicio1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods pruebaOrdenado = new NoGenericMethods("sol", "luna", "cielo");
        NoGenericMethods pruebaDesordenado = new NoGenericMethods("cielo", "sol", "luna");

        System.out.println(pruebaOrdenado);
        System.out.println(pruebaDesordenado);
    }
}
