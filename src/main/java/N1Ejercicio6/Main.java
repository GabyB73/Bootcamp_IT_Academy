package N1Ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.*/

        List<Object> cadenas = Arrays.asList(400, "gatos", "perros", 3, "la montaña mágica", "helado", 25 );

        cadenas.sort(Comparator.comparing(c -> c.toString().length()));
        cadenas.forEach(System.out::println);
    }
}
