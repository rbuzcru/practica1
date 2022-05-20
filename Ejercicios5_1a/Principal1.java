package Ejercicios5_1a;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada2D c1= new Coordenada2D(5,0);
		Coordenada2D c2= new Coordenada2D(-3,7);
		Coordenada2D c3= new Coordenada2D(10,10);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1.setx(10);
		c1.sety(5);
		c2.setx(-5);
		c2.sety(10);
		c3.setx(2);
		c3.sety(4);
		c1.sumar(10, 5);
		System.out.println(c1);
		c1.dividir(10, 5);
		System.out.println(c1);
		c1.multiplicar(10,5);
		System.out.println(c1);
		c1.restar(10,5);
		System.out.println(c1);
		
	}

}
