package ejercicio6_1;

// Square extiende Rectangle. Un cuadrado es un rectángulo con width == length.
public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; } // width y length son iguales

    // Al cambiar el lado, actualizamos AMBOS (width y length heredados de Rectangle)
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ",filled=" + filled + "],width=" + width + ",length=" + length + "]]";
    }
}
