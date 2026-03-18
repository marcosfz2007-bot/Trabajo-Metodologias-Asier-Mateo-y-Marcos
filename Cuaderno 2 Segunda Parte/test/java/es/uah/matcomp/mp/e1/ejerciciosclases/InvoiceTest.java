package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class InvoiceTest {

    @Test
    void getId() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getId();
    }

    @Test
    void getCustomer() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getCustomer();
    }

    @Test
    void setCustomer() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.setCustomer(new Customer(2, "Alice", 5));
    }

    @Test
    void getAmount() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getAmount();
    }

    @Test
    void setAmount() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.setAmount(200.0);
    }

    @Test
    void getCustomerId() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getCustomerId();
    }

    @Test
    void getCustomerName() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getCustomerName();
    }

    @Test
    void getCustomerDiscount() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getCustomerDiscount();
    }

    @Test
    void getAmountAfterDiscount() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.getAmountAfterDiscount();
    }

    @Test
    void testToString() {
        Invoice inv = new Invoice(101, new Customer(1, "Bob", 10), 100.0);
        inv.toString();
    }
}