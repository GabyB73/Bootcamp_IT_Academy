package N2Ejercicio1;

// Interfaz que define el Callback para notificar el resultado del pago
public interface CallbackPago {
    void pagoExitoso(MetodoDePago.TipoDePago tipoDePago);
    void pagoFallido(MetodoDePago.TipoDePago tipoDePago);
}
