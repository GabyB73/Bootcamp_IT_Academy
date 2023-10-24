package Hospital;

public class Persona {
private String nombre;
private int numIdentificacion;

    public Persona(String nombre, int numIdentificacion) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                '}';
    }
}




