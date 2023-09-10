package N3Ejercicio1Test;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import N3Ejercicio1.ObjetoEntero;
import org.junit.jupiter.api.Test;

public class ObjetoEnteroTest {

    @Test
    public void testIgualdadObjetosEnteros() {
        ObjetoEntero objeto1 = new ObjetoEntero(5);
        ObjetoEntero objeto2 = new ObjetoEntero(5);

        assertThat(objeto1.getValor()).isEqualTo(objeto2.getValor());
    }

    @Test
    public void testDesigualdadObjetosEnteros() {
        ObjetoEntero objeto1 = new ObjetoEntero(15);
        ObjetoEntero objeto2 = new ObjetoEntero(10);

        assertThat(objeto1.getValor()).isNotEqualTo(objeto2.getValor());
    }
}

