package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void constructorVacio() {
        Point2D p = new Point2D();

        assertEquals(0.0f, p.getX());
        assertEquals(0.0f, p.getY());
    }

    @Test
    void constructorConParametros() {
        Point2D p = new Point2D(1.5f, 2.5f);

        assertEquals(1.5f, p.getX());
        assertEquals(2.5f, p.getY());
    }

    @Test
    void settersYGetters() {
        Point2D p = new Point2D();

        p.setX(3.0f);
        p.setY(4.0f);

        assertEquals(3.0f, p.getX());
        assertEquals(4.0f, p.getY());
    }

    @Test
    void setXY() {
        Point2D p = new Point2D();

        p.setXY(5.0f, 6.0f);

        assertEquals(5.0f, p.getX());
        assertEquals(6.0f, p.getY());
    }

    @Test
    void getXY() {
        Point2D p = new Point2D(7.0f, 8.0f);

        float[] xy = p.getXY();

        assertEquals(7.0f, xy[0]);
        assertEquals(8.0f, xy[1]);
    }

    @Test
    void toStringTest() {
        Point2D p = new Point2D(1.0f, 2.0f);

        assertEquals("(1.0,2.0)", p.toString());
    }
}