package N3Ejercicio1;

public class Butaca {

    private int numeroFila;
    private int numeroAsiento;
    private String nombrePersona;

    public Butaca(int numeroFila, int numeroAsiento, String nombrePersona) {
        this.numeroFila     = numeroFila;
        this.numeroAsiento  = numeroAsiento;
        this.nombrePersona  = nombrePersona;


    }
    public int getNumeroFila() {

        return numeroFila;
    }
    public void setNumeroFila(int numeroFila) {

        this.numeroFila = numeroFila;
    }
    public int getNumeroAsiento() {

        return numeroAsiento;
    }
    public void setNumeroAsiento(int numeroAsiento) {

        this.numeroAsiento = numeroAsiento;
    }
    public String getNombrePersona() {

        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {

        this.nombrePersona = nombrePersona;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Butaca butaca = (Butaca) obj;
        return numeroFila == butaca.numeroFila && numeroAsiento == butaca.numeroAsiento;
    }

    @Override
    public String toString() {
        return "Fila: " + numeroFila + ", Asiento: " + numeroAsiento + ", Persona: " + nombrePersona;
    }
}
