package Hospital;

import java.util.ArrayList;

public class Hospital {
    private static final String NUMERO_HOSPITAL = "0098766H";
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<Cita> listaCitas;

    public Hospital() {
        listaPacientes = new ArrayList<>();
        listaMedicos = new ArrayList<>();
        listaCitas = new ArrayList<>();
    }

    public void darAltaPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void darCita(Paciente paciente, Medico medico, String fecha, String hora, String especialidad) throws ExcepcionCitaDuplicada {
        Cita cita = new Cita(fecha, hora, medico, especialidad);

        if (listaCitas.contains(cita)) {
            throw new ExcepcionCitaDuplicada("La cita ya existe.");
        }

        listaCitas.add(cita);
        paciente.agregarCita(cita);
    }

    public void anularCita(Paciente paciente, Medico medico, String fecha, String hora, String especialidad) throws ExcepcionCitaNoEncontrada {
        Cita cita = new Cita(fecha, hora, medico, especialidad);

        if (listaCitas.contains(cita)) {
            listaCitas.remove(cita);
            paciente.eliminarCita(cita);
        } else {
            throw new ExcepcionCitaNoEncontrada("La cita no existe en la lista de citas.");
        }
    }

    public Paciente buscarPacientePorNombre(String nombre) {
        return listaPacientes.stream()
                .filter(paciente -> paciente.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
    public Medico buscarMedicoPorEspecialidad(String nombreEspecialidad){
        return listaMedicos.stream()
                .filter(medico -> medico.getEspecialidad().equalsIgnoreCase(nombreEspecialidad))
                .findFirst()
                .orElse(null);
    }

    public Cita buscarCitaPorPaciente(String nombrePaciente){
        return listaCitas.stream()
                .filter(cita -> cita.getPaciente().equals(nombrePaciente))
                .findFirst()
                .orElse(null);

    }


    /*public void darCita(Paciente paciente, Medico medico, String fecha, String hora, String especialidad) {
        Cita cita = new Cita(fecha, hora, medico, especialidad);

        if (listaCitas.contains(cita)) {
            System.out.println("La cita ya existe.");
        } else {
            listaCitas.add(cita);
            paciente.agregarCita(cita);
        }
    }*/
}

