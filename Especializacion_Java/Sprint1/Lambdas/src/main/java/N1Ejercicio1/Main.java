package N1Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*A partir de una lista de Strings, escribe un método que devuelve una lista de todas las
        cadenas que contienen la letra 'o'. Imprime el resultado.*/

        List<String> lista = Arrays.asList("casa","olas","puente","oso","hola","hormiga","sol","mar");

        lista.stream()
                .filter (l -> l.contains("o"))
                .forEach(l -> System.out.print(l + " "));
        System.out.println("\n");


    }
}
