package N2Ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracion {

    private Properties properties;

    public Configuracion(String archivoConfiguracion) {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream(archivoConfiguracion)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String obtenerDirectorioALeer() {
        return properties.getProperty("directorio_a_leer");
    }

    public String obtenerArchivoTxtResultante() {
        return properties.getProperty("archivo_txt_resultante");
    }
}
