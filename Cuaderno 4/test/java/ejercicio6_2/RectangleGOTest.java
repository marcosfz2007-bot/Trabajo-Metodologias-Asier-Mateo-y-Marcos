package ejercicio6_2;



import org.junit.jupiter.api.Test;

class RectangleGOTest {

    @Test
    void constructor() {
        new RectangleGO(3.0, 4.0);
    }

    @Test
    void getArea() {
        RectangleGO r = new RectangleGO(3.0, 4.0);
        r.getArea();
    }

    @Test
    void getPerimeter() {
        RectangleGO r = new RectangleGO(3.0, 4.0);
        r.getPerimeter();
    }

    @Test
    void testToString() {
        RectangleGO r = new RectangleGO(3.0, 4.0);
        r.toString();
    }
}