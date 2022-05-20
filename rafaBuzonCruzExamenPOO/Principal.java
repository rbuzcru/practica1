package rafaBuzonCruzExamenPOO;

public class Principal {

	public static void main(String[] args) {
		Asignatura[] Asignaturas =new Asignatura[3];
		Asignatura a1=new Asignatura(123,"mates");
		Asignatura a2=new Asignatura(124,"filosofia");
		Asignatura a3=new Asignatura(125,"fisica");
		
		Asignaturas[0]=a1;
		Asignaturas[1]=a2;
		Asignaturas[2]=a3;
		
		Profesor prof1=new Profesor( "3993283K","Andres",120000);
		Estudiante alumn1= new Estudiante ("3213312C","Joel");
		Pas pas1=new Pas("321312312C","Jose",15000,"Nominas");
		ProfesorEmerito profemer1=new ProfesorEmerito("312321D","Raul",142424);
		System.out.println(prof1);
		System.out.println(alumn1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(profemer1);
		System.out.println(pas1);
		profemer1.darCharla();
		profemer1.darCharla();
		System.out.println(profemer1);
	}

}
