package Ejercicios5_4;

public class Mamifero extends Animal implements Carnivoro, Herbivoro {
	private String longitudPelo;
	private String formaPelo;
	private String colorPelo;
	private String tipoAlimentacion;

	public Mamifero(String nombreEspecie, int peso, boolean caminaCuatroPatas, String longitudPelo, String formaPelo, String colorPelo, String tipoAlimentacion) {
		super(nombreEspecie, peso, caminaCuatroPatas);
		this.longitudPelo = longitudPelo;
		this.formaPelo = formaPelo;
		this.colorPelo = colorPelo;
		this.tipoAlimentacion = tipoAlimentacion;	
	}

	public String getLongitudPelo() {
		return longitudPelo;
	}

	public void setLongitudPelo(String longitudPelo) {
		if(longitudPelo != "Corto" && longitudPelo != "Largo" && longitudPelo != "Sin pelo") {
			this.longitudPelo = "Sin pelo";
		} else {
			this.longitudPelo = longitudPelo;
		}
	}

	public String getFormaPelo() {
		return formaPelo;
	}

	public void setFormaPelo(String formaPelo) {
		if(formaPelo != "Rizado" && formaPelo != "Liso" && formaPelo != "Ondulado") {
			this.formaPelo = "Liso";
		} else {
			this.formaPelo = formaPelo;
		}
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
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
		if(this.longitudPelo == "Largo") {
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
		} else if(this.longitudPelo == "Corto") {
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
		} else {
			if(this.limpieza == "Muy sucio") {
				System.out.println("El " + this.getNombreEspecie() + " estaba " + this.getLimpieza());
				this.limpieza = "Desinfectado";
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
			if(this.getTipoAlimentacion() == "Herbivoro") {
				if(this.longitudPelo == "Sin pelo") {
					System.out.println("El " + this.getNombreEspecie() + " remueve la tierra por comida... ");
					this.ensuciarse();
				} else if(this.longitudPelo == "Corto") {
					System.out.println("El " + this.getNombreEspecie() + " remueve la tierra por comida... ");
					this.ensuciarse();
					this.ensuciarse();
				} else if (this.longitudPelo == "Largo") {
					System.out.println("El " + this.getNombreEspecie() + " remueve la tierra por comida... ");
					this.ensuciarse();
					this.ensuciarse();
					this.ensuciarse();
				}
				this.comer();
				}
			}
		}

	