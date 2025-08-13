package s102n1ejercicio1;

import java.util.ArrayList;

public class Venta {
	
	private ArrayList<Producto> productos;
	private float precioTotalVentas;
	
	public Venta(ArrayList<Producto> productos, float precioTotalVentas) {
		this.productos = productos;
		this.precioTotalVentas = precioTotalVentas;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public float getPrecioTotalVentas() {
		return precioTotalVentas;
	}
	public void setPrecioTotalVentas(float precioTotalVentas) {
		this.precioTotalVentas = precioTotalVentas;
	}
	
	public void calcularTotal() throws VentaVaciaException {
		
	}
	
	

}
