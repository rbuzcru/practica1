package Ejercicios5_3a;

public class ProductoRefrigerado extends Producto {
	
	private int codigoOSA;

	public ProductoRefrigerado(String fechaCad, int numLote,int codigoOSA) {
		super(fechaCad, numLote);
		this.codigoOSA=codigoOSA;
	}
	public void setCodigoOSA(int codigoOSA) {
		this.codigoOSA=codigoOSA;
	}
	public int getCodigoOSA() {
		return this.codigoOSA;
	}
	public String toString() {
		String cadena="";
		cadena= cadena.concat(super.toString()+"\nEl codigo de OSA es "+this.codigoOSA);
		return cadena;
	}
}
