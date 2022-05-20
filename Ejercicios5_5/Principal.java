package Ejercicios5_5;

public class Principal {
    public static void main(String[] args) {

        Coordenadas2D[] c1 = new Coordenadas2D[2];
        c1[0] = new Coordenadas2D(8, 5);
        c1[1] = new Coordenadas2D(1, 6);
        Rectangulo r1 = new Rectangulo(c1);
        Coordenadas2D[] c2 = new Coordenadas2D[2];
        System.out.println(" (rectangulo 1)" + r1);
        c2[0] = new Coordenadas2D(5, 6);
        c2[1] = new Coordenadas2D(7, 8);

        Rectangulo rectangulo2 = new Rectangulo(c2);
        r1.getCoord()[1].setX(9);
        System.out.println(" (rectangulo 1)" + r1);
        System.out.println(" (rectangulo 2) " + rectangulo2);
        System.out.println("El Area del primer rectangulo es: " + r1.area());
        System.out.println("El Perimetro del primer rectangulo es: " + r1.perimetro());
        System.out.println("El Area del segundo rectangulo es: " + rectangulo2.area());
        System.out.println("El Perimetro del segundo rectangulo es: " + rectangulo2.perimetro());
    }
}
