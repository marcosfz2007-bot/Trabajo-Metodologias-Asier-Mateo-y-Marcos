package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_5;

// Square hereda de Rectangle (un cuadrado es un rectángulo especial)
public class Square extends Rectangle {

    // Constructor por defecto
    public Square() {
    }

    // Constructor con lado (width = length = side)
    public Square(double side) {
        super(side, side); // inicializa width y length iguales
    }

    // Constructor completo (incluye atributos de Shape)
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Devuelve el lado (usa width porque width = length)
    public double getSide() {
        return getWidth();
    }

    // Cambia el lado (mantiene width y length iguales)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Sobrescribe setWidth para mantener la propiedad de cuadrado
    @Override
    public void setWidth(double side) {
        setSide(side); // asegura width = length
    }

    // Sobrescribe setLength para mantener la propiedad de cuadrado
    @Override
    public void setLength(double side) {
        setSide(side); // asegura width = length
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}