package exceptions;

public class ExcepcionCitaDuplicada extends RuntimeException {
    public ExcepcionCitaDuplicada(String mensaje) {
        super(mensaje);
    }
}
