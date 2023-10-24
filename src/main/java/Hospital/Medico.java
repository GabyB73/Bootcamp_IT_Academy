package Hospital;

import java.util.ArrayList;

public class Medico extends Persona{

    String especialidad;
    String salaConsulta;
    private ArrayList<String> pruebasEspeciales;

    public Medico(String nombre, int numIdentificacion, String especialidad, String salaConsulta, ArrayList<String> pruebasEspeciales) {
        super(nombre, numIdentificacion);
        this.especialidad = especialidad;
        this.salaConsulta = salaConsulta;
        this.pruebasEspeciales = pruebasEspeciales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSalaConsulta() {
        return salaConsulta;
    }

    public void setSalaConsulta(String salaConsulta) {
        this.salaConsulta = salaConsulta;
    }

    public ArrayList<String> getPruebasEspeciales() {
        return pruebasEspeciales;
    }

    public void setPruebasEspeciales(ArrayList<String> pruebasEspeciales) {
        this.pruebasEspeciales = pruebasEspeciales;
    }
    public void agregarPruebaEspecial(String prueba) {
        pruebasEspeciales.add(prueba);
    }
    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", salaConsulta='" + salaConsulta + '\'' +
                ", pruebasEspeciales=" + pruebasEspeciales +
                '}';
    }
}
