package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5.0);
        circle.getRadius();
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(5.0);
        circle.setRadius(10.0);
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5.0);
        circle.getArea();
    }

    @Test
    void getCircumference() {
        Circle circle = new Circle(5.0);
        circle.getCircumference();
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5.0);
        circle.toString();
    }

    @Test
    void defaultConstructor() {
        Circle circle = new Circle(); // cubre el constructor vacío
    }
}