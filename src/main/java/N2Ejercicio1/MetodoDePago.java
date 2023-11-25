package N2Ejercicio1;

public class MetodoDePago {
    private FormaDePago formaDePago;

    public MetodoDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void realizarPago(){
        formaDePago.realizarPago();
    }

}
