package ejercicio6_1;

// Circle EXTIENDE Shape: hereda sus atributos y métodos, y DEBE implementar los abstractos.
public class Circle extends Shape {

    protected double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // llama al constructor de Shape
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Implementamos los métodos abstractos de Shape (OBLIGATORIO)
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + color + ",filled=" + filled + "],radius=" + radius + "]";
    }
}
