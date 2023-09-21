package N2Ejercicio1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@SerializarJson(directorio = "C:\\Users\\geb_b\\Documents\\IntelliJ-WorkSpace\\S1Tasca7\\persona.json")
public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Alicia", 18);
        Persona persona1 = new Persona("José", 33);
        Persona persona2 = new Persona("Carla", 5);
        Persona persona3 = new Persona("Pedro", 50);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        String directorio = obtenerDirectorioPredeterminado(Main.class);

        for (Persona p : personas) {
            String linea1 = "{\"" + p.getNombre() + "\":\"" + p.getEdad() + "\"}," + "\n";
            try {
                write(directorio, linea1);
            } catch (IOException e) {
                System.out.println("Se ha producido un error: " + e.getMessage());
                e.printStackTrace(); // Imprime un mensaje más detallado de la excepción
            }
        }
    }

    static void write(String directorio, String json) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(directorio, true));
            bw.write(json);
            bw.close();
        } catch (IOException e) {
            throw new IOException("Error al escribir en el archivo JSON: " + e.getMessage());
        }
    }

    static String obtenerDirectorioPredeterminado(Class<?> clase) {
        SerializarJson anotacion = clase.getAnnotation(SerializarJson.class);
        if (anotacion != null) {
            return anotacion.directorio();
        } else {
            return ""; // Para proporcionar un valor predeterminado aquí si es necesario
        }
    }
}
