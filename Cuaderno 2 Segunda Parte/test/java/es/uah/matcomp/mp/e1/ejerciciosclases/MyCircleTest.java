package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class MyCircleTest {

    @Test
    void defaultConstructor() {
        new MyCircle();
    }

    @Test
    void constructorCoords() {
        new MyCircle(2, 3, 5);
    }

    @Test
    void constructorPoint() {
        new MyCircle(new MyPoint(1, 1), 3);
    }

    @Test
    void getRadius() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.getRadius();
    }

    @Test
    void setRadius() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.setRadius(4);
    }

    @Test
    void getCenter() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.getCenter();
    }

    @Test
    void setCenter() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.setCenter(new MyPoint(0, 0));
    }

    @Test
    void getCenterX() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.getCenterX();
    }

    @Test
    void setCenterX() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.setCenterX(10);
    }

    @Test
    void getCenterY() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.getCenterY();
    }

    @Test
    void setCenterY() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.setCenterY(10);
    }

    @Test
    void getCenterXY() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.getCenterXY();
    }

    @Test
    void setCenterXY() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.setCenterXY(5, 6);
    }

    @Test
    void getArea() {
        MyCircle c = new MyCircle(0, 0, 5);
        c.getArea();
    }

    @Test
    void getCircumference() {
        MyCircle c = new MyCircle(0, 0, 5);
        c.getCircumference();
    }

    @Test
    void distance() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        MyCircle c2 = new MyCircle(3, 4, 1);
        c1.distance(c2);
    }

    @Test
    void testToString() {
        MyCircle c = new MyCircle(2, 3, 5);
        c.toString();
    }
}