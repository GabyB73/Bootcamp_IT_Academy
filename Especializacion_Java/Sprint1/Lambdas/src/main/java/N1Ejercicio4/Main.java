package N1Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Realizar la misma impresión del punto anterior, pero mediante method reference.*/
        List<String> meses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre");

        //Método referido. Imprime los elementos de la lista
        meses.forEach(System.out::println);
    }
}
