package Hospital;

public class ExcepcionCitaNoEncontrada extends Throwable {

    public ExcepcionCitaNoEncontrada(String s) {
    }

    public class CitaNoEncontradaException extends RuntimeException {
        public CitaNoEncontradaException(String mensaje) {
            super(mensaje);
        }
    }
}

