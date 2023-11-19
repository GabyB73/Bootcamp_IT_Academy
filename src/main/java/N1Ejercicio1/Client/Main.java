package N1Ejercicio1.Client;

import N1Ejercicio1.Observer.AgenciaDeBolsa;
import N1Ejercicio1.Observable.AgenteDeBolsa;

public class Main {

    public static void main(String[] args) {

        AgenteDeBolsa agente = new AgenteDeBolsa();

        AgenciaDeBolsa agencia1 = new AgenciaDeBolsa("NASDAQ");
        AgenciaDeBolsa agencia2 = new AgenciaDeBolsa("NYSE");
        AgenciaDeBolsa agencia3 = new AgenciaDeBolsa("LSE");

        agente.agregarObservador(agencia1);
        agente.agregarObservador(agencia2);
        agente.agregarObservador(agencia3);

        // Simular cambios en la Bolsa y notificar a las Agencias
        agente.notificarCambioEnBolsa(true); // La Bolsa sube
        agente.notificarCambioEnBolsa(false); // La Bolsa baja
    }
}
