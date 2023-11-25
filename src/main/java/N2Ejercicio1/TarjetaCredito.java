package N2Ejercicio1;

public class TarjetaCredito implements FormaDePago{
    private String numeroTarjetaCredito;

    public TarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con tarjeta de crédito");
        // Aquí iría la lógica específica para el pago con tarjeta de crédito, como la validación del num. de la tarjeta, etc...
    }

    @Override
    public String getTipoDePago() {
        return "TarjetaCredito";
    }
}
