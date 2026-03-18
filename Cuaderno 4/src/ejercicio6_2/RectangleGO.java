package ejercicio6_2;
// Versiones simplificadas de Circle y Rectangle que implementan la interfaz GeometricObject

class RectangleGO implements GeometricObject {
    private double width;
    private double length;

    public RectangleGO(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}

