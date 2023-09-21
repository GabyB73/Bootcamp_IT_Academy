package N1Ejercicio1;

public class TrabajadorPresencial extends Trabajador{
    private static double gasolina= 40;

    public TrabajadorPresencial() {
    }
    public TrabajadorPresencial(String nombre, String apellido, double precioPorHora) {
        super(nombre, apellido, precioPorHora);
    }

    @Override
    public void calcularSueldo(double horasTrabajadas) {
        double salario = super.getPrecioPorHora() * horasTrabajadas + gasolina;
        System.out.println("El salario mensual es de " + salario + " €");
    }
}
