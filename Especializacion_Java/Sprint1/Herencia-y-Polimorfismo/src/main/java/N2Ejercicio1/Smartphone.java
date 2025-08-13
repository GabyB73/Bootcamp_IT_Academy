package N2Ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);

    }

    @Override
    public String alarma() {
        String mensaje = "Se está haciendo una foto";
        return mensaje;

    }

    @Override
    public String fotografiar() {
        String mensaje = "Está sonando la alarma";
        return mensaje;

    }
}
