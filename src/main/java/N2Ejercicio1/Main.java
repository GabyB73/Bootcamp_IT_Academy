package N2Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nombresPropios = Arrays.asList("Alaska", "AFA", "Ana", "Mendoza", "Barcelona", "Gabriela");
        nombresPropios.stream()
                .filter (n -> n.startsWith("A") && n.length() == 3)
                .forEach(n -> System.out.print(n + " "));


    }
}
