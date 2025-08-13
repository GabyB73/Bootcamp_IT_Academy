package N3Ejercicio5Test;

import N3Ejercicio5.VerificarMapa;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class VerificarMapaTest {

    @Test
    public void testMapaContieneClave() {
        // Crear una instancia de VerificarMapa
        VerificarMapa verificarMapa = new VerificarMapa();

        // Llenar el mapa con datos
        Map<String, Integer> mapa = verificarMapa.fillMap();

        // Verificar que el mapa contiene una clave específica, por ejemplo, "Martina"
        assertThat(mapa).asInstanceOf(InstanceOfAssertFactories.map(String.class, Integer.class)).containsKey("Martina");
    }
}
