package N3Ejercicio1;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.SecureRandom;

public class Encriptador {
    private Key secretKey; // Variable miembro para almacenar la clave secreta
    public Encriptador() {

        generarClaveSecreta(); // Generar la clave secreta al crear un objeto Encriptador
    }
    public Key getSecretKey() {

        return secretKey;
    }
    private void generarClaveSecreta() {
        try {
            // Generar una clave secreta AES
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256); // Tamaño de clave de 256 bits
            secretKey = keyGenerator.generateKey();

            // Cifrar y descifrar utilizando AES en modo de trabajo ECB
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            // Cifrar los archivos generados en los niveles anteriores
            cifrarArchivo("archivo.txt", "archivoCifrado.txt");
            cifrarArchivo("resultado.txt", "resultadoCifrado.txt");
            cifrarArchivo("miObjeto.ser", "miObjetoCifrado.ser");
            cifrarArchivo("configuracion.properties", "configuracionCifrado.properties");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cifrarArchivo(String entrada, String salida) {
        Cipher cifrador = null;
        try {
            cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cifrador.init(Cipher.ENCRYPT_MODE, secretKey);

            try (FileInputStream fis = new FileInputStream(entrada);
                 FileOutputStream fos = new FileOutputStream(salida);
                 CipherOutputStream cos = new CipherOutputStream(fos, cifrador)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    cos.write(buffer, 0, bytesRead);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al cifrar el archivo " + entrada + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void descifrarArchivo(String entrada, String salida) {
        Cipher descifrador = null;
        try {
            descifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            descifrador.init(Cipher.DECRYPT_MODE, secretKey);

            try (FileInputStream fis = new FileInputStream(entrada);
                 CipherInputStream cis = new CipherInputStream(fis, descifrador);
                 FileOutputStream fos = new FileOutputStream(salida)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = cis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al descifrar el archivo " + entrada + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}

