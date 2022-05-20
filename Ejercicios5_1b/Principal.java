package Ejercicios5_1b;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Persona p1 = new Persona ();
		Persona p2 = new Persona ();
		System.out.println("Dime la edad de la primera persona");
		int edad1=sc1.nextInt();
		System.out.println("Dime el dni de la primera persona");
		String dni1=sc2.nextLine();
		System.out.println("Dime el nombre de la primera persona");
		String nombre1=sc2.nextLine();
		System.out.println("Dime el apellido de la primera persona");
		String apellido1=sc2.nextLine();
		System.out.println("Dime la edad de la segunda persona");
		int edad2=sc1.nextInt();
		System.out.println("Dime el dni de la segunda persona");
		String dni2=sc2.nextLine();
		System.out.println("Dime el nombre de la segunda persona");
		String nombre2=sc2.nextLine();
		System.out.println("Dime el apellido de la segunda persona");
		String apellido2=sc2.nextLine();
		
		p1.setedad(edad1);
		p1.setApellidos(apellido1);
		p1.setDNI(dni1);
		p1.setNombre(nombre1);
		
		p2.setApellidos(apellido2);
		p2.setDNI(dni2);
		p2.setedad(edad2);
		p2.setNombre(nombre2);
		
		p1.getEdadMedia();
		
		
		System.out.println(p1);
		System.out.println(p2);
		sc1.close();
		sc2.close();
	}

}
