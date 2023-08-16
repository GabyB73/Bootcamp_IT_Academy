package N3Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class NoticiaMotociclismo extends Noticia {
    private String equipo;
    private ArrayList<Noticia> noticias;

    public NoticiaMotociclismo(String titular, String texto, int puntuacion, float precio, String equipo, Redactor redactor) {
        super(titular, texto, puntuacion, precio, redactor);
        this.equipo     = equipo;
        this.noticias   = new ArrayList<>(); // Inicializar la lista de noticias
    }
    public String getEquipo() {

        return equipo;
    }
    public void setEquipo(String equipo) {

        this.equipo = equipo;
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

        double precio = 100; // Precio inicial para noticias de F1

        // Realizar la pregunta al usuario sobre los equipos

        String opcionEquipo;
        do {
            System.out.println("¿Es sobre Honda o Yamaha? (HONDA/YAMAHA/N)");
            opcionEquipo = sc.nextLine();
            if (!opcionEquipo.equalsIgnoreCase("HONDA") && !opcionEquipo.equalsIgnoreCase("YAMAHA")
                    &&!opcionEquipo.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija HONDA, YAMAHA, o N.");
            }
        } while (!opcionEquipo.equalsIgnoreCase("HONDA") && !opcionEquipo.equalsIgnoreCase("YAMAHA")
                && !opcionEquipo.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario

        if (opcionEquipo.equalsIgnoreCase("HONDA") || opcionEquipo.equalsIgnoreCase("YAMAHA")) {
            precio += 50;

        }
            return precio;
        }
        @Override
        public int calcularPuntuacionNoticia () {

        Scanner sc = new Scanner(System.in);

        int puntuacion = 3; // Puntuación inicial para noticias de F1

        // Realizar la pregunta al usuario sobre los equipos

        String opcionEquipo;
            do {
                System.out.println("¿Es sobre Honda o Yamaha? (HONDA/YAMAHA/N)");
                opcionEquipo = sc.nextLine();
                if (!opcionEquipo.equalsIgnoreCase("HONDA") && !opcionEquipo.equalsIgnoreCase("YAMAHA")
                        &&!opcionEquipo.equalsIgnoreCase("N")) {
                    System.out.println("Opción inválida. Por favor, elija HONDA, YAMAHA, o N.");
                }
            } while (!opcionEquipo.equalsIgnoreCase("HONDA") && !opcionEquipo.equalsIgnoreCase("YAMAHA")
                    && !opcionEquipo.equalsIgnoreCase("N"));

            // Realizar los cálculos basados en las respuestas del usuario

            if (opcionEquipo.equalsIgnoreCase("HONDA") || opcionEquipo.equalsIgnoreCase("YAMAHA")) {
            puntuacion += 3;

            }
            return puntuacion;
        }
    }
