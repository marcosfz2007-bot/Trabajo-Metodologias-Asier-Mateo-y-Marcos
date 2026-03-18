package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void constructorCompleto() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        assertEquals(1.0f, p.getX());
        assertEquals(2.0f, p.getY());
        assertEquals(4.0f, p.getXSpeed());
        assertEquals(3.0f, p.getYSpeed());
    }

    @Test
    void constructorSoloSpeed() {
        MovablePoint p = new MovablePoint(2.0f, 3.0f);

        assertEquals(2.0f, p.getXSpeed());
        assertEquals(3.0f, p.getYSpeed());
    }

    @Test
    void settersSpeed() {
        MovablePoint p = new MovablePoint();

        p.setXSpeed(5.0f);
        p.setYSpeed(6.0f);

        assertEquals(5.0f, p.getXSpeed());
        assertEquals(6.0f, p.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p = new MovablePoint();

        p.setSpeed(7.0f, 8.0f);

        assertEquals(7.0f, p.getXSpeed());
        assertEquals(8.0f, p.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p = new MovablePoint();
        p.setSpeed(1.0f, 2.0f);

        float[] speed = p.getSpeed();

        assertEquals(1.0f, speed[0]);
        assertEquals(2.0f, speed[1]);
    }

    @Test
    void moveTest() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 1.0f, 1.0f);

        p.move();

        assertEquals(2.0f, p.getX());
        assertEquals(3.0f, p.getY());
    }

    @Test
    void toStringTest() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        assertEquals("(1.0,2.0),speed=(4.0,3.0)", p.toString());
    }
}