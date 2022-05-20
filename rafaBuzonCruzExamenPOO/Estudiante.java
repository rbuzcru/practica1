package rafaBuzonCruzExamenPOO;

import java.util.ArrayList;

public class Estudiante extends Miembro {
	protected ArrayList<Asignatura> asignaturas=new ArrayList<Asignatura>();
	private static final int MAXIMOASIGNATURAS=3;
	public Estudiante(String DNI, String nombre) {
		super(DNI, nombre);
	}
	public void addAsignatura(Asignatura a1) {
		if (asignaturas.size()<MAXIMOASIGNATURAS) {
		asignaturas.add(a1);
		}
		else {
			System.out.println("El numero máximo ya se ha alcanzado");
		}
	}
	public int getNumAsignatura() {
		return asignaturas.size();
	}
	public Asignatura getAsignatura (int indice){
		return asignaturas.get(indice);
	}
	public void setAsignatura (Asignatura a1,int indice){
		asignaturas.set(indice,a1);
	}
	public String saludar() {
		return "Hola";
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nY las asignaturas que tiene son "+this.asignaturas);
		return cadena;
	}

}
