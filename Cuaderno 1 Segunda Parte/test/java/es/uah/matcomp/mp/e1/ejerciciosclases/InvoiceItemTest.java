package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.getId();
    }

    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.getDesc();
    }

    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.getQty();
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.setQty(5);
    }

    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.getUnitPrice();
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.setUnitPrice(899.99);
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.getTotal();
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("I001", "Laptop", 2, 999.99);
        item.toString();
    }
}