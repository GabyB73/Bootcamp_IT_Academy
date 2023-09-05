package N1Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {

        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril= new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        ArrayList<Month> meses = new ArrayList<>();

        meses.add(enero);
        meses.add(febrero);
        meses.add(marzo);
        meses.add(abril);
        meses.add(mayo);
        meses.add(junio);
        meses.add(julio);
        meses.add(septiembre);
        meses.add(octubre);
        meses.add(noviembre);
        meses.add(diciembre);

        Month agosto = new Month("Agosto");

        meses.add(7,agosto);

        System.out.println("***Imprimir ArrayList con Agosto en su posición correcta***");

        for (Month month : meses) {
            System.out.println(month); // Imprime cada mes para verificar que "Agosto" se ha insertado en la posición correcta
        }
        //Convertir el ArrayList en un HashSet
        HashSet<Month> meses1 = new HashSet<>();

        meses1.add(enero);
        meses1.add(febrero);
        meses1.add(marzo);
        meses1.add(abril);
        meses1.add(mayo);
        meses1.add(junio);
        meses1.add(julio);
        meses1.add(agosto);
        meses1.add(septiembre);
        meses1.add(octubre);
        meses1.add(noviembre);
        meses1.add(diciembre);
        meses1.add(diciembre); //elemento repetido

        System.out.println("***Imprimir HashSet con bucle for-each y verificar que no hay elementos repetidos***");

        for(Month month : meses1) {
            System.out.println(month);
        }

        System.out.println("***Imprimir HashSet con Iterador y verificar que no hay elementos repetidos***");

        //Iterador para el HashSet
        Iterator<Month> iterator = meses1.iterator();
        //Usar el iterator para recorrer la colección
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }
    }
}
