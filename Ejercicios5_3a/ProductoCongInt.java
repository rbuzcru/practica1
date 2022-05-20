package Ejercicios5_3a;

public class ProductoCongInt extends ProductoCongelado{
	
	private String CodigoInt;
	
	public ProductoCongInt(String fecha_cad, int num_lote, int Temp_Rec, String Codigo_Int) {
		super(fecha_cad, num_lote, Temp_Rec);
		this.CodigoInt=Codigo_Int;
	}
	public void setCodigo_Int(String Codigo_Int) {
		this.CodigoInt=Codigo_Int;
	}
	public String getCodigo_Int() {
		return this.CodigoInt;
	}
	
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nEl codigo internacion es "+this.CodigoInt);
		return cadena;
	}
}
