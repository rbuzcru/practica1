package Ejercicios5_1c;
import Ejercicios5_1a.Coordenada2D;
public class Rectangulo {
	//atributos
	private Coordenada2D esquinaSuperior;
	private Coordenada2D esquinaOpuestaInferior;
	//constructor
	public Rectangulo (Coordenada2D esquinaSuperior,Coordenada2D esquinaOpuestaInferior) {
		this.esquinaSuperior=esquinaSuperior;
		this.esquinaOpuestaInferior=esquinaOpuestaInferior;
	}
	//metodos
	public Coordenada2D getEsquinaSuperior() {
		return this.esquinaSuperior;
	}
	public void setEsquinaSuperior(Coordenada2D esquinaSuperior) {
		this.esquinaSuperior=esquinaSuperior;
	}
	public void setEsquinaOpuestaInferior(Coordenada2D esquinaOpuestaInferior) {
		this.esquinaOpuestaInferior=esquinaOpuestaInferior;
	}
	public Coordenada2D getEsquinaOpuestaInferior() {
		return this.esquinaSuperior;
	}
	public void calcularPerimetro() {
		int perimetro=(Math.abs(this.esquinaOpuestaInferior.getx() - this.esquinaSuperior.getx())*2 + Math.abs(this.esquinaOpuestaInferior.gety() - this.esquinaSuperior.gety())*2);
		 System.out.println(perimetro);
	}
	public void calcularArea() {
		int area=((Math.abs(esquinaOpuestaInferior.getx()) - (this.esquinaSuperior.getx())) * Math.abs((this.esquinaOpuestaInferior.gety()) - (this.esquinaSuperior.gety())));
		System.out.println(area);
	}
}
