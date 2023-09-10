package N3Ejercicio6;
import java.util.Arrays;
public class ValidarExcepcion {

    public static void lista() {

            try {
                // Crear un arreglo de longitud 3
                int[] array = new int[3];

                // Acceder a un índice fuera del rango (índice 5)
                int valor = array[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("¡Se ha lanzado la excepción ArrayIndexOutOfBoundsException!");
            }
        }
}
