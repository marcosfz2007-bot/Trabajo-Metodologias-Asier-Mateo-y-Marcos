package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greetsTest() {
        Cat c = new Cat("Kitty");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        c.greets();

        assertEquals("Meow\n", out.toString());
    }

    @Test
    void toStringTest() {
        Cat c = new Cat("Kitty");

        assertEquals("Cat[Mammal[Animal[name=Kitty]]]", c.toString());
    }
}