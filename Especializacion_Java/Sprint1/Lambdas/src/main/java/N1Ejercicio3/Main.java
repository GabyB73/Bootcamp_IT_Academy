package N1Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Crea una lista con los nombres de los meses del año. Imprime todos los elementos de la lista con una lambda.*/

        List<String> meses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre");

        meses.forEach((String m) -> System.out.println(m));


    }
}
