package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_3;

// Clase que representa un punto en 2D (x,y)
public class Point2D {

    // Coordenadas del punto
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor por defecto (0,0)
    public Point2D() {
    }

    // Constructor con valores iniciales
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Devuelve la coordenada x
    public float getX() {
        return x;
    }

    // Cambia la coordenada x
    public void setX(float x) {
        this.x = x;
    }

    // Devuelve la coordenada y
    public float getY() {
        return y;
    }

    // Cambia la coordenada y
    public void setY(float y) {
        this.y = y;
    }

    // Cambia ambas coordenadas a la vez
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Devuelve ambas coordenadas en un array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Representación en texto del punto
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}