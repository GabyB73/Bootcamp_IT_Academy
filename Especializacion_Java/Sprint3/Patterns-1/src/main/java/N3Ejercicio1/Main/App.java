package N3Ejercicio1.Main;

import N3Ejercicio1.Client.Inicio;
import N3Ejercicio1.Command.*;

public class App {

    public static void main(String[] args) {

        Coche coche         = new Coche();  // Inicialización de instancias
        Avion avion         = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        Barco barco         = new Barco();

        Invoker invoker = new Invoker();

        Inicio inicio   = new Inicio(coche, bicicleta, avion, barco, invoker);

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
