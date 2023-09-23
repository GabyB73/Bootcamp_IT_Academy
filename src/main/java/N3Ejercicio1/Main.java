package N3Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
import N3Ejercicio1.Redactor;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Redactor> redactores = new ArrayList<>();
        // Agregar un redactor a la lista
        Redactor redactor = new Redactor("Gabriela", 1500);
        redactores.add(redactor);

        ArrayList<Noticia> noticias = new ArrayList<Noticia>();
        //Agregar una noticia a la lista
        NoticiaFutbol noticiaFutbol = new NoticiaFutbol("Partido del domingo", "", 0,
                0.0, "La liga", "Barça", "Ferrán Torres",redactor);
        noticias.add(noticiaFutbol);

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {

                case 0:
                    System.out.println("Usted ha salido de la aplicación");
                    break;
                case 1:
                    introducirRedactor(redactores);
                    break;
                case 2:
                    eliminarRedactor(redactores);
                    break;
                case 3:
                    introducirNoticia(noticias, redactor);
                    break;
                case 4:
                    eliminarNoticia(noticias);
                    break;
                case 5:
                    mostrarNoticiasPorRedactor(noticias,redactores);
                    break;
                case 6:
                    mostrarNoticia(noticias);
                case 7:
                    calcularPuntuacionNoticia(noticias, redactor);
                    break;
                case 8:
                    calcularPrecioNoticia(noticias, redactor);
                    break;
                default:
                    System.out.println("La opción no es válida");
            }
        } while (opcion != 0);
    }
    public static byte menu() {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

        do {
            System.out.println("Menú Principal\nElija una opción: ");
            System.out.println("1.Introducir un redactor");
            System.out.println("2.Eliminar un redactor");
            System.out.println("3.Introducir una noticia");
            System.out.println("4.Eliminar una noticia");
            System.out.println("5.Mostrar una noticia por redactor");
            System.out.println("6.Mostrar una noticia");
            System.out.println("7.Calcular la puntuación de una noticia");
            System.out.println("8.Calcular el precio de una noticia");
            System.out.println("0.Salir de la aplicación");

            opcion = sc.nextByte();
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoja una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }
    public static void introducirRedactor(ArrayList<Redactor> redactores){
        String nombre;
        double sueldo;

        System.out.println("Introducir el nombre del redactor que quiere ingresar en la aplicación");
        nombre = sc.nextLine();

        Redactor redactor = buscarRedactor(nombre,redactores);

        if(redactor == null){

            System.out.println("Introduzca el sueldo");
            sueldo = sc.nextDouble();
            sc.nextLine();

            //agrego el nuevo redactor a la lista
            //redactores.agregarRedactor(new Redactor(nombre, dni, sueldo));
            Redactor nuevoRedactor = new Redactor(nombre, sueldo);
            redactores.add(nuevoRedactor);  // Agregar el nuevo redactor a la lista
            System.out.println(nuevoRedactor);

        }else{
            System.out.println("No se puede ingresar el redactor " + nombre + " porque ya existe en la aplicación");
        }
    }

    public static Redactor buscarRedactor(String nombre, ArrayList<Redactor> redactores) {
        Redactor redactor = null;
        int i = 0;

        while (redactor == null && i < redactores.size()) {

            if (redactores.get(i) instanceof Redactor && redactores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                redactor = (Redactor) redactores.get(i);
            }
            i++;
        }
        return redactor;
    }
    public static void eliminarRedactor(ArrayList<Redactor> redactores){
        System.out.println("Introduzca el nombre del redactor que quiere eliminar de la aplicación");
        String nombre = sc.nextLine();

        Redactor redactor = buscarRedactor(nombre, redactores);

        if (redactor != null) {
            redactores.remove(redactor);
            System.out.println("El redactor " + nombre + " se ha eliminado correctamente");
        } else {
            System.out.println("El redactor " + nombre + " no está en la aplicación");
        }
    }
    public static void introducirNoticia(ArrayList<Noticia> noticias, Redactor redactor) {

        // Pide al usuario que ingrese el tipo de noticia
        System.out.println("Indique el tipo de noticia que quiere introducir: " +
                "\n*Futbol - Baloncesto - Tenis - F1 - Motociclismo*\n");

        String tipoNoticia = sc.nextLine();

        switch (tipoNoticia.toUpperCase()) {
            case "FUTBOL":
                introducirNoticiaFutbol(noticias, redactor);
                break;
            case "BALONCESTO":
                introducirNoticiaBaloncesto(noticias, redactor);
                break;
            case "TENIS":
                introducirNoticiaTenis(noticias, redactor);
                break;
            case "F1":
                introducirNoticiaF1(noticias, redactor);
                break;
            case "MOTOCICLISMO":
                introducirNoticiaMotociclismo(noticias, redactor);
                break;
            default:
                System.out.println("La opción no es válida");
        }
    }

    public static void introducirNoticiaFutbol(ArrayList<Noticia>noticias, Redactor redactor){

        System.out.println("Introduzca el titular de la noticia");
        String titular = sc.nextLine();

        NoticiaFutbol noticiaFutbol = (NoticiaFutbol) buscarNoticiaFutbol(titular, noticias); //hacer casteo NoticiaFutbol

        if (noticiaFutbol == null) {
            // La noticia no existe, entonces puedo crear una nueva noticiaFutbol
            String texto = ""; // Establecer el texto como vacío al crear la noticia

            // Solicitar los demás atributos específicos de NoticiaFutbol
            ArrayList<String> datosFutbol = NoticiaFutbol.obtenerDatosNoticiaFutbol();

            // Obtener los datos del ArrayList
            String competicion = datosFutbol.get(0);
            String club = datosFutbol.get(1);
            String jugador = datosFutbol.get(2);

            // Crear la instancia de NoticiaFutbol con el texto vacío
            NoticiaFutbol nuevaNoticiaFutbol = new NoticiaFutbol(titular, texto, 0, 0, competicion, club, jugador, redactor);

            // Agregar la nueva noticia a la lista
            noticias.add(nuevaNoticiaFutbol);
        } else {
            System.out.println("La noticia ya existe en la aplicación");
        }
    }
    public static void introducirNoticiaBaloncesto(ArrayList<Noticia>noticias, Redactor redactor){

        System.out.println("Introduzca el titular de la noticia");
        String titular = sc.nextLine();

        NoticiaBaloncesto noticiaBaloncesto = (NoticiaBaloncesto) buscarNoticiaBaloncesto(titular, noticias); //hacer casteo NoticiaBaloncesto

        if (noticiaBaloncesto == null) {
            // La noticia no existe, entonces puedo crear una nueva noticiaBaloncesto
            String texto = ""; // Establecer el texto como vacío al crear la noticia

            // Pedir los detalles específicos (competición, club)
            ArrayList<String> datosBaloncesto = NoticiaBaloncesto.obtenerDatosNoticiaBaloncesto();
            String competicion = datosBaloncesto.get(0);
            String club = datosBaloncesto.get(1);

            // Crear la instancia de NoticiaBaloncesto con el texto vacío
            NoticiaBaloncesto nuevaNoticiaBaloncesto = new NoticiaBaloncesto(titular, texto, 0, 0, competicion, club, redactor);

            // Agregar la nueva noticia a la lista
            noticias.add(nuevaNoticiaBaloncesto);
        } else {
            System.out.println("La noticia ya existe en la aplicación");
        }
    }
    public static void introducirNoticiaTenis(ArrayList<Noticia>noticias, Redactor redactor){

        System.out.println("Introduzca el titular de la noticia");
        String titular = sc.nextLine();

        NoticiaTenis noticiaTenis = (NoticiaTenis) buscarNoticiaTenis(titular, noticias); //hacer casteo NoticiaTenis

        if (noticiaTenis == null) {
            // La noticia no existe, entonces puedo crear una nueva noticiaTenis
            String texto = ""; // Establecer el texto como vacío al crear la noticia

            // Solicitar los demás atributos específicos de NoticiaTenis
            ArrayList<String> datosTenis = NoticiaTenis.obtenerDatosNoticiaTenis();
            String competicion = datosTenis.get(0);
            String tenista = datosTenis.get(1);

            // Crear la instancia de NoticiaTenis con el texto vacío
            NoticiaTenis nuevaNoticiaTenis = new NoticiaTenis(titular, texto, 0, 0, competicion, tenista, redactor);

            // Agregar la nueva noticia a la lista
            noticias.add(nuevaNoticiaTenis);
        } else {
            System.out.println("La noticia ya existe en la aplicación");
        }
    }
    public static void introducirNoticiaF1(ArrayList<Noticia>noticias, Redactor redactor){

        System.out.println("Introduzca el titular de la noticia");
        String titular = sc.nextLine();

        NoticiaF1 noticiaF1 = (NoticiaF1) buscarNoticiaF1(titular, noticias); //hacer casteo NoticiaF1

        if (noticiaF1 == null) {
            // La noticia no existe, entonces puedo crear una nueva noticiaF1
            String texto = ""; // Establecer el texto como vacío al crear la noticia

            // Solicitar los demás atributos específicos de NoticiaF1
            ArrayList<String> datosF1 = NoticiaF1.obtenerDatosNoticiaF1();
            String escuderia = datosF1.get(0);

            // Crear la instancia de NoticiaF1 con el texto vacío
            NoticiaF1 nuevaNoticiaF1 = new NoticiaF1(titular, texto, 0, 0, escuderia, redactor);

            // Agregar la nueva noticia a la lista
            noticias.add(nuevaNoticiaF1);
        } else {
            System.out.println("La noticia ya existe en la aplicación");
        }
    }
    public static void introducirNoticiaMotociclismo(ArrayList<Noticia>noticias, Redactor redactor){

        System.out.println("Introduzca el titular de la noticia");
        String titular = sc.nextLine();

        NoticiaMotociclismo noticiaMotociclismo = (NoticiaMotociclismo) buscarNoticiaMotociclismo(titular, noticias); //hacer casteo NoticiaMotociclismo

        if (noticiaMotociclismo == null) {
            // La noticia no existe, entonces puedo crear una nueva noticiaMotociclismo
            String texto = ""; // Establecer el texto como vacío al crear la noticia

            // Solicitar los demás atributos específicos de NoticiaMotociclismo
            ArrayList<String> datosMotociclismo = NoticiaMotociclismo.obtenerDatosNoticiaMotociclismo();
            String equipo = datosMotociclismo.get(0);

            // Crear la instancia de NoticiaMotociclismo con el texto vacío
            NoticiaMotociclismo nuevaNoticiaMotociclismo = new NoticiaMotociclismo(titular, texto, 0, 0, equipo, redactor);

            // Agregar la nueva noticia a la lista
            noticias.add(nuevaNoticiaMotociclismo);
        } else {
            System.out.println("La noticia ya existe en la aplicación");
        }
    }
    public static Noticia buscarNoticia(String titular, ArrayList<Noticia> noticias){

        Noticia noticia = null;
        int i = 0;

        while (noticia == null && i < noticias.size()) {

            if (noticias.get(i) instanceof Noticia && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticia = (Noticia) noticias.get(i);
            }
            i++;
        }
        return noticia;
    }
    public static Noticia buscarNoticiaFutbol(String titular, ArrayList<Noticia> noticias){

        NoticiaFutbol noticiaFutbol = null;
        int i = 0;

        while (noticiaFutbol == null && i < noticias.size()) {

            if (noticias.get(i) instanceof NoticiaFutbol && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticiaFutbol = (NoticiaFutbol) noticias.get(i);
            }
            i++;
        }
        return noticiaFutbol;
    }
    public static Noticia buscarNoticiaBaloncesto(String titular, ArrayList<Noticia> noticias){

        NoticiaBaloncesto noticiaBaloncesto = null;
        int i = 0;

        while (noticiaBaloncesto == null && i < noticias.size()) {

            if (noticias.get(i) instanceof NoticiaBaloncesto && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticiaBaloncesto = (NoticiaBaloncesto) noticias.get(i);
            }
            i++;
        }
        return noticiaBaloncesto;
    }
    public static Noticia buscarNoticiaTenis(String titular, ArrayList<Noticia> noticias){

        NoticiaTenis noticiaTenis = null;
        int i = 0;

        while (noticiaTenis == null && i < noticias.size()) {

            if (noticias.get(i) instanceof NoticiaTenis && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticiaTenis = (NoticiaTenis) noticias.get(i);
            }
            i++;
        }
        return noticiaTenis;
    }
    public static Noticia buscarNoticiaF1(String titular, ArrayList<Noticia> noticias){

        NoticiaF1 noticiaF1 = null;
        int i = 0;

        while (noticiaF1 == null && i < noticias.size()) {

            if (noticias.get(i) instanceof NoticiaF1 && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticiaF1 = (NoticiaF1) noticias.get(i);
            }
            i++;
        }
        return noticiaF1;
    }
    public static Noticia buscarNoticiaMotociclismo(String titular, ArrayList<Noticia> noticias){

        NoticiaMotociclismo noticiaMotociclismo = null;
        int i = 0;

        while (noticiaMotociclismo == null && i < noticias.size()) {

            if (noticias.get(i) instanceof NoticiaMotociclismo && noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticiaMotociclismo = (NoticiaMotociclismo) noticias.get(i);
            }
            i++;
        }
        return noticiaMotociclismo;
    }
    public static void calcularPrecioNoticia(ArrayList<Noticia> noticias, Redactor redactor) {
        // Mostrar opciones para elegir el tipo de noticia
        System.out.println("Indique el tipo de noticia para calcular el precio: " +
                "\n*Futbol - Baloncesto - Tenis - F1 - Motociclismo*\n");

        String opcionNoticia = sc.nextLine();
        switch (opcionNoticia.toUpperCase()) {
            case "FUTBOL":
                // Pedir los detalles específicos (competición, club, jugador)
                ArrayList<String> datosFutbol = NoticiaFutbol.obtenerDatosNoticiaFutbol();
                String titular = " ";

                // Obtener los datos del ArrayList
                String competicion = datosFutbol.get(0);
                String club = datosFutbol.get(1);
                String jugador = datosFutbol.get(2);

                // Crear la instancia de NoticiaFutbol con los valores recopilados
                NoticiaFutbol noticiaFutbol = new NoticiaFutbol(titular, "", 0, 0, competicion, club, jugador, redactor);

                // Calcular y mostrar el precio calculado
                double precioCalculado = noticiaFutbol.calcularPrecioNoticia();
                System.out.println("El precio calculado de la noticia de fútbol es: " + precioCalculado);
                break;
            case "BALONCESTO":
                // Pedir los detalles específicos (competición, club)
                ArrayList<String> datosBaloncesto = NoticiaBaloncesto.obtenerDatosNoticiaBaloncesto();
                titular = " ";
                competicion = datosBaloncesto.get(0);
                club = datosBaloncesto.get(1);

                // Crear la instancia de NoticiaBaloncesto con los valores recopilados
                NoticiaBaloncesto noticiaBaloncesto = new NoticiaBaloncesto(titular, "", 0, 0, competicion, club, redactor);
                // Calcular y mostrar el precio calculado
                precioCalculado = noticiaBaloncesto.calcularPrecioNoticia();
                System.out.println("El precio calculado de la noticia de baloncesto es: " + precioCalculado);
                break;

            case "TENIS":
                // Pedir los detalles específicos (competición, tenistas)
                ArrayList<String> datosTenis = NoticiaTenis.obtenerDatosNoticiaTenis();
                titular = " ";
                competicion = datosTenis.get(0);
                String tenista = datosTenis.get(1);

                // Crear la instancia de NoticiaTenis con los valores recopilados
                NoticiaTenis noticiaTenis = new NoticiaTenis(titular, "", 0, 0, competicion, tenista, redactor);
                // Calcular y mostrar el precio calculado
                precioCalculado = noticiaTenis.calcularPrecioNoticia();
                System.out.println("El precio calculado de la noticia de tenis es: " + precioCalculado);
                break;
            case "F1":
                // Pedir los detalles específicos (escuderías)
                ArrayList<String> datosF1 = NoticiaF1.obtenerDatosNoticiaF1();
                titular = " ";
                String escuderia = datosF1.get(0);

                // Crear la instancia de NoticiaF1 con los valores recopilados
                NoticiaF1 noticiaF1 = new NoticiaF1(titular, "", 0, 0, escuderia, redactor);
                // Calcular y mostrar el precio calculado
                precioCalculado = noticiaF1.calcularPrecioNoticia();
                System.out.println("El precio calculado de la noticia de F1 es: " + precioCalculado);
                break;
            case "MOTOCICLISMO":
                // Pedir los detalles específicos (equipos)
                ArrayList<String> datosMotociclismo = NoticiaMotociclismo.obtenerDatosNoticiaMotociclismo();
                titular = " ";
                String equipo = datosMotociclismo.get(0);

                // Crear la instancia de NoticiaMotociclismo con los valores recopilados
                NoticiaMotociclismo noticiaMotociclismo = new NoticiaMotociclismo(titular, "", 0, 0, equipo, redactor);
                // Calcular y mostrar el precio calculado
                precioCalculado = noticiaMotociclismo.calcularPrecioNoticia();
                System.out.println("El precio calculado de la noticia de Motociclismo es: " + precioCalculado);
                break;
            default:
                System.out.println("Elija una opción válida");
                break;
        }
    }
        public static void calcularPuntuacionNoticia(ArrayList<Noticia>  noticias, Redactor redactor) {
            // Mostrar opciones para elegir el tipo de noticia
            System.out.println("Indique el tipo de noticia para calcular la puntuación: " +
                    "\n*Futbol - Baloncesto - Tenis - F1 - Motociclismo*\n");

            String opcionNoticia = sc.nextLine();
            switch (opcionNoticia.toUpperCase()) {
                case "FUTBOL":
                    // Pedir los detalles específicos (competición, club, jugador)
                    ArrayList<String> datosFutbol = NoticiaFutbol.obtenerDatosNoticiaFutbol();
                    String titular = " ";

                    // Obtener los datos del ArrayList
                    String competicion = datosFutbol.get(0);
                    String club = datosFutbol.get(1);
                    String jugador = datosFutbol.get(2);

                    // Crear la instancia de NoticiaFutbol con los valores recopilados
                    NoticiaFutbol noticiaFutbol = new NoticiaFutbol(titular, "", 0, 0, competicion, club, jugador, redactor);
                    // Calcular y mostrar la puntuación calculada
                    int puntuacionCalculada = noticiaFutbol.calcularPuntuacionNoticia();
                    System.out.println("La puntuación para la noticia de fútbol es: " + puntuacionCalculada);
                    break;
                case "BALONCESTO":
                    // Pedir los detalles específicos (competicion, club)
                    ArrayList<String> datosBaloncesto = NoticiaBaloncesto.obtenerDatosNoticiaBaloncesto();
                    titular = " ";
                    competicion = datosBaloncesto.get(0);
                    club = datosBaloncesto.get(1);

                    // Crear la instancia de NoticiaBaloncesto con los valores recopilados
                    NoticiaBaloncesto noticiaBaloncesto = new NoticiaBaloncesto(titular, "", 0, 0, competicion, club, redactor);
                    // Calcular y mostrar la puntuación calculada
                    puntuacionCalculada = noticiaBaloncesto.calcularPuntuacionNoticia();
                    System.out.println("La puntuación para la noticia de baloncesto es: " + puntuacionCalculada);
                    break;

                case "TENIS":
                    // Pedir los detalles específicos (competición, tenistas)
                    ArrayList<String> datosTenis = NoticiaTenis.obtenerDatosNoticiaTenis();
                    titular = " ";
                    competicion = datosTenis.get(0);
                    String tenista = datosTenis.get(1);

                    // Crear la instancia de NoticiaTenis con los valores recopilados
                    NoticiaTenis noticiaTenis = new NoticiaTenis(titular, "", 0, 0, competicion, tenista, redactor);
                    // Calcular y mostrar la puntuación calculada
                    puntuacionCalculada = noticiaTenis.calcularPuntuacionNoticia();
                    System.out.println("La puntuación para la noticia de tenis es: " + puntuacionCalculada);
                    break;
                case "F1":
                    // Pedir los detalles específicos (escuderías)
                    ArrayList<String> datosF1 = NoticiaF1.obtenerDatosNoticiaF1();
                    titular = " ";
                    String escuderia = datosF1.get(0);

                    // Crear la instancia de NoticiaF1 con los valores recopilados
                    NoticiaF1 noticiaF1 = new NoticiaF1(titular, "", 0, 0, escuderia, redactor);
                    // Calcular y mostrar la puntuación calculada
                    puntuacionCalculada = noticiaF1.calcularPuntuacionNoticia();
                    System.out.println("La puntuación para la noticia de F1 es: " + puntuacionCalculada);
                    break;
                case "MOTOCICLISMO":
                    // Pedir los detalles específicos (equipos)
                    ArrayList<String> datosMotociclismo = NoticiaMotociclismo.obtenerDatosNoticiaMotociclismo();
                    titular = " ";
                    String equipo = datosMotociclismo.get(0);

                    // Crear la instancia de NoticiaMotociclismo con los valores recopilados
                    NoticiaMotociclismo noticiaMotociclismo = new NoticiaMotociclismo(titular, "", 0, 0, equipo, redactor);
                    // Calcular y mostrar la puntuación calculada
                    puntuacionCalculada = noticiaMotociclismo.calcularPuntuacionNoticia();
                    System.out.println("La puntuación la noticia de Motociclismo es: " + puntuacionCalculada);
                    break;
                default:
                    System.out.println("Elija una opción válida");
                    break;
            }
        }

    public static void eliminarNoticia(ArrayList<Noticia> noticias){
        System.out.println("Introduzca el titular de la noticia que quiere eliminar");
        String titular = sc.nextLine();

        Noticia noticia = buscarNoticia(titular, noticias);

        if (noticia != null) {
            noticias.remove(noticia);
            System.out.println("La noticia con el titular  " + titular + " se ha eliminado correctamente");
        } else {
            System.out.println("La noticia con el titular " + titular + " no está en la aplicación");
        }

    }

    public static void mostrarNoticia(ArrayList<Noticia> noticias) {
        System.out.println("Introduzca el titular de la noticia que desea ver");
        String titular = sc.nextLine();

        Noticia noticia = buscarNoticia(titular, noticias);

        if (noticia != null) {

            // Imprimir los detalles de la noticia
            System.out.println("Aquí tiene su noticia:");
            System.out.println("Titular: " + noticia.getTitular());
            System.out.println("Texto: " + noticia.getTexto());
            System.out.println("Puntuación: " + noticia.getPuntuacion());
            System.out.println("Precio: " + noticia.getPrecio());

            // Imprimir otros atributos de la noticia según su tipo
            if (noticia instanceof NoticiaFutbol) {
                NoticiaFutbol noticiaFutbol = (NoticiaFutbol) noticia;
                System.out.println("Competición: " + noticiaFutbol.getCompeticion());
                System.out.println("Club: " + noticiaFutbol.getClub());
                System.out.println("Jugador: " + noticiaFutbol.getJugador());
            } else if (noticia instanceof NoticiaBaloncesto) {
                NoticiaBaloncesto noticiaBaloncesto = (NoticiaBaloncesto) noticia;
                System.out.println("competición: " + noticiaBaloncesto.getCompeticion());
                System.out.println("Club: " + noticiaBaloncesto.getClub());
            } else if (noticia instanceof NoticiaTenis) {
                NoticiaTenis noticiaTenis = (NoticiaTenis) noticia;
                System.out.println("Competición: " + noticiaTenis.getCompeticion());
                System.out.println("Tenista: " + noticiaTenis.getTenista());
            } else if (noticia instanceof NoticiaF1) {
                NoticiaF1 noticiaF1 = (NoticiaF1) noticia;
                System.out.println("Competición: " + noticiaF1.getEscuderia());
            } else if (noticia instanceof NoticiaMotociclismo) {
                NoticiaMotociclismo noticiaMotociclismo = (NoticiaMotociclismo) noticia;
                System.out.println("Competición: " + noticiaMotociclismo.getEquipo());
            }

                // Limpiar el búfer del scanner
                sc.nextLine();

            } else {
                System.out.println("La noticia que usted quiere ver no se encuentra en la aplicación");
            }
    }
    public static void mostrarNoticiasPorRedactor(ArrayList<Noticia> noticias, ArrayList<Redactor> redactores) {
        System.out.println("Introduzca el nombre del redactor cuyas noticias desea ver");
        String nombreRedactor = sc.nextLine();

        // Buscar el redactor en la lista de redactores
        Redactor redactor = buscarRedactor(nombreRedactor, redactores);

        if (redactor != null) {
            System.out.println("Noticias escritas por " + nombreRedactor + ":");

            // Iterar a través de las noticias y mostrar las que corresponden al redactor
            for (Noticia noticia : noticias) {
                if (noticia.getRedactor().equals(redactor)) {
                    System.out.println("Titular: " + noticia.getTitular());
                    System.out.println("Tipo: " + noticia.getClass().getSimpleName()); // Obtener el nombre de la clase
                    System.out.println();
                }
            }
        } else {
            System.out.println("El redactor " + nombreRedactor + " no existe en la aplicación");
        }
    }
}

