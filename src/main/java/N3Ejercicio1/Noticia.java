package N3Ejercicio1;
public abstract class Noticia {
    private String titular;
    private String texto;
    private int puntuacion;
    private double precio;
    private Redactor redactor;

    public Noticia(String titular, String texto, int puntuacion, double precio, Redactor redactor) {
        this.titular     = titular;
        this.texto       = texto;
        this.puntuacion  = puntuacion;
        this.precio      = precio;
        this.redactor    = redactor;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método para obtener el redactor
    public Redactor getRedactor() {
        return redactor;
    }
    //Métodos abstractos
    public abstract double calcularPrecioNoticia();
    public abstract int calcularPuntuacionNoticia();

   }
