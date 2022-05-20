package rafaBuzonCruzExamenPOO;

public abstract class Personal extends Miembro {
	protected float salario;
	protected static int salarioMinimo = 10000;
	
	public Personal(String DNI, String nombre,int salario) {
		super(DNI, nombre);
		if (salario>salarioMinimo ) {
			this.salario=salario;
			} 
		else { this.salario=salarioMinimo; } 
	}
	public Personal(String DNI, String nombre) {
		super(DNI, nombre);
		this.salario=salarioMinimo;
	}
	public String saludar() {
		return "Buenos dias";
	}
	public void setSalario(float salario) {
		this.salario=salario;
	}
	public float getSalario() {
		return this.salario;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena= cadena.concat(super.toString()+"\nEl salario es "+this.salario);
		return cadena;
	}

}
