package rafaBuzonCruzExamenPOO;

public abstract class Miembro {
	protected String DNI;
	protected String nombre;
	
	public Miembro(String DNI, String nombre) {
		this.DNI=DNI;
		this.nombre=nombre;
	}
	public String getDNI() {
		return this.DNI;
	}
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String Nombre) {
		this.nombre=Nombre;
	}
	public abstract String saludar();
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat("El nombre es "+this.nombre+"\nEl DNI es "+this.DNI);
		return cadena;
	}
	
}
