package N3Ejercicio1.Client;

import N3Ejercicio1.Command.*;

public class Inicio {

    private Coche coche;
    private Bicicleta bicicleta;
    private Avion avion;
    private Barco barco;
    private Invoker invoker;

    public Inicio() {

    }

    public Inicio(Coche coche, Bicicleta bicicleta, Avion avion, Barco barco, Invoker invoker) {
        this.coche      = coche;
        this.bicicleta  = bicicleta;
        this.avion      = avion;
        this.barco      = barco;
        this.invoker    = invoker;

    }

    public void configurarCoche() {
        System.out.println("Arrancando el coche");
        invoker.setArrancarCommand(coche);
        System.out.println("Acelerando el coche");
        invoker.setAcelerarCommand(coche);
        System.out.println("Frenando el coche\n");
        invoker.setFrenarCommand(coche);
    }

    public void configurarAvion() {
        System.out.println("Arrancando el avión");
        invoker.setArrancarCommand(avion);
        System.out.println("Acelerando el avión");
        invoker.setAcelerarCommand(avion);
        System.out.println("Frenando el avión\n");
        invoker.setFrenarCommand(avion);
    }

    public void configurarBicicleta() {
        System.out.println("Arrancando la bicicleta");
        invoker.setArrancarCommand(bicicleta);
        System.out.println("Acelerando la bicicleta");
        invoker.setAcelerarCommand(bicicleta);
        System.out.println("Frenando la bicicleta\n");
        invoker.setFrenarCommand(bicicleta);
    }

    public void configurarBarco() {
        System.out.println("Arrancando el barco");
        invoker.setArrancarCommand(barco);
        System.out.println("Acelerando el barco");
        invoker.setAcelerarCommand(barco);
        System.out.println("Frenando el barco\n");
        invoker.setFrenarCommand(barco);
    }


    // Llamar a los métodos del Invoker para ejecutar los comandos
    public void ejecutarAcciones() {
        invoker.arrancar();
        invoker.acelerar();
        invoker.frenar();
    }
}

