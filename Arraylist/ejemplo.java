package Arraylist;
import java.util.ArrayList;
public class ejemplo {
	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList <String>();
		a.add("Color");
		a.add("Color");
		a.add("Color");
		a.add("Color");
		a.add("Color");
		
		System.out.println(a.size());
		System.out.println(a.get(0));
		for(String b:a) {
			System.out.println(b);
		}
	}
}	
