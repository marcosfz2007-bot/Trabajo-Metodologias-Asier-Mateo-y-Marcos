package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void constructorVacio() {
        Rectangle r = new Rectangle();

        assertEquals(1.0, r.getWidth());
        assertEquals(1.0, r.getLength());
    }

    @Test
    void constructorConParametros() {
        Rectangle r = new Rectangle(3.0, 4.0);

        assertEquals(3.0, r.getWidth());
        assertEquals(4.0, r.getLength());
    }

    @Test
    void constructorCompleto() {
        Rectangle r = new Rectangle(3.0, 4.0, "yellow", true);

        assertEquals(3.0, r.getWidth());
        assertEquals(4.0, r.getLength());
        assertEquals("yellow", r.getColor());
        assertTrue(r.isFilled());
    }

    @Test
    void settersYGetters() {
        Rectangle r = new Rectangle();

        r.setWidth(5.0);
        r.setLength(6.0);

        assertEquals(5.0, r.getWidth());
        assertEquals(6.0, r.getLength());
    }

    @Test
    void areaYPerimetro() {
        Rectangle r = new Rectangle(3.0, 4.0);

        assertEquals(12.0, r.getArea());
        assertEquals(14.0, r.getPerimeter());
    }

    @Test
    void toStringTest() {
        Rectangle r = new Rectangle(3.0, 4.0, "yellow", true);

        assertEquals(
                "Rectangle[Shape[color=yellow,filled=true],width=3.0,length=4.0]",
                r.toString()
        );
    }
}