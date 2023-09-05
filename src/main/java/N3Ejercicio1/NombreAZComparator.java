package N3Ejercicio1;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NombreAZComparator implements Comparator<Persona> {
    private Collator collator = Collator.getInstance(new Locale("es", "ES"));

    public int compare(Persona p1, Persona p2){
        //Compara por nombres
        int nombreComparador = collator.compare(p1.getNombre(), p2.getNombre());
        //si los nombres son iguales, comparar por apellido
        if(nombreComparador == 0){
            return collator.compare(p1.getApellido(), p2.getApellido());
        }
        return nombreComparador;
    }

}
