package Hospital;

public class ExcepcionCitaDuplicada extends Throwable {
    public ExcepcionCitaDuplicada(String s) {
    }

    public class CitaDuplicadaException extends RuntimeException {
        public CitaDuplicadaException(String mensaje) {
            super(mensaje);
        }
    }
}
