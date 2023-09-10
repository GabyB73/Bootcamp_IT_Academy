package N2Ejercicio1Test;
import N2Ejercicio1.CompararCadenaConHamcrest;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompararCadenaConHamcrestTest {

    CompararCadenaConHamcrest compararCadenaConHamcrest = new CompararCadenaConHamcrest();

    @Test
    public void longitudDelString() {
        assertThat(compararCadenaConHamcrest.retornaString(), longitudString(is(8)));
    }

    // Crear el Matcher personalizado
    public static Matcher<String> longitudString(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "Una cadena de una longitud de: ", "largo") {

            @Override
            protected Integer featureValueOf(String stringParaTestear) {

                return stringParaTestear.length();
            }
        };
    }
}
