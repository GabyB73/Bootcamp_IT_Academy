package N3Ejercicio1;
import java.util.ArrayList;
import java.util.UUID;
public class Redactor {
    private String nombre;
    private final String dni; //Una vez que se ingrese un dni no se podrá modificar
    private double sueldo;
    private ArrayList<Noticia> noticias;

    public Redactor(String nombre, double sueldo) {
        this.nombre     = nombre;
        this.sueldo     = sueldo;
        this.dni        = UUID.randomUUID().toString();     //Generar automáticamente un DNI único usando UUID
        this.noticias   = new ArrayList<>();
    }
    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    public double getSueldo() {

        return sueldo;
    }
    public void setSueldo(float sueldo) {

        this.sueldo = sueldo;
    }
    public String getDni() {

        return dni;
    }
    @Override
    public String toString() {
        return "El nuevo redactor es " + nombre + ", con dni número " + dni + ", y su sueldo es " + sueldo + " €";
    }
}
