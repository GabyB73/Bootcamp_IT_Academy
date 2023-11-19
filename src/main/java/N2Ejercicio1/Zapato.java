package N2Ejercicio1;

public class Zapato {

    private String tipoZapato;
    private String modelo;
    private double talla;
    private double precio;


    public String getTipoZapato() {
        return tipoZapato;
    }

    public void setTipoZapato(String tipoZapato) {
        this.tipoZapato = tipoZapato;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "tipoZapato='" + tipoZapato + '\'' +
                ", modelo='" + modelo + '\'' +
                ", talla=" + talla +
                ", precio=" + precio +
                '}';
    }
}
