package N1Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Producto> zapatos = new ArrayList<>();
        zapatos.add(new Producto("Zapato Mujer", 50.0f));
        zapatos.add(new Producto("Zapato Hombre", 60.0f));
        zapatos.add(new Producto("Zapato Niño", 30.0f));

        Venta venta = new Venta(zapatos, 0.0f);

        try {
            System.out.println("Elija el producto que quiere comprar: (elija el código)");
            int codigo = sc.nextInt();

            Producto productoSeleccionado = zapatos.get(codigo - 1);
            System.out.println(productoSeleccionado);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El producto no existe");
        } finally {
            sc.close();
        }
        System.out.println("**************************************************************");

        try{
            venta.calcularTotal();  // Esto debería lanzar VentaVaciaException si la lista de productos está vacía
            System.out.println(venta.getProductos());
            System.out.println("Precio total de la venta: " + venta.getPrecioTotalVentas());
        }catch (VentaVaciaException e){
            System.out.println(e.getMessage());
        }
    }
}