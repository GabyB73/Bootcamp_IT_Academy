package N2Ejercicio1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Se aplica a clases
@Retention(RetentionPolicy.RUNTIME) // Se conserva en tiempo de ejecución
public @interface SerializarJson {
    String directorio(); // Elemento para especificar el directorio
}
