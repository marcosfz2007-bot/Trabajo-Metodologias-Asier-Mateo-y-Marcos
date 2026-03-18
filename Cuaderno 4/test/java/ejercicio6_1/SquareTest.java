package ejercicio6_1;


import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void defaultConstructor() {
        new Square();
    }

    @Test
    void constructorSide() {
        new Square(4.0);
    }

    @Test
    void constructorFull() {
        new Square(4.0, "blue", true);
    }

    @Test
    void getSide() {
        Square s = new Square(4.0);
        s.getSide();
    }

    @Test
    void setWidth() {
        Square s = new Square(4.0);
        s.setWidth(6.0);
    }

    @Test
    void setLength() {
        Square s = new Square(4.0);
        s.setLength(6.0);
    }

    @Test
    void getArea() {
        Square s = new Square(4.0);
        s.getArea();
    }

    @Test
    void getPerimeter() {
        Square s = new Square(4.0);
        s.getPerimeter();
    }

    @Test
    void testToString() {
        Square s = new Square(4.0, "red", true);
        s.toString();
    }
}