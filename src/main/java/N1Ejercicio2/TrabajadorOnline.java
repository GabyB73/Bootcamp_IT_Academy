package N1Ejercicio2;

public class TrabajadorOnline extends Trabajador{
    private final int TARIFA_PLANA_INTERNET = 50;

    public TrabajadorOnline() {
    }

    public TrabajadorOnline(String nombre, String apellido, double precioPorHora) {
        super(nombre, apellido, precioPorHora);
    }

    @Override
    public void calcularSueldo(double horasTrabajadas) {
        double salario = getPrecioPorHora() * horasTrabajadas + TARIFA_PLANA_INTERNET;
        System.out.println("El salario mensual es de " + salario + " €");
    }
    @Deprecated
    public void metodoObsoleto(){
        System.out.println("Este es un método obsoleto");
    }
}
