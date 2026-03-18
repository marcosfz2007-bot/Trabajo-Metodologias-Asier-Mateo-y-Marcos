package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_1;

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
// Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }
    public Circle(double r, String c) { // 3rd constructor
        this.radius = r;
        this.color = c;
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    /** Returns the area of Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            this.radius = newRadius;
        }
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Practica_a.Circle[radius=" + radius + " color=" + color + "]";
    }

}
