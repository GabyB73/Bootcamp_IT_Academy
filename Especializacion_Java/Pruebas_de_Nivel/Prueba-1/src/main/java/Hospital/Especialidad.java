package Hospital;

public class Especialidad {

    private String medicinaGeneral;
    private String traumatologia;
    private String neurologia;

    public Especialidad(String medicinaGeneral, String traumatologia, String neurologia) {
        this.medicinaGeneral = medicinaGeneral;
        this.traumatologia = traumatologia;
        this.neurologia = neurologia;
    }

    public String getMedicinaGeneral() {
        return medicinaGeneral;
    }

    public void setMedicinaGeneral(String medicinaGeneral) {
        this.medicinaGeneral = medicinaGeneral;
    }

    public String getTraumatologia() {
        return traumatologia;
    }

    public void setTraumatologia(String traumatologia) {
        this.traumatologia = traumatologia;
    }

    public String getNeurologia() {
        return neurologia;
    }

    public void setNeurologia(String neurologia) {
        this.neurologia = neurologia;
    }

}

