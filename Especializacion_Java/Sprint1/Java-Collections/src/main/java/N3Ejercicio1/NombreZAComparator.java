package N3Ejercicio1;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NombreZAComparator implements Comparator<Persona> {
    private Collator collator = Collator.getInstance(new Locale("es", "ES"));

    public int compare(Persona p1, Persona p2){
        //Compara por nombres de manera inversa
        int nombreComparador = collator.compare(p2.getNombre(), p1.getNombre());
        //si los nombres son iguales, comparar por apellido
        if(nombreComparador == 0){
            return collator.compare(p2.getApellido(), p1.getApellido());
        }
        return nombreComparador;
    }
}
