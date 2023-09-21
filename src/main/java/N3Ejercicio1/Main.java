package N3Ejercicio1;

public class Main {

    public static void main(String[] args) {
        // Obtener la anotación @SerializarJson en la clase Persona
        Class<Persona> personaClass = Persona.class;
        SerializarJson anotacion = personaClass.getAnnotation(SerializarJson.class);

        if (anotacion != null) {
            // Leer el valor del directorio de la anotación
            String directorio = anotacion.directorio();
            System.out.println("Directorio especificado en la anotación: " + directorio);
        } else {
            System.out.println("La anotación @SerializarJson no está presente en la clase Persona.");
        }
    }

}
