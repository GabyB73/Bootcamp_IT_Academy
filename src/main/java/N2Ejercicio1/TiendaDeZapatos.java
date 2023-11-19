package N2Ejercicio1;

public class TiendaDeZapatos {
    // Método que simula una transacción de compra
    void comprar(Zapato zapato, MetodoDePago metodoDePago, CallbackPago callbackPago) {
        // Crear una instancia de la pasarela de pago
        PasarelaDePago pasarelaDePago = new PasarelaDePago();

        // Invocar el pago a través de la pasarela
        pasarelaDePago.realizarPago(metodoDePago, new CallbackPago() {
            @Override
            public void pagoExitoso(MetodoDePago.TipoDePago tipoDePago) {
                System.out.println("Pago exitoso. Preparando el envío del zapato.");
                // Aquí se podrían realizar acciones adicionales después de un pago exitoso.
                callbackPago.pagoExitoso(tipoDePago);
            }

            @Override
            public void pagoFallido(MetodoDePago.TipoDePago tipoDePago) {
                System.out.println("El pago ha fallado. Por favor, inténtalo nuevamente.");
                // Aquí podría manejar el pago fallido de alguna manera, si es necesario.
                callbackPago.pagoFallido(tipoDePago);
            }
        });
    }
}
