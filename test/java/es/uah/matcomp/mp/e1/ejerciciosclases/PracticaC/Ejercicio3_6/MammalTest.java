package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void constructorYToString() {
        Mammal m = new Mammal("Mammal1");

        assertEquals("Mammal[Animal[name=Mammal1]]", m.toString());
    }
}