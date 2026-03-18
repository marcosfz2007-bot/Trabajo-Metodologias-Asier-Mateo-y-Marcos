public class Circle extends Shape {

    protected double radius = 1.0;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius,2));
    }

    @Override
    public double getPerimeter() {
        return 2*(Math.PI*(this.radius));
    }

    public String ToString() {
        return String.format("Circle[Shape[color=%.f,filled=%b],radius");
    }
}
