package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_5;

public class TestShape {

    public static void main(String[] args) {

        // Crea un objeto Shape
        Shape s = new Shape("green", false);
        System.out.println(s); // usa toString de Shape

        // Crea un círculo
        Circle c = new Circle(2.5, "blue", true);
        System.out.println(c); // usa toString de Circle (y super.toString)
        System.out.println("Area: " + c.getArea()); // calcula área del círculo

        // Crea un rectángulo
        Rectangle r = new Rectangle(3,4,"yellow",true);
        System.out.println(r); // usa toString de Rectangle
        System.out.println("Area: " + r.getArea()); // área = width * length

        // Crea un cuadrado (hereda de Rectangle)
        Square sq = new Square(5,"black",true);
        System.out.println(sq); // usa toString de Square
        System.out.println("Area: " + sq.getArea()); // área = lado * lado
    }
}