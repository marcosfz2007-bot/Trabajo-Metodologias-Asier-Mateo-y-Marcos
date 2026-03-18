package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void constructorVacio() {
        Square s = new Square();

        assertEquals(1.0, s.getWidth());
        assertEquals(1.0, s.getLength());
    }

    @Test
    void constructorConSide() {
        Square s = new Square(5.0);

        assertEquals(5.0, s.getSide());
        assertEquals(5.0, s.getWidth());
        assertEquals(5.0, s.getLength());
    }

    @Test
    void constructorCompleto() {
        Square s = new Square(5.0, "black", true);

        assertEquals(5.0, s.getSide());
        assertEquals("black", s.getColor());
        assertTrue(s.isFilled());
    }

    @Test
    void setSide() {
        Square s = new Square();

        s.setSide(7.0);

        assertEquals(7.0, s.getSide());
        assertEquals(7.0, s.getWidth());
        assertEquals(7.0, s.getLength());
    }

    @Test
    void setWidth() {
        Square s = new Square();

        s.setWidth(8.0);

        assertEquals(8.0, s.getSide());
        assertEquals(8.0, s.getWidth());
        assertEquals(8.0, s.getLength());
    }

    @Test
    void setLength() {
        Square s = new Square();

        s.setLength(9.0);

        assertEquals(9.0, s.getSide());
        assertEquals(9.0, s.getWidth());
        assertEquals(9.0, s.getLength());
    }

    @Test
    void toStringTest() {
        Square s = new Square(5.0, "black", true);

        assertEquals(
                "Square[Rectangle[Shape[color=black,filled=true],width=5.0,length=5.0]]",
                s.toString()
        );
    }
}