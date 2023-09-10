package N1Ejercicio3Test;
import N1Ejercicio3.ArrayIndexOutOfBoundsGenerator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsGeneratorTest {

    @Test
    public void testElegirProductoExcepcion() {
        ArrayList<String> productos = new ArrayList<>();

        // Simular la entrada del usuario con un valor inválido (fuera de rango)
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        Scanner sc = new Scanner(in);

        try {
            // Llamar al método
            ArrayIndexOutOfBoundsGenerator.elegirProducto(productos, sc);

            // Si no se arroja la excepción, lanzar un AssertionError
            throw new AssertionError("Se esperaba una IndexOutOfBoundsException pero no se arrojó.");
        } catch (IndexOutOfBoundsException e) {
            // La excepción se ha arrojado correctamente
        } finally {
            // Cerrar el Scanner
            sc.close();
        }
    }
}
