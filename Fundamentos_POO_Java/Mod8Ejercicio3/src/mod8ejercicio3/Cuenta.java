package mod8ejercicio3;

public class Cuenta {

	private int numCuenta;
	private int saldo;

	public Cuenta(int numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int ingresar(int cantidad) {
		int saldo = 0;
		saldo = saldo + cantidad;
		return saldo;
	}

	public int retirar(int cantidad) {
		int saldo = 0;
		if (saldo >= cantidad) {
			saldo = saldo - cantidad;
		}
		return saldo;

	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
}
