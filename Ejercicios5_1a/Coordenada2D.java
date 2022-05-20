package Ejercicios5_1a;

public class Coordenada2D {
	//atributos
	private int x;
	private int y;
	
	//constructor
	public Coordenada2D(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//metodos
	public int getx() {
		return this.x;
	}
	public void setx(int x) {
		this.x=x;
	}
	public int gety() {
		return this.y;
	}
	public void sety(int y) {
		this.y=y;
	}

	public void sumar(int x1,int y1) {
		this.x+=x1;
		this.y+=y1;
	}
	public void restar(int x1,int y1) {
		this.x-=x1;
		this.y-=y1;
	}
	public void multiplicar(int x1,int y1) {
		this.x=this.x*x1;
		this.y=this.y*y1;
	}
	public void dividir(int x1,int y1) {
		this.x=this.x/x1;
		this.y=this.y/y1;
	}
	@Override
	public String toString() {
		String Cadena="";
		Cadena=Cadena.concat(this.x+","+this.y);
		return Cadena;
	}


}
