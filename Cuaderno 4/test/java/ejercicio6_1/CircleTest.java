package ejercicio6_1;


import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void defaultConstructor() {
        new Circle();
    }

    @Test
    void constructorRadius() {
        new Circle(5.0);
    }

    @Test
    void constructorFull() {
        new Circle(5.0, "blue", true);
    }

    @Test
    void getRadius() {
        Circle c = new Circle(5.0);
        c.getRadius();
    }

    @Test
    void setRadius() {
        Circle c = new Circle(5.0);
        c.setRadius(10.0);
    }

    @Test
    void getArea() {
        Circle c = new Circle(5.0);
        c.getArea();
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(5.0);
        c.getPerimeter();
    }

    @Test
    void testToString() {
        Circle c = new Circle(5.0, "red", true);
        c.toString();
    }
}