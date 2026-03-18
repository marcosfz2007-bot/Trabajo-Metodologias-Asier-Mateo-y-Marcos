package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void constructorWithoutQty() {
        Author a = new Author("A", "a@a.com");
        new Book("111", "Title", a, 9.99);
    }

    @Test
    void constructorWithQty() {
        Author a = new Author("A", "a@a.com");
        new Book("222", "T2", a, 5.0, 10);
    }

    @Test
    void getIsbn() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getIsbn();
    }

    @Test
    void getName() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getName();
    }

    @Test
    void getAuthor() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getAuthor();
    }

    @Test
    void getPrice() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getPrice();
    }

    @Test
    void setPrice() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.setPrice(2.5);
    }

    @Test
    void getQty() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getQty();
    }

    @Test
    void setQty() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.setQty(3);
    }

    @Test
    void getAuthorName() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99);
        b.getAuthorName();
    }

    @Test
    void testToString() {
        Author a = new Author("A", "a@a.com");
        Book b = new Book("111", "Title", a, 9.99, 5);
        b.toString();
    }
}