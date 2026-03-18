package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Customer2.Customer;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void constructorWithBalance() {
        new Account(10, new Customer(1, "Luis", 'm'), 500.0);
    }

    @Test
    void constructorWithoutBalance() {
        new Account(10, new Customer(1, "Luis", 'm'));
    }

    @Test
    void getId() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 500.0);
        acc.getId();
    }

    @Test
    void getCustomer() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 500.0);
        acc.getCustomer();
    }

    @Test
    void getBalance() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 500.0);
        acc.getBalance();
    }

    @Test
    void setBalance() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 500.0);
        acc.setBalance(300.0);
    }

    @Test
    void getCustomerName() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 500.0);
        acc.getCustomerName();
    }

    @Test
    void deposit() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 100.0);
        acc.deposit(50.0);
    }

    @Test
    void withdraw() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 200.0);
        acc.withdraw(100.0);   // fondos suficientes → rama if
        acc.withdraw(99999.0); // fondos insuficientes → rama else
    }

    @Test
    void testToString() {
        Account acc = new Account(10, new Customer(1, "Luis", 'm'), 100.0);
        acc.toString();
    }
}