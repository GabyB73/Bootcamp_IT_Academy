package N1Ejercicio5;

import java.io.Serializable;

public class InformacionArchivo implements Serializable {

    private String nombre;
    private String tipo; // Usar "D" para directorio o "F" para archivo
    private String fechaModificacion;

    // Constructor, getters y setters
    public InformacionArchivo(String nombre, String tipo, String fechaModificacion) {
        this.nombre             = nombre;
        this.tipo               = tipo;
        this.fechaModificacion  = fechaModificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getFechaModificacion() {
        return fechaModificacion;
    }
    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
