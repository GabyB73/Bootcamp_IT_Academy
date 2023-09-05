package N2Ejercicio2;
import java.util.Objects;
public class Restaurante implements Comparable <Restaurante> {
    private String nombre;
    private int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre     = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurante restaurante = (Restaurante) obj;
        return puntuacion == restaurante.puntuacion && Objects.equals(nombre, restaurante.nombre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, puntuacion);
    }
    @Override

    public int compareTo(Restaurante otroRestaurante) {
        // Primero, compara por nombre
        int comparacionNombre = this.nombre.compareToIgnoreCase(otroRestaurante.nombre);

        // Si los nombres son iguales, compara por puntuación
        if (comparacionNombre == 0) {
            return Integer.compare(this.puntuacion, otroRestaurante.puntuacion);
        }

        return comparacionNombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre.toUpperCase() + ", puntuación: " + puntuacion;
    }
}




