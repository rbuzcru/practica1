package Ejercicios5_3a;

public class ProductoFresco extends Producto {
	
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco(String fechaCad, int numLote,String fechaEnvasado, String paisOrigen) {
		super(fechaCad,numLote);
		this.fechaEnvasado=fechaEnvasado;
		this.paisOrigen=paisOrigen;
	}
	public void setFechaenvasado (String fechaEnvasado) {
		this.fechaEnvasado=fechaEnvasado;
	}
	public String getFechaenvasado() {
		return this.fechaEnvasado;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen=paisOrigen;
	}
	public String getPaisOrigen() {
		return this.paisOrigen;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+". \nLa fecha de envasado es "+this.fechaEnvasado+". \nY el pais de origen es "+this.paisOrigen);
		return cadena;
	}
}
