package ejercicio6_2;



import org.junit.jupiter.api.Test;

class CircleGOTest {

    @Test
    void constructor() {
        new CircleGO(5.0);
    }

    @Test
    void getArea() {
        CircleGO c = new CircleGO(5.0);
        c.getArea();
    }

    @Test
    void getPerimeter() {
        CircleGO c = new CircleGO(5.0);
        c.getPerimeter();
    }

    @Test
    void testToString() {
        CircleGO c = new CircleGO(5.0);
        c.toString();
    }
}