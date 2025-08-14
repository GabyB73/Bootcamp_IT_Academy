package N3Ejercicio1;

public class ConversorDeMonedaImpl implements ConversorDeMoneda {

    private String monedaOrigen;

    public ConversorDeMonedaImpl(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    @Override
    public double convertirMoneda(double precio, String monedaDestino) {

        String monedaOrigenLowerCase = monedaOrigen.toLowerCase();
        String monedaDestinoLowerCase = monedaDestino.toLowerCase();

        if (monedaOrigenLowerCase.equals(monedaDestinoLowerCase)) {
            return precio; // Misma moneda, no es necesario convertir
        } else if ("usd".equals(monedaOrigenLowerCase) && "eur".equals(monedaDestinoLowerCase)) {
            return precio * 0.85;
        } else if ("eur".equals(monedaOrigenLowerCase) && "usd".equals(monedaDestinoLowerCase)) {
            return precio / 0.85;
        } else {
            System.out.println("Conversión no soportada: " + monedaOrigen + " a " + monedaDestino);
            return precio;
        }
    }
}
