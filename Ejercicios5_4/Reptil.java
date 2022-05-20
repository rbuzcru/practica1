package Ejercicios5_4;

public class Reptil extends Animal implements Carnivoro, Herbivoro{
	private String tamanoEscamas;
	private String colorPiel;
	private String tipoAlimentacion;

	public Reptil(String nombreEspecie, int peso, boolean caminaCuatroPatas, String tamanoEscamas, String colorPiel, String tipoAlimentacion){
		super(nombreEspecie,peso,caminaCuatroPatas);
		this.tamanoEscamas=tamanoEscamas;
		this.colorPiel=colorPiel;
		this.tipoAlimentacion=tipoAlimentacion;
		
	}

	public String getTamanoEscamas() {
		return tamanoEscamas;
	}

	public void setTamanoEscamas(String tamanoEscamas) {
		if (tamanoEscamas != "Grandes" && tamanoEscamas != "Pequeñas") {
			this.tamanoEscamas = "Pequeñas";
		} else {
			this.tamanoEscamas = tamanoEscamas;
		}
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		if (tipoAlimentacion != "Carnivoro" && tipoAlimentacion != "Herbivoro") {
			this.tipoAlimentacion = "Carnivoro";
		} else {
			this.tipoAlimentacion = tipoAlimentacion;
		}
	}
	
	@Override
	public void asearse() {
		if(this.tamanoEscamas == "Pequeñas") {
			if(this.limpieza == "Muy sucio") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Manchado";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else if(this.limpieza == "Manchado") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Limpio";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else if(this.limpieza == "Limpio") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Desinfectado";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else {
				System.out.println("El " + this.getNombreEspecie() + " ya está completamente limpio.");
			}
		} else if(this.tamanoEscamas == "Grandes") {
			if(this.limpieza == "Muy sucio") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Limpio";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else if(this.limpieza == "Manchado") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Desinfectado";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else if(this.limpieza == "Limpio") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Desinfectado";
				System.out.println("El " + this.getNombreEspecie() + " está " + this.getLimpieza());
				System.out.println("----");
			} else {
				System.out.println("El " + this.getNombreEspecie() + " ya está completamente limpio.");
				} 	
			}
		}
	
	@Override
	public void atacar(Animal animal) {
		if (this.getTipoAlimentacion() == "Herbivoro") {
			System.out.println("El " + this.getNombreEspecie() + " decide no atacar. Es herbívoro. \n----");
		}else if(this.getTipoAlimentacion() == "Carnivoro") {
			if(this.getVitalidad() != 0 && animal.getVitalidad() != 0) {
				if (this.peso / animal.peso >= 4) {
					this.ensuciarse();
					animal.ensuciarse();
					System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
					System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
					animal.setVitalidad(0);
					System.out.println("¡Ataque!");
					System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
					System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
					System.out.println("----");
					if (animal.getTipoAlimentacion() == "Carnivoro") {
						animal.atacar(this);
					}
				} if (this.peso / animal.peso > 2 && this.peso / animal.peso < 4) {
					this.ensuciarse();
					animal.ensuciarse();
					System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
					System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
					animal.setVitalidad(animal.getVitalidad() - 6);
					System.out.println("¡Ataque!");
					System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
					System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
					System.out.println("----");
					if (animal.getTipoAlimentacion() == "Carnivoro") {
						animal.atacar(this); 	
						}
					} if (this.peso / animal.peso >= 1 && this.peso / animal.peso < 2) {
						this.ensuciarse();
						animal.ensuciarse();
						System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
						System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
						animal.setVitalidad(animal.getVitalidad() - 3);
						System.out.println("¡Ataque!");
						System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
						System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
						System.out.println("----");
						if (animal.getTipoAlimentacion() == "Carnivoro") {
							animal.atacar(this); 
						}
					} if (this.peso / animal.peso < 1) {
						this.ensuciarse();
						animal.ensuciarse();
						System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
						System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
						animal.setVitalidad(animal.getVitalidad() - 1);
						this.setVitalidad(this.getVitalidad() - 2);
						System.out.println("¡Ataque!");
						System.out.println("El " + this.getNombreEspecie() + " tiene " + this.getVitalidad() + " de vida.");
						System.out.println("El " + animal.getNombreEspecie() + " tiene " + animal.getVitalidad() + " de vida.");
						System.out.println("----");
						if (animal.getTipoAlimentacion() == "Carnivoro") {
							animal.atacar(this);
						}
					}
				}
			}
		}
	
	@Override
	public void removerTierra() {
		if(this.tamanoEscamas == "Pequeñas") {
			this.ensuciarse();
		} else if(this.tamanoEscamas == "Grandes") {
			this.ensuciarse();
			this.ensuciarse();
		this.comer();
}
}
}