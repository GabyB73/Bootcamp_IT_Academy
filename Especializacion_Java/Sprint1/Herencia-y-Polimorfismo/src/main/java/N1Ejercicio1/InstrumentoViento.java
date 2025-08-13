package N1Ejercicio1;
public class InstrumentoViento extends Instrumento{
   public InstrumentoViento(String nombre, float precio) {

       super(nombre, precio);
    }
    @Override
    public String tocar() {
        String mensaje = "Está sonando un instrumento de viento";
        return mensaje;
    }

}
