package N3Ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class VerificarMapa {
    Map<String, Integer> nombreYEdad = new HashMap<String, Integer>();

    public Map<String, Integer> fillMap(){

        nombreYEdad.put("Martina", 23);
        nombreYEdad.put("Adriana", 4);
        nombreYEdad.put("Sandra", 35);
        nombreYEdad.put("Carolina", 50);
        nombreYEdad.put("Lucia", 90);

        return nombreYEdad;
    }
}
