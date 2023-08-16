package N1Ejercicio1;

public abstract class Instrumento {
    private String nombre;
    private float precio;

    public Instrumento(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Bloque de inicialización estática
    static {
        System.out.println("La clase Instrumento ha sido cargada.");
    }
    // Miembro estático de ejemplo
    public static void mensajeEstatico(){
        System.out.println("Mensaje estático de la clase Instrumento");
}
    public abstract String tocar();
}
