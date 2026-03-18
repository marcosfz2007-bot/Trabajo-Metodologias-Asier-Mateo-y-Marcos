package ejercicio6_1;


import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void defaultConstructor() {
        new Rectangle();
    }

    @Test
    void constructorWidthLength() {
        new Rectangle(3.0, 4.0);
    }

    @Test
    void constructorFull() {
        new Rectangle(3.0, 4.0, "blue", true);
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.getWidth();
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.setWidth(6.0);
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.getLength();
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.setLength(8.0);
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.getArea();
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(3.0, 4.0);
        r.getPerimeter();
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(3.0, 4.0, "red", true);
        r.toString();
    }
}