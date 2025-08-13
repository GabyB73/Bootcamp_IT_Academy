package N3Ejercicio1;

import java.util.Objects;
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre     = nombre;
        this.apellido   = apellido;
        this.dni        = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return Objects.equals(dni, persona.dni);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {

        return nombre + "  " + apellido + "  " + dni;
    }
}
