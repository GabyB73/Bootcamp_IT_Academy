package Floristeria.Client;

import Floristeria.Products.Arbol;
import Floristeria.Products.Decoracion;
import Floristeria.Products.Flor;
import Floristeria.Products.Producto;

import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    Ticket ticket = new Ticket();

    public void start() {
        boolean salir = false;
        do {
            String nombre = "";

            switch (menu()) {
                case 1 -> crearFloristeria();
                case 2 -> agregarArbol(Floristeria.getInstance().getProductos());
                case 3 -> agregarFlor(Floristeria.getInstance().getProductos());
                case 4 -> agregarDecoracion(Floristeria.getInstance().getProductos());
                case 5 -> imprimirStock();
                case 6 -> retirarArbol(nombre, Floristeria.getInstance().getProductos());
                case 7 -> retirarFlor(nombre, Floristeria.getInstance().getProductos());
                case 8 -> retirarDecoracion(nombre, Floristeria.getInstance().getProductos());
                case 9 -> imprimirStockConCantidades();
                case 10 -> imprimirValorTotalFloristeria();
                case 11 -> ticket = crearTickets();
                case 12 -> mostrarListaComprasAntiguas(ticket);
                case 13 -> visualizarTotalDineroGanado();
/*              case 0 -> cerrarApp();
                System.out.println("Gracias por utilizar la aplicación");
                    salir = true;
                    break;*/
            }
        } while (!salir);
    }

    ////////////////// ESPACIO TRABAJO GABRIELA //////////////////

    public void agregarArbol(List<Producto> stockProductos) {
        // Solicita al usuario los datos del arbol (nombre, precio, altura)
        System.out.println("Ingrese el nombre del arbol:");
        String nombreArbol = sc.nextLine();
        System.out.println("Ingrese el precio del arbol:");
        double precioArbol = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la altura del arbol:");
        double alturaArbol = sc.nextDouble();
        sc.nextLine();

        // Crea un nuevo objeto Arbol con los valores ingresados
        Arbol arbol = new Arbol(nombreArbol, precioArbol, alturaArbol);

        // Agrega el arbol a la lista de productos
        stockProductos.add(arbol);
        System.out.println(stockProductos);

        System.out.println("Arbol agregado correctamente al stock");
    }

    public void agregarFlor(List<Producto> stockProductos) {
        // Solicita al usuario los datos de la flor (nombre, precio, color)
        System.out.println("Ingrese el nombre de la flor:");
        String nombreFlor = sc.nextLine();
        System.out.println("Ingrese el precio de la flor:");
        double precioFlor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el color de la flor:");
        String colorFlor = sc.nextLine();

        // Crea un nuevo objeto flor con los valores ingresados
        Flor flor = new Flor(nombreFlor, precioFlor, colorFlor);

        // Agrega la flor a la lista de productos
        stockProductos.add(flor);

        System.out.println("Flor agregada correctamente al stock");
    }

    public void agregarDecoracion(List<Producto> stockProductos) {
        // Solicita al usuario los datos de la decoración (nombre, precio, material)
        System.out.println("Ingrese el nombre de la decoracion:");
        String nombreDecoracion = sc.nextLine();
        System.out.println("Ingrese el precio de la decoracion:");
        double precioDecoracion = sc.nextDouble();
        sc.nextLine(); // Consumir la nueva línea restante
        System.out.println("Ingrese el material de la decoracion (wood/plastic):");
        String material = sc.nextLine().toLowerCase(); // Lee el material como una cadena y convierte a minúsculas

        boolean materialIsWood = material.equals("wood"); // Verifica si es "wood" para establecer el valor booleano

        // Crea un nuevo objeto Decoracion con los valores ingresados
        Decoracion decoracion = new Decoracion(nombreDecoracion, precioDecoracion, materialIsWood);

        // Agrega la decoracion a la lista de productos
        stockProductos.add(decoracion);

        System.out.println("Decoracion agregada correctamente al stock");
    }

    public Arbol buscarArbol(String nombre, List<Producto> stockProductos) {
        for (Producto producto : stockProductos) {
            if (producto instanceof Arbol && producto.getNombre().equalsIgnoreCase(nombre)) {
                return (Arbol) producto; // Hacemos un casting a Arbol si encontramos un producto que es un arbol.
            }
        }
        return null; // Devuelve null si no se encuentra el arbol.
    }

    public Flor buscarFlor(String nombre, List<Producto> stockProducto) {
        for (Producto producto : stockProducto) {
            if (producto instanceof Flor && producto.getNombre().equalsIgnoreCase(nombre)) {
                return (Flor) producto; // Hacemos un casting a Flor si encontramos un producto que es una flor.
            }
        }
        return null; // Devuelve null si no se encuentra la flor.
    }

    public Decoracion buscarDecoracion(String nombre, List<Producto> stockProductos) {
        for (Producto producto : stockProductos) {
            if (producto instanceof Decoracion && producto.getNombre().equalsIgnoreCase(nombre)) {
                return (Decoracion) producto; // Hacemos un casting a Decoracion si encontramos un producto que es una decoracion.
            }
        }
        return null; // Devuelve null si no se encuentra la decoración.
    }

    public void retirarArbol(String nombre, List<Producto> stockProductos) {
        // Pedir al usuario que ingrese el nombre del árbol que desea retirar
        System.out.print("Introduzca el nombre del árbol que desea retirar: ");
        String nombreArbol = sc.nextLine();

        // Buscar el árbol en el stock de productos
        Arbol arbolEncontrado = buscarArbol(nombreArbol, stockProductos);

        // Lógica para remover árbol del ArrayList
        if (arbolEncontrado == null) {
            System.out.println("No hemos encontrado el arbol\n");
        } else {
            stockProductos.remove(arbolEncontrado);
            System.out.println("Arbol retirado correctamente\n");
        }
    }

    public void retirarFlor(String nombre, List<Producto> stockProductos) {
        // Pedir al usuario que ingrese el nombre de la flor que desee retirar
        System.out.print("Introduzca el nombre de la flor que desea retirar: ");
        String nombreFlor = sc.nextLine();

        // Buscar la flor en el stock de productos
        Flor florEncontrada = buscarFlor(nombreFlor, stockProductos);

        // Logica para remover flor del ArrayList
        if (florEncontrada == null) {
            System.out.println("No hemos encontrado la flor\n");
        } else {
            stockProductos.remove(florEncontrada);
            System.out.println("Flor retirada correctamente\n");
        }
    }

    public void retirarDecoracion(String nombre, List<Producto> stockProductos) {
        // Pedir al usuario que ingrese el nombre de la decoracion que desee retirar
        System.out.print("Introduzca el nombre de la decoracion que desea retirar: ");
        String nombreDecoracion = sc.nextLine();

        // Buscar la decoracion en el stock de productos
        Decoracion decoracionEncontrada = buscarDecoracion(nombreDecoracion, stockProductos);

        // Logica para remover decoracion del ArrayList
        if (decoracionEncontrada == null) {
            System.out.println("No hemos encontrado la decoracion\n");
        } else {
            stockProductos.remove(decoracionEncontrada);
            System.out.println("Decoracion retirada correctamente\n");
        }
    }

    ////////////////// FIN ESPACIO TRABAJO GABRIELA //////////////////


    ////////////////// ESPACIO TRABAJO ANA //////////////////
    // Método para imprimir los productos
    public void imprimirStock() {
        System.out.println("Productos en la floristería:");
        for (Producto producto : Floristeria.getInstance().getProductos()) {
            System.out.println(producto.toString());
        }
    }

    // Método para imprimir el stock con cantidades
    public void imprimirStockConCantidades() {
        int countArboles = 0;
        int countFlores = 0;
        int countDecoraciones = 0;

        for (Producto producto : Floristeria.getInstance().getProductos()) {
            // Utilizamos 'instanceof' para determinar el tipo de producto
            if (producto instanceof Arbol) {
                countArboles++;  // Incrementamos el contador
            } else if (producto instanceof Flor) {
                countFlores++;
            } else if (producto instanceof Decoracion) {
                countDecoraciones++;
            }
        }
        // Imprimimos la cantidad de cada tipo de producto en el stock
        System.out.println("Cantidad de Árboles en stock: " + countArboles + "\n" +
                "Cantidad de Flores en stock: " + countFlores + "\n" +
                "Cantidad de Decoraciones en stock: " + countDecoraciones);
    }

    // Método para calcular el valor total de la Floristería
    public void imprimirValorTotalFloristeria() {
        double valorStock = Floristeria.getInstance().getProductos().stream().mapToDouble(Producto::getPrecio).sum();
        System.out.println("Valor total de la floristería: " + valorStock + " euros");
    }

    ////////////////// FIN ESPACIO TRABAJO ANA //////////////////


    /// ESPACIO TRABAJO JUAN

    private void visualizarTotalDineroGanado() {
        double suma = 0;
        for (int i = 0; i <= ticket.getId(); i++) {
            suma += Floristeria.getInstance().getTickets().get(i).getTotal();
        }
        System.out.println("El total de dinero ganado con todas las ventas es:\n + " + suma + "€");
    }

    private void mostrarListaComprasAntiguas(Ticket ticket) {
        System.out.println("Lista de compras antiguas:");
        for (int i = 0; i <= ticket.getId(); i++) {
            System.out.println(Floristeria.getInstance().getTickets().get(i));
        }
    }

    private Ticket crearTickets() {
        Ticket ticket = new Ticket();
        Producto producto;
        System.out.println("Ticket creado correctamente");
        boolean salir = false;
        int i = 1;
        while (!salir) {
            byte opcion;
            System.out.println("Añade el " + i + "º producto:\n1. Decoracion\n2. Arbol\n3. Flor");
            opcion = sc.nextByte();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el nombre de la decoracion");
                    String nombre = sc.nextLine();
                    ticket.getProductos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst().ifPresentOrElse(
                            p -> {
                                ticket.addProducto(p);
                                System.out.println("Decoracion: " + nombre + " añadida al ticket");
                            },
                            () -> System.out.println("No existe una decoracion con ese nombre")
                    );
                }
                case 2 -> {
                    System.out.println("Introduce el nombre del arbol");
                    String nombre = sc.nextLine();
                    ticket.getProductos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst().ifPresentOrElse(
                            p -> {
                                ticket.addProducto(p);
                                System.out.println("Arbol: " + nombre + " añadido al ticket");
                            },
                            () -> System.out.println("No existe un arbol con ese nombre")
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
            if ((ticket.getProductos().size() + 1) == i) {
                i++;
            }
            Floristeria.getInstance().getTickets().add(ticket);
            System.out.println("¿Quieres añadir otro producto?\n1. Sí\n2. No");
            if (sc.nextByte() == 2) {
                salir = true;
            }
        }
        return ticket;
    }

    private Floristeria crearFloristeria() {

        Floristeria floristeria = Floristeria.getInstance();

        if (floristeria.getNombre() == null) {
            System.out.println("Introduce el nombre de la floristeria");
            String nombre = sc.nextLine();
            floristeria.setNombre(nombre);
            System.out.println("Floristería " + "\"" + nombre + "\"" + " creada con éxito");
        } else {
            System.out.println("Ya existe una floristería con el nombre " + floristeria.getNombre());
        }
        return floristeria;
    }

    // FIN ESPACIO TRABAJO JUAN


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
