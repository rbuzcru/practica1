package Ejercicio6_1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Animal> animales=new ArrayList<Animal>();
		Scanner sc=new Scanner(System.in);
		int i=0;
		int posicion1=0;
		while (i!=11){
			System.out.println("1)Añadir elemento \r\n"
					+ "2)Mostrar elemento en la pos i\r\n"
					+ "3)Mostrar todos los elementos\r\n"
					+ "4)Seleccionar un elemento concreto en la pos i (servirá para la siguiente opción)\r\n"
					+ "5)Modificar valores de ese elemento concreto\r\n"
					+ "6)Eliminar elemento en la posición i\r\n"
					+ "7)Eliminar último elemento insertado con un nombre concreto\r\n"
					+ "8)Eliminar todos los elementos con un nombre concreto\r\n"
					+ "9)Eliminar todos elementos mayores que el elemento seleccionado (según el nombre).\r\n"
					+ "10)Eliminar todos elementos menores que el elemento seleccionado (según el nombre).\r\n"
					+ "11)Salir");
			i=sc.nextInt();
			switch (i) {
			case(1):
				System.out.println("Dime el nombre y la especie del animal");
				String nombre=sc.next();
				String especie=sc.next();
				animales.add(new Animal(nombre,especie));
				break;
			case(2):
				System.out.println("Dime una posicion");
				int posicion=sc.nextInt();
				System.out.println(animales.get(posicion));
				break;
			case(3):
				System.out.println(animales);
				break;
			case(4):
				System.out.println("Dime una posicion");
				posicion1=sc.nextInt();
				break;
			case(5):
				System.out.println("Dime unos nuevos valores para la posicion "+posicion1);
				String nombre1=sc.nextLine();
				String especie1=sc.nextLine();
				animales.get(posicion1).setEspecie(especie1);
				animales.get(posicion1).setNombre(nombre1);
				break;
			case(6):
				System.out.println("Dime la posicion del elemento que quieras eliminar");
				posicion1=sc.nextInt();
				animales.remove(posicion1);
				break;
			case(7):
				int longitud=animales.size()-1;
				String nombreConcreto= sc.nextLine();
				for(int y=longitud;y>=0;y--) {
					if(animales.get(y).getNombre().equals(nombreConcreto)) {
						animales.remove(y);
						break;
					}
				}
				break;
			case(8):
				Iterator<Animal> iterator8=animales.iterator();
				String nombreConcreto2=sc.nextLine();
				while(iterator8.hasNext()) {
					if(iterator8.next().getNombre().equals(nombreConcreto2)) {
						iterator8.remove();
					}	
				}
				break;
			/*
			case(9):
				Iterator<Animal> iterator9=animales.iterator();
				String nombreConcreto3=sc.nextLine();
				while(iterator9.hasNext()) {
					if(iterator9.next().equals(nombreConcreto3)){
						
					}
				}
				*/
			}
		
}
}
}



