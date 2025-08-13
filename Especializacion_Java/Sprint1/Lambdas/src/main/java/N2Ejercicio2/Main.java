package N2Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(modificarNumeros());
    }

    public static String modificarNumeros() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // La expresión "e%d" formatea el número par con la letra "e" precediendo al número
        // La expresión "o%d" formatea el número impar con la letra "o" precediendo al número

        String resultado = numeros.stream()
                .map(n -> n % 2 == 0 ? String.format("e%d", n) : String.format("o%d", n))
                .collect(Collectors.joining(", "));

        return resultado;
    }
}






