package N3Ejercicio4Test;
import N3Ejercicio4.ContenedorDeObjetos;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class ContenedorDeObjetosTest {

    @Test
    public void testOrdenDeObjetos() {

        //Verifica el orden de los objetos en ArrayList según han sido insertados
        ContenedorDeObjetos contenedor = new ContenedorDeObjetos();
        ArrayList<Object> listaDeObjetos = contenedor.getListaDeObjetos();

        // Inserta los objetos en el ArrayList llamando al método contenedorDeObjetos()
        contenedor.contenedorDeObjetos();

        // Luego, verifica el orden de los objetos.
        assertThat(listaDeObjetos.get(0)).isEqualTo("manzana");
        assertThat(listaDeObjetos.get(1)).isEqualTo(42);
        assertThat(listaDeObjetos.get(2)).isEqualTo("gato");
        assertThat(listaDeObjetos.get(3)).isEqualTo(100);
        assertThat(listaDeObjetos.get(4)).isEqualTo("perro");

    }
    @Test
    public void testContenedorDeObjetos() {

        ContenedorDeObjetos contenedor = new ContenedorDeObjetos();

        // Llama al método contenedorDeObjetos para llenar la lista.
        contenedor.contenedorDeObjetos();
        ArrayList<Object> listaDeObjetos = contenedor.getListaDeObjetos();

        // Verifica que la lista contiene los objetos en cualquier orden.
        assertThat(listaDeObjetos).contains("manzana", 42, "gato", 100, "perro");
    }
    @Test
    public void testElementosUnicos() {

        ContenedorDeObjetos contenedor = new ContenedorDeObjetos();

        // Llama al método contenedorDeObjetos para llenar la lista.
        contenedor.contenedorDeObjetos();
        ArrayList<Object> listaDeObjetos = contenedor.getListaDeObjetos();

        // Verifica que un objeto se ha añadido solo una vez (por ejemplo, "manzana").
        assertThat(listaDeObjetos).containsOnlyOnce("manzana");

        // Verifica que otro elemento no está presente en la lista (por ejemplo, "banana").
        assertThat(listaDeObjetos).doesNotContain("banana");
    }
}
