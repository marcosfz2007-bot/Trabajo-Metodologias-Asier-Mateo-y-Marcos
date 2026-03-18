package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_5;

// Circle hereda de Shape
public class Circle extends Shape {

    // Radio del círculo
    private double radius = 1.0;

    // Constructor por defecto
    public Circle() {
    }

    // Constructor con radio
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor completo (usa también atributos de Shape)
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // inicializa la parte de Shape
        this.radius = radius;
    }

    // Devuelve el radio
    public double getRadius() {
        return radius;
    }

    // Cambia el radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calcula el área del círculo
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calcula el perímetro (circunferencia)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Representación en texto (incluye lo heredado de Shape)
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}