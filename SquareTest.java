package ejercicio6_2;
// Versiones simplificadas de Circle y Rectangle que implementan la interfaz GeometricObject

public class TestGeometricObject {
    public static void main(String[] args) {

        // La variable es de tipo GeometricObject (la interfaz)
        // pero el objeto creado es un CircleGO o RectangleGO
        GeometricObject g1 = new CircleGO(5.0);
        GeometricObject g2 = new RectangleGO(3.0, 4.0);

        System.out.println(g1);               // Circle[radius=5.0]
        System.out.println(g1.getArea());     // Polimorfismo: llama a CircleGO.getArea()
        System.out.println(g1.getPerimeter());

        System.out.println(g2);               // Rectangle[width=3.0,length=4.0]
        System.out.println(g2.getArea());     // Polimorfismo: llama a RectangleGO.getArea()
        System.out.println(g2.getPerimeter());
    }
}
