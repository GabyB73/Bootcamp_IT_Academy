package n1ejercicio1;

public class InstrumentoViento extends Instrumento {

	private String nombre;
	private float precio;

	public InstrumentoViento(String nombre, float precio) {
		super(nombre, precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String tocar() {
		String mensaje = "Está sonando un instrumento de viento";
		return mensaje;
	}

}
