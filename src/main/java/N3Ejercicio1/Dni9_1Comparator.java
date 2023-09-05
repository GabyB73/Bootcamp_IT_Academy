package N3Ejercicio1;

import java.util.Comparator;
public class Dni9_1Comparator implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.getDni().compareTo(p1.getDni());
    }
}
