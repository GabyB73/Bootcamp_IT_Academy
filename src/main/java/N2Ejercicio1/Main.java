package N2Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la tienda de zapatos
        TiendaDeZapatos tienda = new TiendaDeZapatos();

        // Crear un objeto de CallbackPago
        CallbackPago callbackPago = new CallbackPago() {
            @Override
            public void pagoExitoso(MetodoDePago.TipoDePago tipoDePago) {
                // Acciones adicionales después de un pago exitoso
                System.out.println("Compra exitosa realizada con " + tipoDePago + ". ¡Gracias por tu compra!\n");
            }

            @Override
            public void pagoFallido(MetodoDePago.TipoDePago tipoDePago) {
                // Manejar el pago fallido, si es necesario
                System.out.println("La compra ha fallado. Por favor, inténtalo nuevamente con " + tipoDePago + ".\n");
            }
        };

        // Realizar compras con diferentes métodos de pago
        tienda.comprar(new Zapato(), new MetodoDePago(MetodoDePago.TipoDePago.TARJETA_CREDITO, "1234567890123456"), callbackPago);
        tienda.comprar(new Zapato(), new MetodoDePago(MetodoDePago.TipoDePago.CUENTA_BANCARIA, "ES6017800001234567123456"), callbackPago);
        tienda.comprar(new Zapato(), new MetodoDePago(MetodoDePago.TipoDePago.PAYPAL, "mimail@gmail.com"), callbackPago);
    }
}
