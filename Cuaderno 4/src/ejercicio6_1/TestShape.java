package ejercicio6_1;

public class TestShape {
    public static void main(String[] args) {

        // --- POLIMORFISMO: variable de tipo Shape apunta a objeto Circle ---
        Shape s1 = new Circle(5.5, "red", false);

        System.out.println(s1);             // Polimorfismo: llama a Circle.toString()
        System.out.println(s1.getArea());   // Polimorfismo: llama a Circle.getArea()
        System.out.println(s1.getPerimeter()); // Polimorfismo: llama a Circle.getPerimeter()
        System.out.println(s1.getColor());  // Heredado de Shape, no hay polimorfismo aquí
        System.out.println(s1.isFilled());

        // s1.getRadius() --> ERROR EN COMPILACIÓN
        // Shape no tiene getRadius(). Aunque el objeto real ES un Circle,
        // el compilador solo ve el tipo declarado (Shape).

        // DOWNCAST: recuperamos el tipo Circle para acceder a getRadius()
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // Ahora sí podemos usarlo

        // Shape s2 = new Shape(); --> ERROR EN COMPILACIÓN
        // Shape es abstracta: no se pueden crear objetos directamente.

        // UPCAST con Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // s3.getLength() --> ERROR: Shape no tiene getLength()

        Rectangle r1 = (Rectangle) s3; // Downcast a Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength()); // Ahora accesible

        // UPCAST con Square
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // s4.getSide() --> ERROR: Shape no tiene getSide()

        // Downcast a Rectangle (superclase de Square): VÁLIDO porque Square ES un Rectangle
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // r2.getSide() --> ERROR: Rectangle no tiene getSide()
        System.out.println(r2.getLength()); // Válido, Rectangle sí tiene getLength()

        // Downcast de Rectangle r2 a Square: VÁLIDO porque el objeto real es Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());   // Accesible ahora
        System.out.println(sq1.getLength()); // También accesible
    }
}

/*
 * ¿Para qué sirven las clases abstractas y los métodos abstractos?
 *
 * Las clases abstractas sirven para definir una "plantilla" común para un
 * grupo de clases relacionadas. Por ejemplo, Shape define que todas las
 * figuras tienen color y relleno, y que todas deben saber calcular su área
 * y perímetro, aunque cada una lo haga a su manera.
 *
 * Los métodos abstractos sirven para obligar a las subclases a implementar
 * ciertos comportamientos. Si Circle no implementase getArea(), el compilador
 * daría error. Así el programador que diseñó Shape garantiza que cualquier
 * figura siempre tendrá esos métodos disponibles.
 *
 * En resumen: las clases abstractas dan estructura y garantizan que las
 * subclases cumplan un "contrato mínimo" de funcionalidad.
 */
