package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

// Clase que representa un punto en 2D
public class Point {

    // Coordenadas
    private int x;
    private int y;

    // Constructor que inicializa el punto
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Representación en texto
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    // Devuelve x
    public int getX() {
        return x;
    }

    // Devuelve y
    public int getY() {
        return y;
    }

    // Cambia x
    public void setX(int x) {
        this.x = x;
    }

    // Cambia y
    public void setY(int y) {
        this.y = y;
    }

    // Cambia ambas coordenadas
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}