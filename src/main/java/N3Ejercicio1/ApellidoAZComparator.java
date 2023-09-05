package N3Ejercicio1;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ApellidoAZComparator implements Comparator<Persona> {

    private Collator collator = Collator.getInstance(new Locale("es", "ES"));

    public int compare(Persona p1, Persona p2){
        //Compara por apellidos
        int apellidoComparador = collator.compare(p1.getApellido(), p2.getApellido());

        //si los apellidos son iguales, comparar por nombre
        if(apellidoComparador == 0){
            return collator.compare(p1.getNombre(), p2.getNombre());
        }
        return apellidoComparador;
    }
}
