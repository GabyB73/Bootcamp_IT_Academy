package exceptions;

public class ExcepcionCitaNoEncontrada extends RuntimeException {
    public ExcepcionCitaNoEncontrada(String mensaje) {
        super(mensaje);
    }
}

