package N3Ejercicio6Test;

import N3Ejercicio6.ValidarExcepcion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidarExcepcionTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        // Usamos assertThrows para verificar que se arroja la excepción
        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ValidarExcepcion.lista(); // Llamamos al método que debe lanzar la excepción
            }
        });

        // También podemos verificar el mensaje de la excepción si lo deseamos
        assertThat(exception.getMessage()).isEqualTo("¡Se ha lanzado la excepción ArrayIndexOutOfBoundsException!");
    }
}
