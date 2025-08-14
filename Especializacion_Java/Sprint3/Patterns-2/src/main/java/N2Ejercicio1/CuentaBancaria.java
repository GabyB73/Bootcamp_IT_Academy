package N2Ejercicio1;

public class CuentaBancaria implements FormaDePago{
    private String numeroCuentaBancaria;

    public CuentaBancaria(String numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado mediante débito en cuenta bancaria");
        // Aquí iría la lógica específica para el pago con cuenta bancaria, como la validación del num. de cuenta, etc...
    }

    @Override
    public String getTipoDePago() {
        return "Cuenta Bancaria";
    }
}
