package Ejercicios5_5;

public class Coordenadas2D {
    // atributos
    private int x;
    private int y;

    // constructor
    public Coordenadas2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // metodos
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void sumar(Coordenadas2D otraCoordenada) {
        this.x += otraCoordenada.x;
        this.y += otraCoordenada.y;
    }

    public void restar(Coordenadas2D otraCoordenada) {
        this.x -= otraCoordenada.x;
        this.y -= otraCoordenada.y;
    }

    // toString
    @Override
    public String toString() {
        return ("(" + x + "," + y + ")");
    }

}
