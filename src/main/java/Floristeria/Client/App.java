package Floristeria.Client;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public void start() {
        boolean salir = false;
        do {
            switch (menu()) {
                case 1:
                    crearFloristeria();
                    break;
                case 2:
                    //agregarArbol();
                    break;
                case 3:
                    //agregarFlor();
                    break;
                case 4:
                    //agregarDecoracion();
                    break;
                case 5:
                    //imprimirStock();
                    break;
                case 6:
                    //retirarArbol();
                    break;
                case 7:
                    //retirarFlor();
                    break;
                case 8:
                    //retirarDecoracion();
                    break;
                case 9:
                    //imprimirStockConCantidades();
                    break;
                case 10:
                    //imprimirValorTotalFloristeria();
                    break;
                case 11:
                    //crearTickets();
                    break;
                case 12:
                    //mostrarListaComprasAntiguas();
                    break;
                case 13:
                    //visualizarTotalDineroGanado();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    private Floristeria crearFloristeria() {

        Floristeria floristeria = Floristeria.getInstance();

        if (floristeria.getNombre() == null) {
            System.out.println("Introduce el nombre de la floristería");
            String nombre = sc.nextLine();
            floristeria.setNombre(nombre);
            System.out.println("Floristería " + "\"" + nombre + "\"" + " creada con éxito");
        } else {
            System.out.println("Ya existe una floristería con el nombre " + floristeria.getNombre());
        }
        return floristeria;
    }

    private static int menu() {
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 13;

        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Crear floristeria."); // Singleton
            System.out.println("2. Agregar árbol."); // Factory
            System.out.println("3. Agregar flor."); // Factory
            System.out.println("4. Agregar decoración"); // Factory
            System.out.println("5. Stock: Imprimir árboles, flores y decoración."); // Dependency Injection
            System.out.println("6. Retirar árbol.");
            System.out.println("7. Retirar flor.");
            System.out.println("8. Retirar decoración.");
            System.out.println("9. Imprimir stock con cantidades.");
            System.out.println("10. Imprimir valor total floristeria."); // Dependency Injection
            System.out.println("11. Crear tickets de compra con múltiples objetos."); // Patron Command
            System.out.println("12. Mostrar lista de compras antiguas."); // Patron Undo
            System.out.println("13. Visualizar el total de dinero ganado con todas las ventas."); // Patron Observer
            System.out.println("0. Salir de la aplicación.\n");
            opcion = sc.nextByte();
            sc.nextLine();
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoge una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }
}
