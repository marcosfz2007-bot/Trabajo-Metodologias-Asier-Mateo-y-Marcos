package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructorYGetters() {
        Student s = new Student("Ana", "Toledo", "Computer Science", 2, 1500);

        assertEquals("Ana", s.getName());
        assertEquals("Toledo", s.getAddress());
        assertEquals("Computer Science", s.getProgram());
        assertEquals(2, s.getYear());
        assertEquals(1500, s.getFee());
    }

    @Test
    void setters() {
        Student s = new Student("Ana", "Toledo", "Computer Science", 2, 1500);

        s.setProgram("Math");
        s.setYear(3);
        s.setFee(2000);
        s.setAddress("Madrid");

        assertEquals("Math", s.getProgram());
        assertEquals(3, s.getYear());
        assertEquals(2000, s.getFee());
        assertEquals("Madrid", s.getAddress());
    }

    @Test
    void toStringTest() {
        Student s = new Student("Ana", "Toledo", "Computer Science", 2, 1500);

        assertEquals(
                "Student[Person[name=Ana,address=Toledo],program=Computer Science,year=2,fee=1500.0]",
                s.toString()
        );
    }
}