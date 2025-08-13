package N1Ejercicio2Test;
import N1Ejercicio2.CalculoDni;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({"12345678, Z", "87654321, X", "14007085, Q", "73276904, P", "25952071, K",
            "57969938, W", "96917540, W", "88931741, X", "71629744, Q", "98052043, F"})
    public void calculoDniLetraEsperadaTest(int numeroDni, char letraEsperada) {
        String dniCalculado = CalculoDni.calculoDni(numeroDni);
        char letraCalculada = dniCalculado.charAt(8); // La letra está en la posición 8
        assertEquals(letraEsperada, letraCalculada);
    }
}


/*12345678, 'Z'},
    {87654321, 'X'},
    {14007085, 'Q'},
    {73276904, 'P'},

    {25952071, 'K'},
    {57969938, 'W'},

    {96917540, 'W'},
    {88931741, 'X'},

    {71629744, 'Q'},
    {98052043, 'F'}});*/