package N3Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionButaca {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Butaca> sillones;
    public GestionButaca() {
                sillones = new ArrayList<Butaca>();
    }
    public ArrayList<Butaca> getButacas() {
                return sillones;
    }
    //Método para excepción personalizada
    public class ExcepcionButacaOcupada extends Exception {
        public ExcepcionButacaOcupada() {
            super("La butaca está ocupada.");
        }

        public ExcepcionButacaOcupada(String message) {
            super(message);
        }
    }
    public void añadirButaca(Butaca butaca) {
        try {
            if (!sillones.isEmpty()) {
                int posicion = buscarButaca(sillones, butaca.getNumeroFila(), butaca.getNumeroAsiento());

                if (posicion == -1) {
                    sillones.add(butaca);
                } else {
                    throw new ExcepcionButacaOcupada("La butaca ya está ocupada.");
                }
            } else {
                throw new ExcepcionButacaOcupada("No hay butacas para añadir.");
            }
        } catch (ExcepcionButacaOcupada e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public class ExcepcionButacaLibre extends Exception {
        public ExcepcionButacaLibre() {
            super("La butaca está libre.");
        }

        public ExcepcionButacaLibre(String message) {
            super(message);
        }
    }
    public void eliminarButaca(Butaca butaca) {
        try {
            if (!sillones.isEmpty()) {
                int posicion = buscarButaca(sillones, butaca.getNumeroFila(), butaca.getNumeroAsiento());

                if (posicion != -1) {
                    sillones.remove(posicion);
                } else {
                    throw new ExcepcionButacaLibre("La butaca no está reservada.");
                }
            } else {
                throw new ExcepcionButacaLibre("No hay butacas para eliminar.");
            }
        } catch (ExcepcionButacaLibre e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int buscarButaca(ArrayList<Butaca> sillones, int numFila, int numAsiento) {
            int posicion = -1;

            for (int i = 0; i < sillones.size(); i++) {
                Butaca butaca = sillones.get(i);

                if (butaca.getNumeroFila() == numFila && butaca.getNumeroAsiento() == numAsiento) {
                    posicion = i;

                }
            }

            return posicion;
        }



    /*public void añadirButaca(Butaca butaca) throws ExcepcionButacaOcupada {
        // Aquí debes implementar la lógica para añadir una butaca al ArrayList sillones.
        // Verificar si ya existe una butaca con la misma fila y asiento (usar buscarButaca),
        // y lanzar la excepción ExcepcionButacaOcupada si es necesario.
    }

    public void eliminarButaca(int numFila, int numAsiento) throws ExcepcionButacaLliure {
        // Aquí debes implementar la lógica para eliminar una butaca del ArrayList sillones.
        // Verificar si existe una butaca con los números de fila y asiento especificados,
        // y lanzar la excepción ExcepcionButacaLliure si es necesario.
    }

    public int buscarButaca(int numFila, int numAsiento) {
        // Aquí debes implementar la lógica para buscar una butaca en el ArrayList sillones.
        // Devolver la posición de la butaca si se encuentra, o -1 si no se encuentra.
    }*/
}
