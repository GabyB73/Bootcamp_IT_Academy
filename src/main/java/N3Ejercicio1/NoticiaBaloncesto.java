package N3Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class NoticiaBaloncesto extends Noticia{
    private String competicion;
    private String club;
    private ArrayList<Noticia> noticias;

    public NoticiaBaloncesto(String titular, String texto, int puntuacion, float precio, String competicion,
                             String club, Redactor redactor) {
        super(titular, texto, puntuacion, precio, redactor);
        this.competicion    = competicion;
        this.club           = club;
        this.noticias       = new ArrayList<>(); // Inicializar la lista de noticias
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
    public void agregarNoticia(Noticia noticia) {

        noticias.add(noticia);
    }
    public ArrayList<Noticia> getNoticias() {

        return noticias;
    }
    @Override
    public double calcularPrecioNoticia() {

        Scanner sc = new Scanner(System.in);

        double precio = 250; // Precio inicial para noticias de baloncesto

        // Realizar la pregunta al usuario sobre la Euroliga
        String opcionEuroliga;
        do {
            System.out.println("¿Es sobre la Euroliga? (S/N)");
            opcionEuroliga = sc.nextLine();
            if (!opcionEuroliga.equalsIgnoreCase("S") && !opcionEuroliga.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionEuroliga.equalsIgnoreCase("S") && !opcionEuroliga.equalsIgnoreCase("N"));

        String opcionClub;
        do {
            System.out.println("¿Es sobre el Barça o el Madrid? (BARÇA/MADRID/N)");
            opcionClub = sc.nextLine();
            if (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija BARÇA, MADRID o N.");
            }
        } while (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario
        if (opcionEuroliga.equalsIgnoreCase("S")) {
            precio += 75;
        }
        if (opcionClub.equalsIgnoreCase("BARÇA") || opcionClub.equalsIgnoreCase("MADRID")) {
            precio += 75;
        }
        return precio;
    }
    @Override
    public int calcularPuntuacionNoticia() {
        Scanner sc = new Scanner(System.in);

        int puntuacion = 4; // Puntuación inicial para noticias de baloncesto

        // Realizar la pregunta al usuario sobre la Euroliga
        String opcionEuroliga;
        do {
            System.out.println("¿Es sobre la Euroliga? (S/N)");
            opcionEuroliga = sc.nextLine();
            if (!opcionEuroliga.equalsIgnoreCase("S") && !opcionEuroliga.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionEuroliga.equalsIgnoreCase("S") && !opcionEuroliga.equalsIgnoreCase("N"));

        String opcionAbc;
        do {
            System.out.println("¿Es sobre la ABC? (S/N)");
            opcionAbc = sc.nextLine();
            if (!opcionAbc.equalsIgnoreCase("S") && !opcionAbc.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija S o N.");
            }
        } while (!opcionAbc.equalsIgnoreCase("S") && !opcionAbc.equalsIgnoreCase("N"));

        String opcionClub;
        do {
            System.out.println("¿Es sobre el Barça o el Madrid? (BARÇA/MADRID/N)");
            opcionClub = sc.nextLine();
            if (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija BARÇA, MADRID o N.");
            }
        } while (!opcionClub.equalsIgnoreCase("BARÇA") && !opcionClub.equalsIgnoreCase("MADRID") && !opcionClub.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario
        if (opcionEuroliga.equalsIgnoreCase("S")) {
            puntuacion += 3;
        }
        if (opcionAbc.equalsIgnoreCase("S")) {
            puntuacion += 2;
        }
        if (opcionClub.equalsIgnoreCase("BARÇA") || opcionClub.equalsIgnoreCase("MADRID")) {
            puntuacion += 1;
        }
       return puntuacion;
    }
}
