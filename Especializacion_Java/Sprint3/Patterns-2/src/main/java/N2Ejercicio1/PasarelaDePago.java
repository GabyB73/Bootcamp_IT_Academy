package N2Ejercicio1;

// Clase que simula la pasarela de pago
public class PasarelaDePago {
    // Método que realiza el pago sin conocer la forma específica de pago
    void realizarPago(MetodoDePago metodoDePago, CallbackPago callbackPago) {
        /* Si no fuera una simulación, aquí iría la lógica para procesar el pago, independientemente del método específico.
        Podría tener diferentes lógicas según el tipo de método de pago (tarjeta, Paypal, etc.)*/

        // Simulación de un pago exitoso o fallido
        boolean pagoExitoso = Math.random() < 0.8; // Como es una simulación uso Math.random para calcular el 80% de probabilidades de éxito

        // Llamar al Callback para notificar el resultado del pago
        if (pagoExitoso) {
            callbackPago.pagoExitoso(metodoDePago.getFormaDePago());
        } else {
            callbackPago.pagoFallido(metodoDePago.getFormaDePago());
        }
    }
}
