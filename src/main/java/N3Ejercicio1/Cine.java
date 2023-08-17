package N3Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Cine {

    static Scanner sc = new Scanner(System.in); //Declaración del Scanner como estático para ser usado en todos los métodos.

    //Atributos de la clase Cine
    private int numFilasDelCine;
    private int numAsientosPorFila;
    private GestionButaca gestionButaca;
    private ArrayList<Butaca> butacas;

    //Constructor de la clase Cine
    public Cine() {
            gestionButaca = new GestionButaca();
            butacas = new ArrayList<Butaca>();

        pedirDatosIniciales();

        }
    String nombre;

    public void iniciar() {
        while (true) {
            byte opcion = menu();

            switch (opcion) {
                case 1:
                    mostrarButacasReservadas(butacas);
                    break;
                case 2:
                    mostrarButacasPersona(butacas, nombre);
                    break;
                case 3:
                    reservarButaca(butacas, this); // Usar "this" para referenciar la instancia actual de la clase Cine
                    break;
                case 4:
                    anularReserva(butacas, this);// Usar "this" para referenciar la instancia actual de la clase Cine
                    break;
                case 5:
                    anularReservaPersona(butacas, this);// Usar "this" para referenciar la instancia actual de la clase Cine
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public static byte menu() {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 5;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("1.Mostrar todas las butacas reservadas");
            System.out.println("2.Mostrar las butacas reservadas por una persona");
            System.out.println("3.Reservar un sillón");
            System.out.println("4.Anular la reseva de un sillón");
            System.out.println("5.Anular todas las reservas de una persona");
            System.out.println("0.Salir de la aplicación");

            opcion = sc.nextByte();
            sc.nextLine();

            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }

    //Método para iniciar la aplicación
    public void pedirDatosIniciales() {
        System.out.println("Introduzca el número de filas que tiene la sala");
        numFilasDelCine = sc.nextInt();

        System.out.println("Introduzca el número de asientos totales que tiene la fila");
        numAsientosPorFila = sc.nextInt();

    }
    public static void reservarButaca(ArrayList<Butaca> butacas, Cine cine) {
        int numFila = cine.introducirFila();

        int numAsiento = cine.introducirAsiento();
        String nombrePersona = cine.introducirPersona();

        Butaca butacaReservada = buscarButaca(butacas, numFila, numAsiento);

        if (butacaReservada != null) {
            System.out.println("La butaca ya está reservada.");
        } else {
            Butaca nuevaButaca = new Butaca(numFila, numAsiento, nombrePersona);
            butacas.add(nuevaButaca);
            System.out.println("Hola " + nombrePersona + " ha reservado la butaca " + numAsiento +
                    " en la fila " + numFila);
        }
    }
    public static void mostrarButacasReservadas(ArrayList<Butaca> butacas) {
        if (butacas.isEmpty()) {
            System.out.println("Todas las butacas están libres.");

        }

        for (Butaca butaca : butacas) {
            if (butaca.getNombrePersona() != null) {
                System.out.println(butaca.toString());
            }
        }
    }
    public static void mostrarButacasPersona(ArrayList<Butaca> butacas, String nombre) {
        boolean hayButacasReservadas = !butacas.isEmpty();
        boolean encontrado = false;

        if (hayButacasReservadas) {
            System.out.println("Introduzca el nombre de la persona que ha hecho la reserva");
            nombre = sc.nextLine();
        }

        for (Butaca butaca : butacas) {
            if (butaca.getNombrePersona() != null && butaca.getNombrePersona().equalsIgnoreCase(nombre)) {
                System.out.println(butaca.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            if (hayButacasReservadas) {
                System.out.println("No se han hecho reservas para " + nombre + ".");
            } else {
                System.out.println("Todas las butacas están libres.");
            }
        }
    }
    public static void anularReserva(ArrayList<Butaca> butacas, Cine cine) {
        int numFila = cine.introducirFila();
        //sc.nextLine();
        int numAsiento = cine.introducirAsiento();
        //sc.nextLine();

        Butaca butacaReservada = buscarButaca(butacas, numFila, numAsiento);

        if (butacaReservada != null) {
            butacas.remove(butacaReservada);
            System.out.println("Reserva anulada para la butaca " + numAsiento+ " de la fila " + numFila );
        } else {
            System.out.println("La butaca no está reservada o no existe.");
        }
    }
    public static void anularReservaPersona(ArrayList<Butaca> butacas, Cine cine) {
        String nombrePersona = cine.introducirPersona();

        System.out.println("¿Deseas anular las reservas de " + nombrePersona + "? (S/N)");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            ArrayList<Butaca> butacasAEliminar = new ArrayList<>();

            for (Butaca butaca : butacas) {
                if (butaca.getNombrePersona() != null && butaca.getNombrePersona().equalsIgnoreCase(nombrePersona)) {
                    butacasAEliminar.add(butaca);
                }
            }

            if (!butacasAEliminar.isEmpty()) {
                butacas.removeAll(butacasAEliminar);
                System.out.println("Reservas de " + nombrePersona + " anuladas.");
            } else {
                System.out.println("No se encontraron reservas para " + nombrePersona + ".");
            }
        }
    }


    public static void mostrarButaca(ArrayList<Butaca>butacas, int numFila, int numAsiento){

        Butaca butaca = buscarButaca(butacas, numFila, numAsiento);

        if (butaca != null) {
            System.out.println(butaca.toString());
        } else {
            System.out.println("La butaca " + butaca + " " + "no está en la aplicación");
        }
    }
    public static Butaca buscarButaca(ArrayList<Butaca> butacas, int numFila, int numAsiento) {

        Butaca butaca = null;
        int i = 0;

        while (butaca == null && i < butacas.size()) {
            if (butacas.get(i).getNumeroFila() == numFila && butacas.get(i).getNumeroAsiento() == numAsiento) {
                butaca = butacas.get(i);
            }
            i++;
        }
        return butaca;
    }

    // Clase ExcepcionNomPersonaIncorrecto (Excepción personalizada)
    public class ExcepcionNomPersonaIncorrecto extends Exception {
       public ExcepcionNomPersonaIncorrecto() {
        }
        public ExcepcionNomPersonaIncorrecto(String message) {
            super(message);
        }
    }
    public String introducirPersona() {

        while (true) {
            try {
                System.out.println("Introduce el nombre de la persona:");
                String nombre = sc.nextLine();

                // Verificar si el nombre contiene números usando expresión regular
                if (nombre.matches(".*\\d.*")) {
                    throw new ExcepcionNomPersonaIncorrecto();
                }

                return nombre;
            } catch (ExcepcionNomPersonaIncorrecto e) {
                System.out.println("Error: El nombre contiene números. Introduce un nombre válido.");
            }finally {

            }
        }
    }

        public class ExcepcionFilaIncorrecta extends Exception {
            public ExcepcionFilaIncorrecta() {
            }
            public ExcepcionFilaIncorrecta(String message) {
                super(message);
            }
        }
    public int introducirFila() {
        int numFila = 0;
        boolean filaValida = false;

        while (!filaValida) {
            try {
                System.out.println("Introduce el número de fila:");
                numFila = sc.nextInt();

                if (numFila >= 1 && numFila <= numFilasDelCine) {
                    filaValida = true;
                } else {
                    throw new ExcepcionFilaIncorrecta();
                }
            } catch (ExcepcionFilaIncorrecta e) {
                System.out.println("Error: El número de fila es incorrecto.");
            } finally {
                //sc.nextLine(); // Limpia el búfer de entrada
            }
        }

        return numFila;
    }
            public class ExcepcionAsientoIncorrecto extends Exception {
                public ExcepcionAsientoIncorrecto() {
                }
                public ExcepcionAsientoIncorrecto(String message) {
                    super(message);
                }
            }
            public int introducirAsiento() {
                int numAsiento = 0;
                boolean asientoValido = false;

                while (!asientoValido) {
                    try {
                        System.out.println("Introduce el número de asiento:");
                        numAsiento = sc.nextInt();

                        if (numAsiento >= 1 && numAsiento <= numAsientosPorFila) {
                            asientoValido = true;
                        } else {
                            throw new ExcepcionAsientoIncorrecto();
                        }
                    } catch (ExcepcionAsientoIncorrecto e) {
                        System.out.println("Error: El número de asiento es incorrecto.");

                    }finally {
                        // Limpia el búfer de entrada antes de intentar nuevamente
                        sc.nextLine();
                    }
                }
                return numAsiento;
    }



}