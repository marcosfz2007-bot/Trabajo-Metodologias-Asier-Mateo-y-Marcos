package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void constructorVacio() {
        Circle c = new Circle();

        assertEquals(1.0, c.getRadius());
    }

    @Test
    void constructorConRadio() {
        Circle c = new Circle(2.5);

        assertEquals(2.5, c.getRadius());
    }

    @Test
    void constructorCompleto() {
        Circle c = new Circle(2.5, "blue", true);

        assertEquals(2.5, c.getRadius());
        assertEquals("blue", c.getColor());
        assertTrue(c.isFilled());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();

        c.setRadius(3.0);

        assertEquals(3.0, c.getRadius());
    }

    @Test
    void areaYPerimetro() {
        Circle c = new Circle(2.0);

        assertEquals(Math.PI * 4, c.getArea());
        assertEquals(2 * Math.PI * 2, c.getPerimeter());
    }

    @Test
    void toStringTest() {
        Circle c = new Circle(2.5, "blue", true);

        assertEquals(
                "Circle[Shape[color=blue,filled=true],radius=2.5]",
                c.toString()
        );
    }
}