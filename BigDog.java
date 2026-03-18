package ejercicio6_1;

// CLASE ABSTRACTA: no se puede crear un objeto Shape directamente.
// Sirve de "plantilla" para las subclases Circle, Rectangle, etc.
public abstract class Shape {

    // Atributos protected: accesibles desde las subclases
    protected String color = "red";
    protected boolean filled = true;

    // Constructor sin argumentos
    public Shape() {}

    // Constructor con argumentos
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Métodos normales (con implementación)
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    // Métodos ABSTRACTOS: no tienen cuerpo. Las subclases ESTÁN OBLIGADAS a implementarlos.
    public abstract double getArea();
    public abstract double getPerimeter();

    // toString devuelve texto descriptivo del objeto
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
