package N1Ejercicio2;

public class Main {
@SuppressWarnings("deprecated")
    public static void main(String[] args) {

    Trabajador trabajador = new Trabajador("Juan", "Perez", 8.5d);
    TrabajadorPresencial trabajadorPresencial =new TrabajadorPresencial("Sandra", "Sanchez", 9.5d);
    TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Ana", "Velez", 8.75d);

    trabajador.calcularSueldo(120);
    trabajadorPresencial.calcularSueldo(150);
    trabajadorOnline.calcularSueldo(125);

    trabajador.metodoObsoleto(); //Advertencia por método obsoleto
    trabajadorPresencial.metodoObsoleto(); //Advertencia por método obsoleto
    trabajadorOnline.metodoObsoleto(); //Advertencia por método obsoleto
    }
}
