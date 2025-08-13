package N1Ejercicio3Test;
import N1Ejercicio3.ArrayIndexOutOfBoundsGenerator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsGeneratorTest {

    @Test
    public void testElegirProductoExcepcion() {

            ArrayList<String> productos = new ArrayList<>();

            // Simular la entrada del usuario con un valor inválido (fuera de rango)
            ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
            Scanner sc = new Scanner(in);

            // Utilizar assertThrows para verificar que se arroja una IndexOutOfBoundsException
            assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayIndexOutOfBoundsGenerator.elegirProducto(productos, sc);
            });

            // No es necesario un bloque catch aquí, assertThrows manejará la excepción
        }
}
