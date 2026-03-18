package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_2;

// Clase que representa un círculo
public class Circle {

    // Atributos: radio y color
    private double radius = 1.0;
    private String color = "red";

    // Constructor por defecto
    public Circle() {
    }

    // Constructor con radio
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor con radio y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Devuelve el radio
    public double getRadius() {
        return radius;
    }

    // Cambia el radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Devuelve el color
    public String getColor() {
        return color;
    }

    // Cambia el color
    public void setColor(String color) {
        this.color = color;
    }

    // Calcula el área del círculo (πr²)
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Representación en texto del círculo
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}