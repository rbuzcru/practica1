package rafaBuzonCruzExamenPOO;

public class Pas extends Personal{
	
	private String especialidad;
	
	public Pas(String DNI, String nombre, int salario,String especialidad) {
		super(DNI, nombre, salario);
		if (especialidad.equals("Contratos")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Nominas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Gestion de aulas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Cursos extraordinaros")) {
			this.especialidad=especialidad;
		}	
	}
	public Pas(String DNI, String nombre,String especialidad) {
		super(DNI, nombre);
		if (especialidad.equals("Contratos")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Nominas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Gestion de aulas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Cursos extraordinaros")) {
			this.especialidad=especialidad;
		}
		this.salario=salarioMinimo;
	}
	public void setEspecialidad(String especialidad) {
		if (especialidad.equals("Contratos")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Nominas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Gestion de aulas")) {
			this.especialidad=especialidad;
		}
		if (especialidad.equals("Cursos extraordinaros")) {
			this.especialidad=especialidad;
	}
	}
	public String getEspecialidad () {
		return this.especialidad;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nY su especialidad es "+this.especialidad );
		return cadena;
	}
}

