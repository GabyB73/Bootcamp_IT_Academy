package N1Ejercicio5;

public class Main {

    public static void main(String[] args) {

        //Instanciar la Interface
        FunctionalInterface functionalInterface = () -> 3.1415;

        //Imprimir el valor llamando al método getPiValue
        System.out.println(functionalInterface.getPiValue());

    }
}
