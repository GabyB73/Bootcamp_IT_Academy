package N1Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsGenerator {
    public static void elegirProducto(ArrayList<String> productos, Scanner sc) {
        productos.add("sofá");
        productos.add("mesa");
        productos.add("silla");

        try {
            System.out.println("Elija el código del producto:\n1-sofá\n2-mesa\n3-silla");
            int codigo = sc.nextInt();

            String productoSeleccionado = productos.get(codigo - 1);
            System.out.println(productoSeleccionado);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El producto no existe en la lista.");
        }
    }
}
