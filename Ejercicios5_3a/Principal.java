package Ejercicios5_3a;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoFresco p1= new ProductoFresco("as",2,"sda","asd");
		ProductoRefrigerado p2= new ProductoRefrigerado("as",2,2);
		ProductoCongNacionales p3= new ProductoCongNacionales("as",2,2,"ES312");
		ProductoCongInt p4= new ProductoCongInt("as",2,2,"INT321");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
