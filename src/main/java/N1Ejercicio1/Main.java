package N1Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("Juan", "Perez", 8.5d);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("José", "Díaz", 9.0d);
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Ana", "Castro", 7.50d);

        trabajador.calcularSueldo(20);
        trabajadorPresencial.calcularSueldo(30);
        trabajadorOnline.calcularSueldo(15);


    }
}
