package N1Ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*Tienes que hacer lo mismo que en el punto anterior, pero ahora, el método debe devolver
    una lista con los Strings que además de contener la letra 'o' también tienen más de 5 letras.
    Imprime el resultado.
     */

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("casa","olas","puente","oso","hola","hormiga","sol","mar");

        lista.stream()
                .filter (l -> l.contains("o") && l.length() > 5)
                .forEach(l -> System.out.print(l + " "));
        System.out.println("\n");

    }
}
