package Ejercicios5_4;

public class PrincipalAnimal {
	public static void main(String args[]) {
		Mamifero Elefante = new Mamifero("Elefante", 2000, false, "Sin pelo", null, null, "Herbivoro");
		Mamifero Toro = new Mamifero("Toro", 800, false, "Corto", "Liso", "Negro", "Herbivoro");
		Mamifero Orangutan = new Mamifero("Orangutan", 100, true, "Largo", "Liso", "Marrón", "Herbivoro");
		Mamifero Tigre = new Mamifero("Tigre", 400, false, "Corto", "Liso", "Naranja rayado de negro", "Carnivoro");
		Mamifero Leon = new Mamifero("Leon", 500, false, "Largo", "Liso", "Amarillento", "Carnivoro");
		Reptil DragonKomodo = new Reptil("Dragon de Komodo", 200, false, "Pequeñas", "Marrón verdoso", "Carnívoro");
		Reptil Cocodrilo = new Reptil("Cocodrilo", 500, false, "Grande", "Verde", "Carnívoro");
		
		Elefante.atacar(Leon);
		Toro.asearse();
		DragonKomodo.atacar(Toro);
		DragonKomodo.dormir();
		Leon.atacar(DragonKomodo);
		DragonKomodo.asearse();
		Toro.atacar(Tigre);
		Tigre.dormir();
		Tigre.atacar(Cocodrilo);
		Cocodrilo.asearse();
		DragonKomodo.atacar(Leon);
		Cocodrilo.dormir();
		Leon.atacar(Toro);
		Tigre.removerTierra();
		DragonKomodo.atacar(Elefante);
		Orangutan.removerTierra();
		Cocodrilo.atacar(Toro);
		Tigre.comer();
		Cocodrilo.atacar(Leon);
		Leon.comer();
	}
}
