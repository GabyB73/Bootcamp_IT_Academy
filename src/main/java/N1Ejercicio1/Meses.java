package N1Ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class Meses {
    private List<String> meses; // Usa List en lugar de ArrayList

    public Meses() {
        // Inicializar la lista 'meses' aquí
        meses = new ArrayList<String>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
    }

    // El método obtenerMeses() que devuelve la lista de meses
    public List<String> obtenerMeses() {
        return meses;
    }

    public List<String> getMeses() {
        return meses;
    }

    public void setMeses(List<String> meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Meses{" +
                "meses=" + meses +
                '}';
    }
}
