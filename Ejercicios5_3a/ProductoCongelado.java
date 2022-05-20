package Ejercicios5_3a;

public abstract class ProductoCongelado extends Producto{
	
	protected int tempRec;

	public ProductoCongelado(String fechaCad, int numLote,int tempRec) {
		super(fechaCad, numLote);
		this.tempRec=tempRec;
	}
	public void setTempRec(int tempRec) {
		this.tempRec=tempRec;
	}
	public int getTempRed() {
		return this.tempRec;
	}
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nLa temperatura recomendada de congelacion es "+this.tempRec);
		return cadena;
	}

}
