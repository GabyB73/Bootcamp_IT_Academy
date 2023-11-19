package N2Ejercicio1;

public class MetodoDePago {
    private String numeroTarjetaCredito;  // Atributo para almacenar el número de tarjeta de crédito
    private String cuentaPayPal;          // Atributo para almacenar la cuenta de PayPal
    private String numeroCuentaBancaria;  // Atributo para almacenar el número de cuenta bancaria
    private TipoDePago tipoDePago;  // Nuevo atributo para indicar el tipo de método de pago

    public TipoDePago getTipoDePago() {
        return tipoDePago;
    }

    // Enum para representar los tipos de pago posibles
    public enum TipoDePago {
        TARJETA_CREDITO, PAYPAL, CUENTA_BANCARIA
    }

    // Constructor que toma el tipo de método de pago y el valor correspondiente
    public MetodoDePago(TipoDePago tipoDePago, String valor) {
        this.tipoDePago = tipoDePago;

        switch (tipoDePago) {
            case TARJETA_CREDITO:
                this.numeroTarjetaCredito = valor;
                break;
            case PAYPAL:
                this.cuentaPayPal = valor;
                break;
            case CUENTA_BANCARIA:
                this.numeroCuentaBancaria = valor;
                break;
            // Aquí se podrían agregar más tipos de pago según fuere necesario
        }
    }

    // Métodos getter y setter

    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public String getCuentaPayPal() {
        return cuentaPayPal;
    }

    public void setCuentaPayPal(String cuentaPayPal) {
        this.cuentaPayPal = cuentaPayPal;
    }

    public String getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }
    //Métodos para especificar las formas de pago
    public void pagoTarjetaCredito() {
        System.out.println("Pago realizado con tarjeta de crédito");
    }

    public void pagoPayPal() {
        System.out.println("Pago realizado a través de PayPal");
    }

    public void pagoCuentaBancaria() {
        System.out.println("Pago realizado mediante débito en cuenta bancaria");
    }
}
