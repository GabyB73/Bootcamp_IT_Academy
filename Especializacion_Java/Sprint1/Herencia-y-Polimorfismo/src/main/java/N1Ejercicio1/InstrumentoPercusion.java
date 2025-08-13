package N1Ejercicio1;
public class InstrumentoPercusion extends Instrumento{
   public InstrumentoPercusion(String nombre, float precio) {

       super(nombre, precio);
    }

    @Override
    public String tocar() {
        String mensaje = "Está sonando un instrumento de percusión";
        return mensaje;
    }

}
