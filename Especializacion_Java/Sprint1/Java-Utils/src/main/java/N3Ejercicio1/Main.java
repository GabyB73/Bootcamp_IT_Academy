package N3Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;

public class Main {

    public static void main(String[] args) {

        Encriptador encriptador = new Encriptador();
        Key secretKey = encriptador.getSecretKey(); // Obtener la clave secreta del encriptador


        try {
            // Descifrar archivos antes de cifrarlos
            encriptador.descifrarArchivo("archivoCifrado.txt", "archivoDescifrado.txt");
            encriptador.descifrarArchivo("resultadoCifrado.txt", "resultadoDescifrado.txt");
            encriptador.descifrarArchivo("miObjetoCifrado.ser", "miObjetoDescifrado.ser");
            encriptador.descifrarArchivo("configuracionCifrado.properties", "configuracionDescifrada.properties");

            // Ahora cifrar los archivos descifrados
            encriptador.cifrarArchivo("archivoDescifrado.txt", "archivoCifrado.txt");
            encriptador.cifrarArchivo("resultadoDescifrado.txt", "resultadoCifrado.txt");
            encriptador.cifrarArchivo("miObjetoDescifrado.ser", "miObjetoCifrado.ser");
            encriptador.cifrarArchivo("configuracionDescifrada.properties", "configuracionCifrado.properties");

        }catch (Exception e){
            e.printStackTrace(); // Imprimir la traza de la pila para obtener detalles adicionales.
        }
    }
}
