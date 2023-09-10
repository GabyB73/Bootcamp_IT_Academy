package N3Ejercicio2Test;
import N3Ejercicio1.ObjetoEntero;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompararPorReferenciaTest {

    @Test
    public void testMismaReferenciaObjetos() {
        ObjetoEntero objeto1 = new ObjetoEntero(5);
        ObjetoEntero objeto2 = objeto1; // Ambas referencias apuntan al mismo objeto

        assertThat(objeto1).isSameAs(objeto2); // Verifica si son la misma referencia
    }

    @Test
    public void testDiferenteReferenciaObjetos() {
        ObjetoEntero objeto1 = new ObjetoEntero(5);
        ObjetoEntero objeto2 = new ObjetoEntero(5);

        assertThat(objeto1).isNotSameAs(objeto2); // Verifica si no son la misma referencia
    }
}
