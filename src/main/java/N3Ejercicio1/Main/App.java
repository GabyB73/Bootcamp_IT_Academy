package N3Ejercicio1.Main;

import N3Ejercicio1.Client.Inicio;
import N3Ejercicio1.Command.Invoker;

public class App {

    public static void main(String[] args) {

        Inicio inicio   = new Inicio();
        Invoker invoker = new Invoker();

        inicio.configurarCoche();
        inicio.ejecutarAcciones();

        inicio.configurarAvion();
        inicio.ejecutarAcciones();

        inicio.configurarBicicleta();
        inicio.ejecutarAcciones();

        inicio.configurarBarco();
        inicio.ejecutarAcciones();
    }

}
