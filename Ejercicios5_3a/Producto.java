package Ejercicios5_3a;

public abstract class Producto {
	protected String fechaCad;
	protected int numLote;
	
	//constructor
	public Producto (String fechaCad,int numLote) {
		this.fechaCad=fechaCad;
		this.numLote=numLote;
	}
	public void setFechacad (String fechaCad) {
		this.fechaCad=fechaCad;
	}
	public String getFechacad() {
		return this.fechaCad;
	}
	public void setNumlote(int numLote) {
		this.numLote=numLote;
	}
	public int getNumlote() {
		return this.numLote;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat("La fecha de caducidad es "+this.fechaCad+". \nEl numero de lote es "+this.numLote);
		return cadena;
	}
	
}
