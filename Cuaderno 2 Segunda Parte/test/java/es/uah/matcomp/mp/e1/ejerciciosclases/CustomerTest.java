package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(1, "Bob", 10);
        c.getId();
    }

    @Test
    void getName() {
        Customer c = new Customer(1, "Bob", 10);
        c.getName();
    }

    @Test
    void getDiscount() {
        Customer c = new Customer(1, "Bob", 10);
        c.getDiscount();
    }

    @Test
    void setDiscount() {
        Customer c = new Customer(1, "Bob", 10);
        c.setDiscount(20);
    }

    @Test
    void testToString() {
        Customer c = new Customer(1, "Bob", 10);
        c.toString();
    }
}