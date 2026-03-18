package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_5;

// Rectangle hereda de Shape
public class Rectangle extends Shape {

    // Atributos propios: ancho y largo
    private double width = 1.0;
    private double length = 1.0;

    // Constructor por defecto
    public Rectangle() {
    }

    // Constructor con ancho y largo
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor completo (incluye atributos de Shape)
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // inicializa la parte de Shape
        this.width = width;
        this.length = length;
    }

    // Devuelve el ancho
    public double getWidth() {
        return width;
    }

    // Cambia el ancho
    public void setWidth(double width) {
        this.width = width;
    }

    // Devuelve el largo
    public double getLength() {
        return length;
    }

    // Cambia el largo
    public void setLength(double length) {
        this.length = length;
    }

    // Calcula el área del rectángulo
    public double getArea() {
        return width * length;
    }

    // Calcula el perímetro del rectángulo
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Representación en texto (incluye lo heredado de Shape)
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length + "]";
    }
}