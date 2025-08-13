package N3Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();

        // Crear objetos Alumno y agregarlos a la lista
        Alumno alumno1 = new Alumno("Manuel", 20, "Java", 7.5);
        Alumno alumno2 = new Alumno("Alicia", 42, "JavaScript", 7.0);
        Alumno alumno3 = new Alumno("Carlos", 30, "JavaScript", 6.5);
        Alumno alumno4 = new Alumno("Pedro", 40, "Java", 8.0);
        Alumno alumno5 = new Alumno("Sonia", 22, "PHP", 7.0);
        Alumno alumno6 = new Alumno("Juan", 18, "Java", 9.0);
        Alumno alumno7 = new Alumno("Ernesto", 50, "Golang", 8.5);
        Alumno alumno8 = new Alumno("Carolina", 27, "PHP", 7.0);
        Alumno alumno9 = new Alumno("Felipe", 50, "JavaScript", 5.0);
        Alumno alumno10 = new Alumno("Daniel", 35, "Java", 9.0);

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        listaAlumnos.add(alumno9);
        listaAlumnos.add(alumno10);

        //Llamar a los métodos
        mostrarAlumno(listaAlumnos);
        listarAlumnosConLaA(listaAlumnos);
        mostrarNotas(listaAlumnos);
        mostrarAlumnosYNotas(listaAlumnos);
        mostrarAlumnosJava(listaAlumnos);

    }
    //Método para mostrar la lista de alumnos por nombre y edad
    public static void mostrarAlumno(List<Alumno> listaAlumnos){
        System.out.println("La lista de alumnos es: ");
        listaAlumnos.forEach(alumno -> System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad()));
        System.out.println("\n");
    }
    //Mostrar la lista de los alumnos que su nombre empieza por "A"
    public static void listarAlumnosConLaA(List<Alumno> listaAlumnos){
        System.out.println("Lista de alumnos cuyos nombres comienzan con \"A\":");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombre().toLowerCase().startsWith("a"))
                .forEach(alumno -> System.out.println("Nombre: " + alumno.getNombre()));
        System.out.println("\n");
    }
    //Método para la lista de alumnos que tienen una nota igual o superior a 5
    public static void mostrarNotas(List<Alumno> listaAlumnos) {
        System.out.println("Lista de notas:");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNota() >= 5)
                .forEach(alumno -> System.out.println("Nombre: " + alumno.getNombre() + ", Nota: " + alumno.getNota()));
        System.out.println("\n");
    }
    //Método para la lista de alumnos que tienen una nota igual o superior a 5 y que no son alumnos de PHP
    public static void mostrarAlumnosYNotas(List<Alumno> listaAlumnos){
        System.out.println("Lista de notas de los alumnos, excepto del curso de PHP");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNota() >= 5 && !alumno.getCurso().equals("PHP"))
                .forEach(alumno -> System.out.println("Nombre: " + alumno.getNombre() + ", Nota: " + alumno.getNota()));
        System.out.println("\n");
    }
    //Método para mostrar la lista de alumnos de Java y que son mayores de edad
    public static void mostrarAlumnosJava(List<Alumno> listaAlumnos) {
        System.out.println("Lista de alumnos del curso de Java:");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getCurso().equalsIgnoreCase("Java") && alumno.getEdad() > 18)
                .forEach(alumno -> System.out.println("Nombre: " + alumno.getNombre() + ", " + "Edad: " + alumno.getEdad()));
        System.out.println("\n");

    }
}
