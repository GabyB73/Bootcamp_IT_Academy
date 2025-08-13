package N3Ejercicio1;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ApellidoZAComparator implements Comparator<Persona> {
    private Collator collator = Collator.getInstance(new Locale("es", "ES"));

    @Override
    public int compare(Persona p1, Persona p2) {
        // Comparar por apellido de manera inversa
        int apellidoComparador = collator.compare(p2.getApellido(), p1.getApellido());

        // Si los apellidos son iguales, comparar por nombre
        if (apellidoComparador == 0) {
            return collator.compare(p2.getNombre(), p1.getNombre());
        }

        return apellidoComparador;
    }
}




