package N3Ejercicio1;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    private double nota;

    public Alumno(String nombre, int edad, String curso, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
