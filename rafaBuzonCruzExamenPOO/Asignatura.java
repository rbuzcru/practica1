package rafaBuzonCruzExamenPOO;

public class Asignatura {
	private int codigo;
	private String nombre;
	
	public Asignatura(int codigo,String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat("El codigo es "+this.codigo+"\nEl nombre es "+this.nombre);
		return cadena;
	}
}
