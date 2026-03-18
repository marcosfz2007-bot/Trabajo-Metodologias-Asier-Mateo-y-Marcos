package es.uah.matcomp.mp.e1.ejerciciosclases;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Account account = new Account("001", "Alice");
        account.getId();
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account account = new Account("001", "Alice");
        account.getName();
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        Account account = new Account("001", "Alice", 500);
        account.getBalance();
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account account = new Account("001", "Alice", 100);
        account.credit(50);
    }

    @org.junit.jupiter.api.Test
    void debit() {
        Account account = new Account("001", "Alice", 100);
        account.debit(40);   // rama if (amount <= balance)
        account.debit(999);  // rama else (amount > balance)
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        Account sender = new Account("001", "Alice", 200);
        Account receiver = new Account("002", "Bob", 0);
        sender.transferTo(receiver, 100);  // rama if
        sender.transferTo(receiver, 999);  // rama else
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Account account = new Account("001", "Alice", 100);
        account.toString();
    }
}