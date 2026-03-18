package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_2;

public class TestCylinder {
    public static void main(String[] args) {

        // Crea un cilindro por defecto
        Cylinder c1 = new Cylinder();

        // Muestra el objeto completo (toString)
        System.out.println(c1);

        // Muestra propiedades del cilindro
        System.out.println("Radius: " + c1.getRadius());   // radio de la base
        System.out.println("Color: " + c1.getColor());     // color del círculo base
        System.out.println("Height: " + c1.getHeight());   // altura del cilindro

        // Calcula área y volumen
        System.out.println("Area: " + c1.getArea());
        System.out.println("Volume: " + c1.getVolume());

        System.out.println();

        // Crea un cilindro con radio=2, altura=5 y color azul
        Cylinder c2 = new Cylinder(2.0, 5.0, "blue");

        // Muestra el objeto
        System.out.println(c2);

        // Muestra propiedades
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Height: " + c2.getHeight());

        // Calcula área y volumen
        System.out.println("Area: " + c2.getArea());
        System.out.println("Volume: " + c2.getVolume());
    }
}