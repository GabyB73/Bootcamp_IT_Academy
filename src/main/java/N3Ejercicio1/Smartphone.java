package N3Ejercicio1;

public class Smartphone implements Telefono{
    @Override
    public void llamar() {
        System.out.println("El teléfono está llamando");

    }
    public void hacerFotos(){
        System.out.println("Se está haciendo una foto");
    }
}
