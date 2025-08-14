package Hospital;

import java.util.ArrayList;

public class ConsultaCita {
    public static void mostrarCitasPaciente(Paciente paciente) {
        ArrayList<Cita> citas = paciente.getCitas();

        if (citas.isEmpty()) {
            System.out.println("El paciente no tiene citas programadas.");
        } else {
            System.out.println("Citas del paciente " + paciente.getNombre() + ":");
            for (Cita cita : citas) {
                System.out.println("Fecha: " + cita.getFecha());
                System.out.println("Hora: " + cita.getHora());
                System.out.println("Médico Asignado: " + cita.getMedicoAsignado().getNombre());
                System.out.println("Especialidad: " + cita.getEspecialidadCita());
                System.out.println("------------------------------");
            }
        }
    }

    public static void mostrarCitasMedico(Medico medico) {
        ArrayList<Cita> citas = new ArrayList<>();

        for (Cita cita : citas) {
            if (cita.getMedicoAsignado().equals(medico)) {
                citas.add(cita);
            }
        }

        if (citas.isEmpty()) {
            System.out.println("El médico no tiene citas programadas.");
        } else {
            System.out.println("Citas del médico " + medico.getNombre() + ":");
            for (Cita cita : citas) {
                System.out.println("Fecha: " + cita.getFecha());
                System.out.println("Hora: " + cita.getHora());
                System.out.println("Paciente: " + cita.getPaciente().getNombre());
                System.out.println("Especialidad: " + cita.getEspecialidadCita());
                System.out.println("------------------------------");
            }
        }
    }
}
