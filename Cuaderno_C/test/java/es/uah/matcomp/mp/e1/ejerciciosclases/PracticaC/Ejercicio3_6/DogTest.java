package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greetsTest() {
        Dog d = new Dog("Rex");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        d.greets();

        assertEquals("Woof\n", out.toString());
    }

    @Test
    void greetsOtroDogTest() {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Buddy");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        d1.greets(d2);

        assertEquals("Woooof\n", out.toString());
    }

    @Test
    void toStringTest() {
        Dog d = new Dog("Rex");

        assertEquals("Dog[Mammal[Animal[name=Rex]]]", d.toString());
    }
}