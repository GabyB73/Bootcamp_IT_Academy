package N2Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Gabriela", "Bustamante", 49);

        GenericMethods<String> prueba1 = new GenericMethods<>("Hola", "Mundo", persona);
        GenericMethods<Integer> prueba2 = new GenericMethods<>(1, 2, "Tres");

        System.out.println(prueba1);
        System.out.println(prueba2);
    }

}
