package N1Ejercicio1;

public class Trabajador {
    private String nombre;
    private String apellido;
    private double precioPorHora;
    public Trabajador() {

    }
    public Trabajador(String nombre, String apellido, double precioPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioPorHora = precioPorHora;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public void calcularSueldo(double horasTrabajadas){
        System.out.println("El precio por hora es: " + precioPorHora * horasTrabajadas + " €");
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", precioPorHora=" + precioPorHora +
                '}';
    }
}
