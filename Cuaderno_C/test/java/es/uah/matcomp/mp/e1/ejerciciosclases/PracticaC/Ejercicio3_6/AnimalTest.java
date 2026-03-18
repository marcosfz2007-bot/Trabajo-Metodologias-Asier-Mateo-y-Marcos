package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void constructorYToString() {
        Animal a = new Animal("Animal1");

        assertEquals("Animal[name=Animal1]", a.toString());
    }
}