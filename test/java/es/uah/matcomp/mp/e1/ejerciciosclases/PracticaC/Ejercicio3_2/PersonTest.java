package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void constructorYGetters() {
        Person p = new Person("Juan", "Madrid");

        assertEquals("Juan", p.getName());
        assertEquals("Madrid", p.getAddress());
    }

    @Test
    void setAddress() {
        Person p = new Person("Juan", "Madrid");

        p.setAddress("Toledo");

        assertEquals("Toledo", p.getAddress());
    }

    @Test
    void toStringTest() {
        Person p = new Person("Juan", "Madrid");

        assertEquals("Person[name=Juan,address=Madrid]", p.toString());
    }
}