package Ejercicios5_1c;
import Ejercicios5_1a.Coordenada2D;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada2D EsquinaSuperior= new Coordenada2D(0,0);
		Coordenada2D EsquinaOpuestaInferior= new Coordenada2D(5,5);
		Coordenada2D EsquinaSuperior1= new Coordenada2D(7,9);
		Coordenada2D EsquinaOpuestaInferior1= new Coordenada2D(2,3);
		
		Coordenada2D Cambio1= new Coordenada2D(5,1);
		Coordenada2D Cambio2= new Coordenada2D(1,5);
		Rectangulo R1= new Rectangulo(EsquinaSuperior,EsquinaOpuestaInferior);
		Rectangulo R2= new Rectangulo(EsquinaSuperior1,EsquinaOpuestaInferior1);
		R1.calcularPerimetro();
		R1.setEsquinaOpuestaInferior(Cambio1);
		R1.setEsquinaOpuestaInferior(Cambio2);
		R1.calcularPerimetro();
		R2.calcularArea();
		System.out.println(EsquinaSuperior);

}
}

