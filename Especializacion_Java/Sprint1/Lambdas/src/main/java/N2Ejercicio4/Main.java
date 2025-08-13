package N2Ejercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("hola", "42", "enero", "java", "17", "elefante", "camino","amor");

        ordenarCaracter(cadenas);
        ordenarPrimero(cadenas);
        reemplazarPor(cadenas);
        mostrarCadenasNumericas(cadenas);
    }
    public static void ordenarCaracter(List<String> cadenas) {
        System.out.println("Se ordenan las cadenas alfabéticamente");
        cadenas.sort(Comparator.comparing(c -> c.toString().charAt(0)));
        cadenas.forEach(System.out::println);
        System.out.println("\n");

    }

    public static void ordenarPrimero(List<String> cadenas) {
        System.out.println("Se ordenan primero las cadenas que comienzan con \"e\"");
        cadenas.stream().filter(c -> c.startsWith("e")).forEach(System.out::println);
        cadenas.stream().filter(c -> !c.startsWith("e")).forEach(System.out::println);
        System.out.println("\n");

    }

    public static void reemplazarPor(List<String> cadenas) {
        System.out.println("Se reemplazan las letras a por el número 4");
        cadenas.forEach(s -> System.out.println(s.replace("a", "4")));
        System.out.println("\n");

    }

    public static void mostrarCadenasNumericas(List<String> cadenas) {
        System.out.println("Se muestran sólo las cadenas que son numéricas");
        cadenas.stream().filter(s -> s.matches("\\d+")).forEach(System.out::println);
        System.out.println("\n");

    }
}
