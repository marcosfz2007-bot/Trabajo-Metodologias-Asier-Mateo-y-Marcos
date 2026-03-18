package ejercicio6_1;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void defaultConstructor() {
        // Shape es abstracta, se prueba a través de Circle
        new Circle();
    }

    @Test
    void getColor() {
        Circle c = new Circle(5.0, "blue", true);
        c.getColor();
    }

    @Test
    void setColor() {
        Circle c = new Circle();
        c.setColor("green");
    }

    @Test
    void isFilled() {
        Circle c = new Circle(5.0, "blue", false);
        c.isFilled();
    }

    @Test
    void setFilled() {
        Circle c = new Circle();
        c.setFilled(false);
    }

    @Test
    void testToString() {
        Circle c = new Circle();
        c.toString();
    }
}