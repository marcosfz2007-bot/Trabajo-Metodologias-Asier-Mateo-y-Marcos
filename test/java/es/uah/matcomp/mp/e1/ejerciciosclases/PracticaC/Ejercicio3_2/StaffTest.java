package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void constructorYGetters() {
        Staff st = new Staff("Luis", "Alcalá", "Engineering", 3000);

        assertEquals("Luis", st.getName());
        assertEquals("Alcalá", st.getAddress());
        assertEquals("Engineering", st.getSchool());
        assertEquals(3000, st.getPay());
    }

    @Test
    void setters() {
        Staff st = new Staff("Luis", "Alcalá", "Engineering", 3000);

        st.setSchool("Science");
        st.setPay(3500);
        st.setAddress("Madrid");

        assertEquals("Science", st.getSchool());
        assertEquals(3500, st.getPay());
        assertEquals("Madrid", st.getAddress());
    }

    @Test
    void toStringTest() {
        Staff st = new Staff("Luis", "Alcalá", "Engineering", 3000);

        assertEquals(
                "Staff[Person[name=Luis,address=Alcalá],school=Engineering,pay=3000.0]",
                st.toString()
        );
    }
}