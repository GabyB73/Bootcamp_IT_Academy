package N1Ejercicio1.Observable;

import N1Ejercicio1.Observer.Observador;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un Agente de Bolsa, que actúa como objeto observable.
 * Mantiene referencias a observadores (AgenciaDeBolsa) y notifica cambios en la Bolsa.
 */
public class AgenteDeBolsa {
    private List<Observador> agenciasDeBolsa = new ArrayList<>();

    public void agregarObservador(Observador agencia) {

        agenciasDeBolsa.add(agencia);
    }

    public void eliminarObservador(Observador agencia) {

        agenciasDeBolsa.remove(agencia);
    }

    public void notificarCambioEnBolsa(boolean sube) {
        for (Observador agencia : agenciasDeBolsa) {
            agencia.actualizar(sube);
        }
    }

}
