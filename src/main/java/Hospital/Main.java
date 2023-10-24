package Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 0:
                    System.out.println("Usted ha salido de la aplicación");
                    break;
                case 1:
                    darDeAltaPaciente(hospital, sc);
                    break;
                case 2:
                    asignarCita(hospital, sc);
                    break;
                case 3:
                    anularCita(hospital, sc);
                    break;
                case 4:
                    consultarCitaPaciente(hospital, sc);
                    break;
                case 5:
                    consultarCitaMedico(hospital, sc);
                    break;
                default:
                    System.out.println("La opción no es válida");
            }
        } while (opcion != 0);
    }

    public static void darDeAltaPaciente(Hospital hospital, Scanner sc) {
        // Solicitar datos del paciente al usuario
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = sc.nextLine().trim();

        System.out.println("Ingrese el número de identificación del paciente: ");
        int numIdentificacion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Crear un nuevo paciente
        Paciente paciente = new Paciente(nombre, numIdentificacion, new ArrayList<Diagnostico>(), new ArrayList<Cita>());

        // Agregar el paciente al hospital
        hospital.darAltaPaciente(paciente);

        System.out.println("Paciente dado de alta correctamente.");
    }

    public static void asignarCita(Hospital hospital, Scanner sc) {
        // Solicitar datos para asignar una cita
        System.out.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = sc.nextLine().trim();

        System.out.println("Ingrese el nombre del médico: ");
        String nombreMedico = sc.nextLine().trim();

        System.out.println("Ingrese la fecha de la cita (dd/mm/yyyy): ");
        String fecha = sc.nextLine().trim();

        System.out.println("Ingrese la hora de la cita (hh:mm): ");
        String hora = sc.nextLine().trim();

        System.out.println("Ingrese la especialidad de la cita (medicina general, traumatología, neurología): ");
        String especialidad = sc.nextLine().trim();

        // Buscar el paciente por nombre en la lista de pacientes del hospital
        hospital.buscarPacientePorNombre(nombrePaciente);
        Paciente paciente = null;

        //El método está incompleto
        }

    public static void anularCita(Hospital hospital, Scanner sc) {
        // implementar la lógica para anular una cita de un paciente.

    }

    public static void consultarCitaPaciente(Hospital hospital, Scanner sc) {
        // implementar la lógica para consultar las citas de un paciente.

    }

    public static void consultarCitaMedico(Hospital hospital, Scanner sc) {
        //implementar la lógica para consultar las citas de un médico.

    }
    public static byte menu() {

        Scanner sc = new Scanner(System.in);
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("1.Dar de alta a un paciente");
            System.out.println("2.Asignar una cita a un paciente");
            System.out.println("3.Anular una cita");
            System.out.println("4.Consultar una cita de un paciente");
            System.out.println("4.Consultar una cita de un médico");


            opcion = sc.nextByte();

            // Consumir el salto de línea
            sc.nextLine();

            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }

}


