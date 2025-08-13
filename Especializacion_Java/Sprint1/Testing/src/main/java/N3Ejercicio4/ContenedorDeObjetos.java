package N3Ejercicio4;
import java.util.ArrayList;
public class ContenedorDeObjetos {
    ArrayList<Object> listaDeObjetos = new ArrayList<>();
    public ContenedorDeObjetos(ArrayList<Object> listaDeObjetos) {

        this.listaDeObjetos = listaDeObjetos;
    }
    //Método constructor
    public ContenedorDeObjetos() {

    }
    public ArrayList<Object> getListaDeObjetos() {

        return listaDeObjetos;
    }
    public void setListaDeObjetos(ArrayList<Object> listaDeObjetos) {

        this.listaDeObjetos = listaDeObjetos;
    }
    public void contenedorDeObjetos() {
        // Llenar el ArrayList en el constructor con los distintos elementos
        listaDeObjetos.add("manzana");
        listaDeObjetos.add(42);
        listaDeObjetos.add("gato");
        listaDeObjetos.add(100);
        listaDeObjetos.add("perro");

        for (Object objeto : listaDeObjetos) {
            System.out.println(objeto);
        }
    }


}
