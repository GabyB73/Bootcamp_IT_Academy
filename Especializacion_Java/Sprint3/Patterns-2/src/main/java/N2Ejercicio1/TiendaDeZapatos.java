package N2Ejercicio1;

public class TiendaDeZapatos {
    // Método que simula una transacción de compra
    void comprar(Zapato zapato, MetodoDePago metodoDePago, CallbackPago callbackPago) {
        // Crear una instancia de la pasarela de pago
        PasarelaDePago pasarelaDePago = new PasarelaDePago();

        // Invocar el pago a través de la pasarela, esta es la línea que demuestra el uso del patrón Callback
        pasarelaDePago.realizarPago(metodoDePago, new CallbackPago() { // inicio de la creación de instancia en el lugar
            @Override
            public void pagoExitoso(FormaDePago formaDePago) {
                System.out.println("Pago exitoso. Preparando el envío del zapato.");
                // Aquí se podrían realizar acciones adicionales después de un pago exitoso, como manejo de stock...
                callbackPago.pagoExitoso(formaDePago);
            }

            @Override
            public void pagoFallido(FormaDePago formaDePago) {
                System.out.println("El pago ha fallado. Por favor, inténtalo nuevamente.");
                // Aquí podría manejar el pago fallido, pidiendo que lo intente con otra forma de pago...
                callbackPago.pagoFallido(formaDePago);
            }
        }); // fin de la creación de instancia en el lugar (crea el objeto directamente en la llamada al método)
    }
}
