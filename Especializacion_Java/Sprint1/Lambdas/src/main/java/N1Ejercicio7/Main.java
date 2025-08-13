package N1Ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Con la lista del ejercicio anterior, ahora ordénala al revés, de cadena más larga a más corta.*/

        List<Object> cadenas = Arrays.asList(400, "gatos", "perros", 3, "la montaña mágica", "helado", 25 );

        cadenas.sort(Comparator.comparing(c -> c.toString().length()).reversed());
        cadenas.forEach(System.out::println);

    }
}
