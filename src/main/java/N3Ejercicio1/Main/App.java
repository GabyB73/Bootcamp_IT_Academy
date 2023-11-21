package N3Ejercicio1.Main;

import N3Ejercicio1.Client.Inicio;
import N3Ejercicio1.Command.*;

public class App {

    public static void main(String[] args) {

        Coche coche         = null;
        Avion avion         = null;
        Bicicleta bicicleta = null;
        Barco barco         = null;

        Inicio inicio   = new Inicio(coche, bicicleta, avion, barco);
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
