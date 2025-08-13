package N3Ejercicio7Test;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

public class OptionalVacioTest {
    @Test
    public void testComprobarOptionalVacio(){

        Optional<Object> emptyOptional = Optional.empty();
        assertThat(emptyOptional).isEmpty();

    }
}
