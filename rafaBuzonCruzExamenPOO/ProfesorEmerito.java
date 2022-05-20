package rafaBuzonCruzExamenPOO;

public class ProfesorEmerito extends Profesor implements Conferenciante{
	public static int numCharlaTotal=0;
	private int numeroCharlas;
	
	public ProfesorEmerito(String DNI, String nombre, int salario) {
		super(DNI, nombre, salario);
	}
	
	public String darCharla() {
		String cadena="";
		cadena=cadena.concat("Voy a dar una charla sobre"+"y"/*nombre asignatura[1]*/);
		numeroCharlas++;
		numCharlaTotal++;
		return cadena;
	}
	public int getNumeroCharlas() {
		return this.numeroCharlas;
	}
	public int getNumCharlaTotal() {
		return ProfesorEmerito.numCharlaTotal;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena=cadena.concat(super.toString()+"\nEl profesor lleva "+this.numeroCharlas+" charlas");
		return cadena;
	}
}
