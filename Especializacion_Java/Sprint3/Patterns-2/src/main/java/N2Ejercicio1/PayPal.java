package N2Ejercicio1;

public class PayPal implements FormaDePago{
    private String cuentaPayPal;

    public PayPal(String cuentaPayPal) {
        this.cuentaPayPal = cuentaPayPal;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado a través de PayPal");
        // Aquí iría la lógica específica para el pago con PayPal, como validación de cuenta en PayPal, etc...
    }

    @Override
    public String getTipoDePago() {
        return "PayPal";
    }
}
