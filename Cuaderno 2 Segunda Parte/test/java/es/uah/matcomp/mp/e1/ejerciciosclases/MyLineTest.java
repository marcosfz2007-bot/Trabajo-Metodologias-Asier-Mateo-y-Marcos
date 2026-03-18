package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class MyLineTest {

    @Test
    void constructorCoords() {
        new MyLine(0, 0, 3, 4);
    }

    @Test
    void constructorPoints() {
        new MyLine(new MyPoint(1, 2), new MyPoint(4, 6));
    }

    @Test
    void getBegin() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getBegin();
    }

    @Test
    void setBegin() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setBegin(new MyPoint(1, 1));
    }

    @Test
    void getBeginX() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getBeginX();
    }

    @Test
    void setBeginX() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setBeginX(2);
    }

    @Test
    void getBeginY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getBeginY();
    }

    @Test
    void setBeginY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setBeginY(2);
    }

    @Test
    void getBeginXY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getBeginXY();
    }

    @Test
    void setBeginXY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setBeginXY(1, 2);
    }

    @Test
    void getEnd() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getEnd();
    }

    @Test
    void setEnd() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setEnd(new MyPoint(5, 5));
    }

    @Test
    void getEndX() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getEndX();
    }

    @Test
    void setEndX() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setEndX(5);
    }

    @Test
    void getEndY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getEndY();
    }

    @Test
    void setEndY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setEndY(5);
    }

    @Test
    void getEndXY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getEndXY();
    }

    @Test
    void setEndXY() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.setEndXY(4, 5);
    }

    @Test
    void getLength() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.getLength();
    }

    @Test
    void getGradient() {
        MyLine l = new MyLine(0, 0, 1, 1);
        l.getGradient();
    }

    @Test
    void testToString() {
        MyLine l = new MyLine(0, 0, 3, 4);
        l.toString();
    }
}