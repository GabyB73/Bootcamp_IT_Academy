package N1Ejercicio1;

public class Main {

    public static void main(String [] args){

        InstrumentoViento instrumentoViento = new InstrumentoViento("trompeta", 159.89f);
        InstrumentoCuerda instrumentoCuerda = new InstrumentoCuerda("guitarra", 89.99f);
        InstrumentoPercusion instrumentoPercusion = new InstrumentoPercusion("bateria", 899.50f);

        // Crear una instancia de Instrumento (puede ser cualquiera de las subclases)
        Instrumento instrumento = new InstrumentoViento("flauta", 50.0f);

        // Acceder al método estático a través de la instancia
        instrumento.mensajeEstatico();

        // Llamar a los métodos tocar() en las instancias de las clases hijas
        System.out.println(instrumentoViento.tocar());
        System.out.println(instrumentoCuerda.tocar());
        System.out.println(instrumentoPercusion.tocar());
    }
}
