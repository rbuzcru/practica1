package Ejercicios5_3b;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo arrayObjetos[]=new Articulo[3];
		Dinero a1= new Dinero(23);
		Dinero a2= new Dinero(25);
		Dinero a3= new Dinero(12);
		arrayObjetos[0]= new Articulo("Auriculares",a1,4,21);
		arrayObjetos[1]= new Articulo("Teclado",a2,4,21);
		arrayObjetos[2]= new Articulo("Raton",a3,4,21);
		}

}
