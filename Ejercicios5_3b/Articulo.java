package Ejercicios5_3b;

public class Articulo {
	private String nombre;
	private Dinero precio;
	private final float IVA=0.21f;
	private int disponibles;
	
	public Articulo (String nombre, Dinero precio,int disponibles,int IVA) {
		this.nombre=nombre;
		this.precio=precio;
		IVA=21;
		this.disponibles=disponibles;
	}
	public Dinero getPrecio() {
		return this.precio;
		//no se como coger el precio para calcular el PVP, he buscado por google pero no se como se hace, y sin eso no se hacerlo
	}
	
	private Dinero getPVP() {
		Dinero conIva= new Dinero(this.getPrecio().getCantidad()*1.21f);
		return conIva;
	}
	@Override
	public String toString() {
		String cadena="";
		cadena= cadena.concat("El precio es "+this.getPVP());
		return cadena;
	}
}
