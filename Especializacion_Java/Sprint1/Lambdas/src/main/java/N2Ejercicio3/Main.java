package N2Ejercicio3;

public class Main {

    public static void main(String[] args) {

        calcular();

    }
    public static void calcular(){

        FunctionalInterface suma = (a, b) -> a + b;
        FunctionalInterface resta = (a, b) -> a - b;
        FunctionalInterface multiplicacion = (a, b) -> a * b;
        FunctionalInterface division = (a, b) -> a / b;

        System.out.println("El resultado de la suma es " + suma.operacion(5.5f, 10));
        System.out.println("El resultado de la resta es " + suma.operacion(13.5f, 10));
        System.out.println("El resultado de la multiplicación es " + suma.operacion(2, 25.5f));
        System.out.println("El resultado de la división es " + suma.operacion(500,10.5f));
    }
}
