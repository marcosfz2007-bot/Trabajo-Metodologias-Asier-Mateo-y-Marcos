package ejercicio6_2;
// Versiones simplificadas de Circle y Rectangle que implementan la interfaz GeometricObject

class CircleGO implements GeometricObject {
    private double radius;

    public CircleGO(double radius) {
        this.radius = radius;
    }

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
        return "Circle[radius=" + radius + "]";
    }
}

