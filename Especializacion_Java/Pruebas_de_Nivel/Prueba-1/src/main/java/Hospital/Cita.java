package Hospital;

public class Cita {
    private String fecha;
    private String hora;
    private Medico medicoAsignado;
    private String especialidadCita;
    private Paciente paciente;

    public Cita(String fecha, String hora, Medico medicoAsignado, String especialidadCita) {
        this.fecha = fecha;
        this.hora = hora;
        this.medicoAsignado = medicoAsignado;
        this.especialidadCita = especialidadCita;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public String getEspecialidadCita() {
        return especialidadCita;
    }

    public void setEspecialidadCita(String especialidadCita) {
        this.especialidadCita = especialidadCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", medicoAsignado=" + medicoAsignado +
                ", especialidadCita='" + especialidadCita + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}

