package rafaBuzonCruzExamenPOO;
import java.util.ArrayList;
public class Profesor extends Personal {
	protected ArrayList<Asignatura> asignaturas=new ArrayList<Asignatura>();
	private static final int MAXIMOASIGNATURAS=2;
	public Profesor(String DNI, String nombre, int salario) {
		super(DNI, nombre, salario);	
	}
	public Profesor(String DNI, String nombre) {
		super(DNI, nombre);
		this.salario=salarioMinimo;
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
	public void getAsignatura (Asignatura a1,int indice){
		asignaturas.set(indice,a1);
	}
	
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nY las asignaturas que tiene son "+this.asignaturas);
		return cadena;
	}
}
