package Floristeria.Client;

import Floristeria.Products.Decoracion;
import Floristeria.Products.Producto;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public void start() {
        boolean salir = false;
        do {
            switch (menu()) {
                case 1 -> crearFloristeria();
/*                case 2 -> agregarArbol();
                case 3 -> agregarFlor();
                case 4 -> agregarDecoracion();
                case 5 -> imprimirStock();
                case 6 -> retirarArbol();
                case 7 -> retirarFlor();
                case 8 -> retirarDecoracion();
                case 9 -> imprimirStockConCantidades();
                case 10 -> imprimirValorTotalFloristeria();*/
                case 11 -> crearTickets();
/*                case 12 -> mostrarListaComprasAntiguas();
                case 13 -> visualizarTotalDineroGanado();
                case 0 -> cerrarApp();
                System.out.println("Gracias por utilizar la aplicación");
                    salir = true;
                    break;*/
            }
        } while (!salir);
    }

    private void crearTickets() {
        Ticket ticket = new Ticket();
        Producto producto;
        byte opcion;
        int i = 1;
        System.out.println("Ticket creado, añade el " + i + " producto:\n1. Decoracion\n2. Arbol\n3. Flor");
        opcion = sc.nextByte();
        sc.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.println("Introduce el nombre de la decoración");
                String nombre = sc.nextLine();
                ticket.getProductos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst().ifPresentOrElse(
                        p -> {
                            ticket.addProducto(p);
                            System.out.println("Decoración: " + nombre + " añadida al ticket");
                        },
                        () -> System.out.println("No existe una decoración con ese nombre")
                );
            }
            case 2 -> {
                System.out.println("Introduce el nombre del árbol");
                String nombre = sc.nextLine();
                ticket.getProductos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst().ifPresentOrElse(
                        p -> {
                            ticket.addProducto(p);
                            System.out.println("Árbol: " + nombre + " añadido al ticket");
                        },
                        () -> System.out.println("No existe un árbol con ese nombre")
                );
            }
            case 3 -> {
                System.out.println("Introduce el nombre de la flor");
                String nombre = sc.nextLine();
                ticket.getProductos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst().ifPresentOrElse(
                        p -> {
                            ticket.addProducto(p);
                            System.out.println("Flor: " + nombre + " añadida al ticket");
                        },
                        () -> System.out.println("No existe una flor con ese nombre")
                );
            }
        }

        System.out.println();
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
            System.out.println("12. Mostrar lista de compras antiguas.");
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
