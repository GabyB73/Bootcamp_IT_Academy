package Hospital;

public class Diagnostico {
    private String enfermedad;
    private String tratamiento;
    private String fecha;

    public Diagnostico(String enfermedad, String tratamiento, String fecha) {
        this.enfermedad = enfermedad;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "enfermedad='" + enfermedad + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
