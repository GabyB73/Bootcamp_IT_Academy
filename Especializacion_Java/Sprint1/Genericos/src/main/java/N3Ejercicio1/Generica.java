package N3Ejercicio1;

public class Generica{
    public Generica() {

    }
    //Solo tiene accesa a los métodos de Telefono (t.hacerFotos(); no es posible)
    public <T extends Telefono> void metodoGenerico1(T t) {
        t.llamar();

    }

    //Tiene acceso a los métodos de Smartphone
    public <T extends Smartphone> void metodoGenerico2(T t) {

        t.hacerFotos();
        t.llamar();
    }

}
