package N1Ejercicio2;
import java.util.ArrayList;
import java.util.ListIterator;

public class NumerosEnteros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosInversos = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ListIterator<Integer> listIterator = numeros.listIterator();

        // Avanza el iterador hasta la última posición
        while (listIterator.hasNext()) {
            listIterator.next();
        }

        // Agrega elementos en orden inverso a numerosInversos
        while (listIterator.hasPrevious()) {
            int numero = listIterator.previous(); //Variable auxiliar para guardar los valores durante el recorrido
            numerosInversos.add(numero);
        }

        System.out.println("Imprimo la lista en orden inverso");

        // Imprime numerosInversos para verificar el orden
        for (int numero : numerosInversos) {
            System.out.println(numero);
        }
    }
}