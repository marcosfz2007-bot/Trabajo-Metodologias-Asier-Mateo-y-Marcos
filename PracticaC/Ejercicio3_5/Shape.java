package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_5;

// Clase base Shape (superclase de Circle y Rectangle)
public class Shape {

    // Atributos comunes a todas las figuras
    private String color = "red";
    private boolean filled = true;

    // Constructor por defecto
    public Shape(){
    }

    // Constructor con parámetros
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Devuelve el color
    public String getColor() {
        return color;
    }

    // Cambia el color
    public void setColor(String color) {
        this.color = color;
    }

    // Indica si está relleno
    public boolean isFilled() {
        return filled;
    }

    // Cambia si está relleno
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Representación en texto de la figura
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}