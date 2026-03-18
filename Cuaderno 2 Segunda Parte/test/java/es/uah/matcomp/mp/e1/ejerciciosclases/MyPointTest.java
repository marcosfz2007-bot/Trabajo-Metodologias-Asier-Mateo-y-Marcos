package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class MyPointTest {

    @Test
    void defaultConstructor() {
        new MyPoint();
    }

    @Test
    void paramConstructor() {
        new MyPoint(3, 4);
    }

    @Test
    void getX() {
        MyPoint p = new MyPoint(3, 4);
        p.getX();
    }

    @Test
    void setX() {
        MyPoint p = new MyPoint(3, 4);
        p.setX(5);
    }

    @Test
    void getY() {
        MyPoint p = new MyPoint(3, 4);
        p.getY();
    }

    @Test
    void setY() {
        MyPoint p = new MyPoint(3, 4);
        p.setY(7);
    }

    @Test
    void getXY() {
        MyPoint p = new MyPoint(3, 4);
        p.getXY();
    }

    @Test
    void setXY() {
        MyPoint p = new MyPoint(3, 4);
        p.setXY(2, 9);
    }

    @Test
    void testToString() {
        MyPoint p = new MyPoint(3, 4);
        p.toString();
    }

    @Test
    void distanceCoords() {
        MyPoint p = new MyPoint(0, 0);
        p.distance(3, 4);
    }

    @Test
    void distanceMyPoint() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        p1.distance(p2);
    }

    @Test
    void distanceOrigin() {
        MyPoint p = new MyPoint(3, 4);
        p.distance();
    }
}