package N3Ejercicio1;
@SerializarJson(directorio = "C:\\Users\\geb_b\\Documents\\IntelliJ-WorkSpace\\S1Tasca7\\persona.json")
public class Persona {

        private String nombre;
        private int edad;
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
}
