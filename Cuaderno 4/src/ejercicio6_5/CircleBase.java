package ejercicio6_5;// Una clase puede implementar MÚLTIPLES interfaces a la vez.
// Aquí ResizableCircle extiende Circle (herencia) e implementa Resizable (interfaz).

// Circle simplificado que implementa GeometricObject
class CircleBase implements GeometricObject {
    protected double radius;

    public CircleBase(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() { return "Circle[radius=" + radius + "]"; }
}

