package Ejercicios5_1b;

public class Persona {
	//attributes
	 private String dni;
	 private int edad;
	 private String nombre;
	 private String apellidos;
	 //edad de todos
	 private static int edadTotal;
	 private static int nPersonas;
	 
	 //constructor
	 public Persona(int edad,String dni, String nombre, String apellidos ) {
		 this.edad= edad;
		 this.dni= dni;
		 this.nombre= nombre;
		 this.apellidos= apellidos;
		 edadTotal+= this.edad;
		 nPersonas++;
	 }
	 public Persona(String dni, String nombre, String apellidos ) {
		 this(0, dni, nombre, apellidos);
	 }
	 public Persona(String dni, String nombre ) {
		 this(0, dni, nombre, null);
	 }
	 public Persona( ) {
		 this(0,null,null,null); 
	 }
	 
	 //getters setters
	 public void setedad(int edad) {
		 edadTotal+=edad;
		 System.out.println("Edad total= "+Persona.edadTotal);
		 this.edad=edad;
	 }
	 public int getedad() {
		  return this.edad;
	 }
	
	 public void setDNI (String dni) {
		   this.dni=dni;
	 }
	 public String getDNI () {
		  return this.dni;
	 }
	
	 public void setApellidos (String apellidos) {
		  this.apellidos=apellidos;
	 }
	 public String getApellidos () {
		return this.apellidos;
	 }
	
	 public void setNombre (String nombre) {
		  this.nombre=nombre;
	 }
	 public String getNombre () {
		  return this.nombre;
	 }
	 //metodos
	 public int getEdadMedia() {
		 System.out.println(Persona.edadTotal+" "+Persona.nPersonas);
		 return Persona.edadTotal/Persona.nPersonas;
	 }
	 public boolean esMayorDeEdad(int edad) {
		 if(edad>=18) {
			return true; 
		 }
		 else {
			 return false;
		 }
	 }
	 public int diferenciaEdad() {
		 int diferencia=this.getEdadMedia()-this.edad;
		 int corrector=-1;
		 if (diferencia<0) {
			 int diferenciaCorrecta=diferencia*corrector;
			 return diferenciaCorrecta;
		 }
		 else {
			return diferencia;
		 }
	 }
	 @Override
	 public String toString() {
		 String Cadena="";
		 if(edad>=18) {
			 Cadena=Cadena.concat(this.nombre+" "+this.apellidos+" "+" con DNI"+this.dni+" es mayor de edad."+" Su edad dista de la media "+this.diferenciaEdad()+" años.");
		 }
		 else {
			 Cadena=Cadena.concat(this.nombre+" "+this.apellidos+" "+" con DNI"+this.dni+" no es mayor de edad."+" Su edad dista de la media "+this.diferenciaEdad()+" años.");
		 }

		 return Cadena;
	 }
	
}
