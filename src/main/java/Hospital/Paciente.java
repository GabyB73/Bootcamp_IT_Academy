package Hospital;

import java.util.ArrayList;


public class Paciente extends Persona{
    private ArrayList<Diagnostico> diagnosticos;
    private ArrayList<Cita> citas;

    public Paciente(String nombre, int numIdentificacion, ArrayList<Diagnostico> diagnosticos, ArrayList<Cita> citas) {
        super(nombre, numIdentificacion);
        this.diagnosticos = diagnosticos;
        this.citas = citas;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void eliminarCita(Cita cita) {
        citas.remove(cita);
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "diagnosticos=" + diagnosticos +
                ", citas=" + citas +
                '}';
    }
}

