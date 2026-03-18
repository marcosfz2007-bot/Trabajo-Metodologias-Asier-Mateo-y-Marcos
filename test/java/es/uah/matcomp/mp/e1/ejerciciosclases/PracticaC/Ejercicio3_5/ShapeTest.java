package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void constructorVacio() {
        Shape s = new Shape();

        assertEquals("red", s.getColor());
        assertTrue(s.isFilled());
    }

    @Test
    void constructorConParametros() {
        Shape s = new Shape("green", false);

        assertEquals("green", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void settersYGetters() {
        Shape s = new Shape();

        s.setColor("blue");
        s.setFilled(false);

        assertEquals("blue", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void toStringTest() {
        Shape s = new Shape("green", false);

        assertEquals("Shape[color=green,filled=false]", s.toString());
    }
}