package N1Ejercicio1.Observer;

public class AgenciaDeBolsa implements Observador {

    private String nombre;

    public AgenciaDeBolsa(String nombre) {

        this.nombre = nombre;
    }

    @Override
    public void actualizar(boolean sube) {
        if (sube) {
            System.out.println("Agencia " + nombre + ": La Bolsa ha subido.");
        } else {
            System.out.println("Agencia " + nombre + ": La Bolsa ha bajado.");
        }
    }
}
