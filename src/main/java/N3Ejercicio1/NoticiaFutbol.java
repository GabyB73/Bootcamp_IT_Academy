package N3Ejercicio1;
import java.util.ArrayList;
import N3Ejercicio1.Redactor;
import java.util.Scanner;
public class NoticiaFutbol extends Noticia {
    private String competicion;
    private String club;
    private String jugador;
    private ArrayList<Noticia> noticias; // Declarar el ArrayList aquí

    public NoticiaFutbol(String titular, String texto, int puntuacion, double precio, String competicion, String club,
                         String jugador, Redactor redactor) {
        super(titular, texto, puntuacion, precio, redactor);
        this.competicion    = competicion;
        this.club           = club;
        this.jugador        = jugador;
        this.noticias       = new ArrayList<>(); // Inicializar el ArrayList
    }
    public String getCompeticion() {

        return competicion;
    }
    public void setCompeticion(String competicion) {

        this.competicion = competicion;
    }
    public String getClub() {

        return club;
    }
    public void setClub(String club) {

        this.club = club;
    }
    public String getJugador() {

        return jugador;
    }
    public void setJugador(String jugador) {

        this.jugador = jugador;
    }
    public void agregarNoticia(Noticia noticia) {

        noticias.add(noticia);
    }
    public ArrayList<Noticia> getNoticias() {

        return noticias;
    }
    @Override
    public double calcularPrecioNoticia() {

        Scanner sc = new Scanner(System.in);

        double precio = 300; // Precio inicial para noticias de fútbol

        // Realizar la pregunta al usuario sobre la Liga de Campeones
        String opcionLiga;
        do {
            System.out.println("¿Es sobre la Liga de Campeones? (S/N)");
            opcionLiga = sc.nextLine();
            if (!opcionLiga.equalsIgnoreCase("S") && !opcionLiga.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionLiga.equalsIgnoreCase("S") && !opcionLiga.equalsIgnoreCase("N"));

        String opcionClub;
        do {
            System.out.println("¿Es sobre el Barça o el Madrid? (BARÇA/MADRID/N)");
            opcionClub = sc.nextLine();
            if (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija BARÇA, MADRID o N.");
            }
        } while (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N"));

        String opcionJugador;
        do {
            System.out.println("¿Es sobre Ferran Torres o Benzema? (FERRAN/BENZEMA/N)");
            opcionJugador = sc.nextLine();
            if (!opcionJugador.equalsIgnoreCase("FERRAN") && !opcionJugador.equalsIgnoreCase("BENZEMA") && !opcionJugador.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FERRAN, BENZEMA o N.");
            }
        } while (!opcionJugador.equalsIgnoreCase("FERRAN") && !opcionJugador.equalsIgnoreCase("BENZEMA") && !opcionJugador.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario
        if (opcionLiga.equalsIgnoreCase("S")) {
            precio += 100;
        }
        if (opcionClub.equalsIgnoreCase("BARÇA") || opcionClub.equalsIgnoreCase("MADRID")) {
            precio += 100;
        }
        if (opcionJugador.equalsIgnoreCase("FERRAN") || opcionJugador.equalsIgnoreCase("BENZEMA")) {
            precio += 50;
        }
        return precio;
    }
    @Override
    public int calcularPuntuacionNoticia() {

        Scanner sc = new Scanner(System.in);

        int puntuacion = 5; // Puntuación inicial para noticias de fútbol

        // Realizar la pregunta al usuario sobre la Liga de Campeones
        String opcionLigaDeCampeones;
        do {
            System.out.println("¿Es sobre la Liga de Campeones? (S/N)");
            opcionLigaDeCampeones = sc.nextLine();
            if (!opcionLigaDeCampeones.equalsIgnoreCase("S") && !opcionLigaDeCampeones.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionLigaDeCampeones.equalsIgnoreCase("S") && !opcionLigaDeCampeones.equalsIgnoreCase("N"));

        String opcionLiga;
        do {
            System.out.println("¿Es sobre la Liga? (S/N)");
            opcionLiga = sc.nextLine();
            if (!opcionLiga.equalsIgnoreCase("S") && !opcionLiga.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionLiga.equalsIgnoreCase("S") && !opcionLiga.equalsIgnoreCase("N"));

        String opcionClub;
        do {
            System.out.println("¿Es sobre el Barça o el Madrid? (BARÇA/MADRID/N)");
            opcionClub = sc.nextLine();
            if (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija BARÇA, MADRID o N.");
            }
        } while (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N"));

        String opcionJugador;
        do {
            System.out.println("¿Es sobre Ferran Torres o Benzema? (FERRAN/BENZEMA/N)");
            opcionJugador = sc.nextLine();
            if (!opcionJugador.equalsIgnoreCase("FERRAN") && !opcionJugador.equalsIgnoreCase("BENZEMA") && !opcionJugador.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FERRAN, BENZEMA o N.");
            }
        } while (!opcionJugador.equalsIgnoreCase("FERRAN") && !opcionJugador.equalsIgnoreCase("BENZEMA") && !opcionJugador.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario
        if (opcionLigaDeCampeones.equalsIgnoreCase("S")) {
            puntuacion += 3;
        }
        if (opcionLiga.equalsIgnoreCase("S")) {
            puntuacion += 2;
        }
        if (opcionClub.equalsIgnoreCase("BARÇA") || opcionClub.equalsIgnoreCase("MADRID")) {
            puntuacion += 1;
        }
        if (opcionJugador.equalsIgnoreCase("FERRAN") || opcionJugador.equalsIgnoreCase("BENZEMA")) {
            puntuacion += 1;
        }
        return puntuacion;
    }
}
