package N1Ejercicio1Test;

import N1Ejercicio1.Meses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MesesTest {
        ArrayList<String> meses = new ArrayList<>();

        @Test
        public void sizeListaTest() {
                //Aquí realizo la prueba para verificar el tamaño de la lista
                Meses meses = new Meses();
                List<String> listaMeses = meses.obtenerMeses();
                assertEquals(12, listaMeses.size());
        }

        @Test
        public void listaNoNulaTest() {
                //Aquí realizo la prueba para verificar que la lista no sea nula
                Meses meses = new Meses(); //Crea instancia de Meses
                List<String> listaMeses = meses.obtenerMeses();
                assertNotNull(listaMeses); //Utilizo assertNotNull para verificar que la lista no sea nula
        }

        @Test
        public void mesAgostoTest() {
                //Aquí realizo la prueba para verificar si "Agosto" está en la lista
                Meses meses = new Meses();
                List<String> listaMeses = meses.obtenerMeses();
                assertEquals("Agosto", listaMeses.get(7)); //Verifica que "Agosto" está en la posición 7 (con "A" mayúscula)
        }
}
