package es.uah.matcomp.mp.e1.ejerciciosclases.Customer2;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(2, "Alice", 'f');
        c.getId();
    }

    @Test
    void getName() {
        Customer c = new Customer(2, "Alice", 'f');
        c.getName();
    }

    @Test
    void getGender() {
        Customer c = new Customer(2, "Alice", 'f');
        c.getGender();
    }

    @Test
    void testToString() {
        Customer c = new Customer(2, "Alice", 'f');
        c.toString();
    }
}