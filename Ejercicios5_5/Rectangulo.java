package Ejercicios5_5;

public class Rectangulo {
  // atributos
  private Coordenadas2D[] coord;

  // constructor
  public Rectangulo(Coordenadas2D[] coord) {
    this.coord = coord;
  }

  public Coordenadas2D[] getCoord() {
    return coord;
  }

  public void setCoord(Coordenadas2D[] coord) {
    this.coord = coord;
  }

  public int perimetro() {
    return Math.abs((getCoord()[0].getX() - getCoord()[1].getX()) + (getCoord()[0].getY() -
        getCoord()[1].getY()) * 2);
  }

  public int area() {
    return Math.abs((getCoord()[0].getX() - coord[1].getX()) *
        (getCoord()[0].getX() - getCoord()[1].getX()));
  }

  @Override
  public String toString() {
    String cadena = "";
    for (int i = 0; i < 2; i++) {
      System.out.print(getCoord()[i]);
      // this.coord[0] + "" + this.coord[1]
    }
    return cadena;
  }
}
