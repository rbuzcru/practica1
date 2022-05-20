package ejemplos;

public class Animal {
	public String especie;
	public int codigo;
	public Animal (String especie, int codigo) {
		this.especie=especie;
		this.codigo=codigo;
	}
	public String getEspecie() {
		return this.especie;
	}
	
	@Override
	public boolean equals (Object o) {
		boolean caso1= this.especie.equals(((Animal)o).especie);
		boolean caso2= this.codigo==(((Animal)o).codigo);
		return this.especie.equals(((Animal)o).especie)&&this.codigo==(((Animal)o).codigo);
	}
}
