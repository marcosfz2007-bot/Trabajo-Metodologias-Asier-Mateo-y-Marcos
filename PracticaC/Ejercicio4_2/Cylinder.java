package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_2;

// Cylinder usa COMPOSICIÓN (tiene un Circle como base)
public class Cylinder {

    // Atributos: base (círculo) y altura
    private Circle base;
    private double height;

    // Constructor por defecto
    public Cylinder() {
        base = new Circle(); // crea un círculo por defecto
        height = 1.0;
    }

    // Constructor con radio
    public Cylinder(double radius) {
        base = new Circle(radius); // crea la base con ese radio
        height = 1.0;
    }

    // Constructor con radio y altura
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    // Constructor completo (incluye color del círculo)
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    // Devuelve el círculo base
    public Circle getBase() {
        return base;
    }

    // Cambia el círculo base
    public void setBase(Circle base) {
        this.base = base;
    }

    // Devuelve la altura
    public double getHeight() {
        return height;
    }

    // Cambia la altura
    public void setHeight(double height) {
        this.height = height;
    }

    // Devuelve el radio (delegado al Circle)
    public double getRadius() {
        return base.getRadius();
    }

    // Cambia el radio (delegado al Circle)
    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    // Devuelve el color (delegado al Circle)
    public String getColor() {
        return base.getColor();
    }

    // Cambia el color (delegado al Circle)
    public void setColor(String color) {
        base.setColor(color);
    }

    // Calcula el área total del cilindro
    public double getArea() {
        // 2 bases + área lateral
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }

    // Calcula el volumen del cilindro
    public double getVolume() {
        return base.getArea() * height;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }
}