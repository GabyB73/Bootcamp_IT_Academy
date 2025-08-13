package N1Ejercicio2;

public class CalculoDni {

    public static String calculoDni(int numeroDni) {
        // Verifica si el número de DNI es válido
        if (numeroDni < 0 || numeroDni > 99999999) {
            throw new IllegalArgumentException("El número de DNI no es válido");
        }

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calcula la letra del DNI
        char letraCalculada = letras[numeroDni % 23];

        // Devuelve el número de DNI completo junto con la letra calculada como String
        return String.format("%d%c", numeroDni, letraCalculada);
    }
}
