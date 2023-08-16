package N1Ejercicio1;
public class InstrumentoCuerda extends Instrumento{
    public InstrumentoCuerda(String nombre, float precio) {

        super(nombre, precio);
    }

    @Override
    public String tocar() {
        String mensaje = "Está sonando un instrumento de cuerda";
        return mensaje;
    }


}
