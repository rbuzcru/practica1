package Ejercicios5_3a;

public class ProductoCongNacionales extends ProductoCongelado{
	
	private String codigoNacional;
	
	public ProductoCongNacionales(String fechaCad, int numLote, int tempRec,String codigoNacional) {
		super(fechaCad, numLote, tempRec);
		this.codigoNacional=codigoNacional;	
	}
	public void setCodigoNacional(String codigoNacional) {
		this.codigoNacional=codigoNacional;
	}
	public String getCodigoNacional() {
		return this.codigoNacional;
	}
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nEl codigo nacional es "+this.codigoNacional);
		return cadena;
	}

}
