package ejercicio6_5;



import org.junit.jupiter.api.Test;

class CircleBaseTest {

    @Test
    void constructor() {
        new CircleBase(5.0);
    }

    @Test
    void getArea() {
        CircleBase c = new CircleBase(5.0);
        c.getArea();
    }

    @Test
    void getPerimeter() {
        CircleBase c = new CircleBase(5.0);
        c.getPerimeter();
    }

    @Test
    void testToString() {
        CircleBase c = new CircleBase(5.0);
        c.toString();
    }
}