package N1Ejercicio1;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static String ultimoComando = null;

    public static void main(String[] args) {
        // Utilización del patrón Singleton para obtener una instancia única de la clase Undo
        Undo undo = Undo.getInstance();

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {

                case 0:
                    System.out.println("Usted ha salido de la aplicación");
                    break;
                case 1:
                    introducirComando(undo);
                    listarComando(undo);
                    break;
                case 2:
                    eliminarComando(undo);
                    listarComando(undo);
                    break;
                case 3:
                    listarComando(undo);
                    break;
                default:
                    System.out.println("La opción no es válida");
            }
        } while (opcion != 0);
    }
    public static byte menu() {

        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("0.Salir de la aplicación");
            System.out.println("1.Introducir un comando");
            System.out.println("2.Eliminar un comando");
            System.out.println("3.Listar los comandos utilizados");

            opcion = sc.nextByte();
            sc.nextLine();



            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }

public static void introducirComando(Undo undo){

        System.out.println("Introduzca un comando");
        String comando = sc.nextLine();
        undo.agregarComando(comando);

        // Actualizo el último comando ingresado
        ultimoComando = comando;

}

public static void eliminarComando(Undo undo){

    if (ultimoComando != null) {
        undo.eliminarComando(ultimoComando);
        ultimoComando = null; // Reinicio el último comando
    }
}
public static void listarComando(Undo undo){
    System.out.println("Lista de los comandos utilizados:");
        undo.listarComandos();
    System.out.println("\n");
}

}

 //Versión sin la intervensión del usuario
 /*undo.agregarComando("DELETE");
        undo.agregarComando("CTRL + SHIFT");
        undo.agregarComando("ALT + SUPR");
        undo.agregarComando("INSERT");
        undo.agregarComando("CTRL + V");

        System.out.println("Lista de comandos:");

        undo.listarComandos();

        undo.eliminarComando("CTRL + V");

        System.out.println("Lista de comandos para ver que se elimina el último:");

        undo.listarComandos();*/
