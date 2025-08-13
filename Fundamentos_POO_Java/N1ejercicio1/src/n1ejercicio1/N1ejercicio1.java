package n1ejercicio1;

public class N1ejercicio1 {

	public static void main(String[] args) {

		InstrumentoViento instrumentoViento = new InstrumentoViento("trompeta", 159.89f);

		InstrumentoCuerda instrumentoCuerda = new InstrumentoCuerda("guitarra", 89.99f);

		InstrumentoPercusion instrumentoPercusion = new InstrumentoPercusion("bateria", 899.50f);

		System.out.println(instrumentoViento.tocar());

		System.out.println(instrumentoCuerda.tocar());

		System.out.println(instrumentoPercusion.tocar());

	}
}
