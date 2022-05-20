package Ejercicios5_4;

public abstract class Animal implements Carnivoro{
	protected String nombreEspecie;
	protected int peso;
	protected boolean caminaCuatroPatas;
	protected int vitalidad;
	protected String limpieza;
	protected String tipoAlimentacion;
	
	public Animal(String nombreEspecie, int peso, boolean caminaCuatroPatas) {
		this.nombreEspecie = nombreEspecie;
		this.peso = peso;
		this.caminaCuatroPatas = caminaCuatroPatas;
		this.vitalidad = 10;
		this.limpieza = "Desinfectado";
	}
	
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	public String getNombreEspecie() {
		return this.nombreEspecie;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public void setCaminaCuatroPatas(boolean caminaCuatroPatas) {
		this.caminaCuatroPatas = caminaCuatroPatas;
	}
	
	public String getCaminaCuatroPatas() {
		if (this.caminaCuatroPatas = true) {
			return "Este animal camina a cuatro patas";
		} else {
			return "Este animal no camina a cuatro patas";
		}
	}
	
	public void setVitalidad(int vitalidad) {
		if(vitalidad < 0) { 
			this.vitalidad = 0;
		} else if (vitalidad > 10) {
			this.vitalidad = 10;
		} else {
			this.vitalidad = vitalidad;
		}
	}
	public int getVitalidad() {
		return this.vitalidad;
	}
	
	public void setLimpieza(String limpieza) {
		if (limpieza != "Muy sucio" && limpieza != "Manchado" && limpieza != "Limpio" && limpieza != "Desinfectado") {
			this.limpieza = null;			
		} else {
			this.limpieza = limpieza;
		}
	}
	public String getLimpieza() {
		return this.limpieza;
	}
	
	public void comer() {
		if (vitalidad < 5) {
			this.dormir();
		} else {
			System.out.println("Ñam ñam");
			System.out.println("----");
			this.setVitalidad(this.getVitalidad() + 1);
		}
	}
	
	public void dormir() {
		if (vitalidad > 2) {
			System.out.println("ZzZZzzzz");
			System.out.println("----");
		}
	}
	
	public abstract void asearse();
	
	public void ensuciarse() {
		if(this.limpieza == "Desinfectado") {
			this.limpieza = "Limpio";
		} else if(this.limpieza == "Limpio") {
			this.limpieza = "Manchado";
		} else if(this.limpieza == "Manchado") {
			this.limpieza = "Muy sucio";
		}
		
	}

	protected String getTipoAlimentacion(){
		return this.tipoAlimentacion;
	}
	@Override
	public abstract void atacar(Animal animal);

}
