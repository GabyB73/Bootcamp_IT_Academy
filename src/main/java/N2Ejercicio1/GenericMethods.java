package N2Ejercicio1;

public class GenericMethods<T> {
    private T t;
    private T u;
    private Object k; // Cambia uno de los argumentos a tipo Object

    public GenericMethods(T t, T u, Object k) {
        this.t = t;
        this.u = u;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getU() {
        return u;
    }

    public void setU(T u) {
        this.u = u;
    }

    public Object getK() {
        return k;
    }

    public void setK(Object k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "t=" + t +
                ", u=" + u +
                ", k=" + k +
                '}';
    }
}
