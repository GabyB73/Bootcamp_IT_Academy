package N1Ejercicio3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarCapitales {

    public static void main(String[] args) throws IOException {

       HashMap<String, String> mapaPaisesCapitales = leerFichero("countries.txt");
       Map<String, Integer> clasificacion = new HashMap<>();
       interaccionConUsuario(mapaPaisesCapitales, clasificacion);
       guardarClasificacion("clasificacion.txt", clasificacion);

    }
    public static void guardarClasificacion(String nombreArchivo, Map<String, Integer> clasificacion) {

        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Map.Entry<String, Integer> entrada : clasificacion.entrySet()) {
                escritor.println(entrada.getKey() + "," + entrada.getValue());
            }
            System.out.println("Clasificación guardada en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la clasificación: " + e.getMessage());
        }
    }
    public static void interaccionConUsuario(HashMap<String, String> mapaPaisesCapitales, Map<String, Integer> clasificacion) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int puntuacion = 0;

        System.out.println("Introduce tu nombre para empezar el juego");
        String nombreUsuario = sc.nextLine();

        if (mapaPaisesCapitales.isEmpty()) {
            System.out.println("El HashMap de países y capitales está vacío. No se puede jugar.");

        }

        for (int i = 0; i < 10; i++) { // Repetir 10 veces
            // Generar un número aleatorio entre 0 y el tamaño del HashMap - 1
            int indiceAleatorio = random.nextInt(mapaPaisesCapitales.size());

            // Obtener una entrada (par clave-valor) del HashMap en función del índice aleatorio
            String pais = null;
            String capital = null;
            int contador = 0;
            boolean encontrado = false;

            for (String key : mapaPaisesCapitales.keySet()) {
                if (contador == indiceAleatorio) {
                    pais = key;
                    capital = mapaPaisesCapitales.get(key);
                    encontrado = true;
                }
                contador++;
            }

            if (!encontrado) {
                System.out.println("Error: No se encontró la entrada en el HashMap.");

            }
            // Presentar el país al usuario y pedir la capital
            System.out.println("¿Cuál es la capital de " + pais + "?");
            String respuestaUsuario = sc.nextLine();

            // Comparar la respuesta del usuario con la capital almacenada
            if (respuestaUsuario.equalsIgnoreCase(capital)) {
                System.out.println("¡Correcto! +1 punto");
                puntuacion++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + capital);
            }
        }

        // Mostrar la puntuación final del usuario
        System.out.println("Puntuación final: " + puntuacion);
        clasificacion.put(nombreUsuario, puntuacion); // Agregar el usuario y su puntuación al Map

    }
    public static HashMap<String, String> leerFichero(String nombreArchivo) throws IOException {
        HashMap<String, String> mapaPaisesCapitales = new HashMap<>();

        FileReader lectorArchivo = null;
        BufferedReader lectorLinea = null;

        try {
            lectorArchivo = new FileReader(nombreArchivo);
            lectorLinea = new BufferedReader(lectorArchivo);

            String linea;
            while ((linea = lectorLinea.readLine()) != null) {
                // Dividir la línea en nombres de países y capitales usando split()
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    String pais = partes[0].trim();
                    String capital = partes[1].trim();
                    mapaPaisesCapitales.put(pais, capital); //Agrega al HashMap
                }
            }
        } catch (IOException e) {
            // Manejar la excepción si ocurre algún problema de lectura del archivo
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            // Cerrar los recursos en el bloque finally
            try {
                if (lectorLinea != null) {
                    lectorLinea.close();
                }
                if (lectorArchivo != null) {
                    lectorLinea.close();
                }
            } catch (IOException e) {
                // Manejar cualquier excepción que pueda ocurrir al cerrar los recursos
                System.out.println("Error: " + e.getMessage());
                throw e;
            }
        }
        return mapaPaisesCapitales;
    }
}

