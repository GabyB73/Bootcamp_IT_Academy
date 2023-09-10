package N3Ejercicio3Test;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class CompararArraysTest {

    @Test
    public void testIgualdadArrays() {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,4,5};

        assertThat(array1).hasSameSizeAs(array2); // Verifica que los dos arrays son iguales
        assertThat(array1).containsExactly(array2); // Verifica que contienen los mismos elementos
    }

    @Test
    public void testDiferenciaArrays() {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10};
        assertThat(array1).isNotSameAs(array2); // Verifica que los dos arrays son diferentes
    }
}
