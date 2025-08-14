package N1Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance; // La única instancia de la clase. Declaro la variable instance
    private List<String> comandos = new ArrayList<>(); // Declaro la lista de comandos


    // Constructor privado para evitar la instanciación desde fuera
    private Undo() {
        // Inicializo aquí los atributos necesarios
        comandos = new ArrayList<>();
    }

    // Método estático para obtener la única instancia
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void agregarComando(String orden) {
        comandos.add(orden);
    }

    public void eliminarComando(String orden) {
        if (!comandos.isEmpty()) {
            comandos.remove(comandos.size() - 1);
        }
    }

    public void listarComandos() {
        for (String orden : comandos) {
            System.out.println(orden);
        }
    }
}
