package N2Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la tienda de zapatos
        TiendaDeZapatos tienda = new TiendaDeZapatos();
        FormaDePago formaDePago = new FormaDePago() { // inicio de la creación de instancia en el lugar (inline instantiation)
            @Override
            public void realizarPago() {

            }

            @Override
            public String getTipoDePago() {
                return null;
            }
        }; // fin de la creación de instancia en el lugar (crea el objeto directamente en la llamada al método)

        // Crear un objeto de CallbackPago
        CallbackPago callbackPago = new CallbackPago() {// inicio de la creación de instancia en el lugar
            @Override
            public void pagoExitoso(FormaDePago formaDePago) {
                // Acciones adicionales después de un pago exitoso
                System.out.println("Compra exitosa realizada con " + formaDePago.getTipoDePago() + ". ¡Gracias por tu compra!\n");
            }

            @Override
            public void pagoFallido(FormaDePago formaDePago) {
                // Manejar el pago fallido, si es necesario
                System.out.println("La compra ha fallado. Por favor, inténtalo nuevamente con " + formaDePago.getTipoDePago() + ".\n");
            }
        }; // fin de la creación de instancia en el lugar (crea el objeto directamente en la llamada al método)

        // Realizar compras con diferentes métodos de pago
        tienda.comprar(new Zapato(), new MetodoDePago(new TarjetaCredito("1234567890123456")), callbackPago);
        tienda.comprar(new Zapato(), new MetodoDePago(new PayPal("mymail@mail.com")), callbackPago);
        tienda.comprar(new Zapato(), new MetodoDePago(new CuentaBancaria("ES6017800001234567123456")), callbackPago);
    }
}
