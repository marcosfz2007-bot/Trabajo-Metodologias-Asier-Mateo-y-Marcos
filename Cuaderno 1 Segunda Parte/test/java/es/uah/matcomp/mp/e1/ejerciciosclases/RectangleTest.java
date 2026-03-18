package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.getLength();
    }

    @Test
    void setLength() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.setLength(6.0f);
    }

    @Test
    void getWidth() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.getWidth();
    }

    @Test
    void setWidth() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.setWidth(5.0f);
    }

    @Test
    void getArea() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.getArea();
    }

    @Test
    void getPerimeter() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.getPerimeter();
    }

    @Test
    void testToString() {
        Rectangle rect = new Rectangle(4.0f, 3.0f);
        rect.toString();
    }

    @Test
    void defaultConstructor() {
        Rectangle rect = new Rectangle(); // cubre el constructor vacío
    }
}