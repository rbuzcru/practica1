package Ejercicio6_1;

public class Animal implements Comparable<Animal> {
	private String nombre;
	private String especie;
	
	public Animal(String nombre, String especie) {
		this.nombre=nombre;
		this.especie=especie;
	}
	public void setNombre(String Nombre) {
		this.nombre=Nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setEspecie(String Especie) {
		this.especie=Especie;
	}
	public String getEspecie() {
		return this.especie;
	}
	public String toString() {
		String cadena="";
		cadena=cadena.concat("El nombre del animal es "+this.nombre+"\n La especie del animal es "+this.especie);
		return cadena;
	}
	@Override
	public int compareTo(Animal animal) {
		return this.nombre.compareTo(animal.getNombre());
	}
	
}
