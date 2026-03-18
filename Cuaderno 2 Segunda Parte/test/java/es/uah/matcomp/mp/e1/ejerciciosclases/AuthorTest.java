package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class AuthorTest {

    @Test
    void getName() {
        Author a = new Author("Ana", "ana@test.com");
        a.getName();
    }

    @Test
    void getEmail() {
        Author a = new Author("Ana", "ana@test.com");
        a.getEmail();
    }

    @Test
    void setEmail() {
        Author a = new Author("Ana", "ana@test.com");
        a.setEmail("new@test.com");
    }

    @Test
    void testToString() {
        Author a = new Author("Ana", "ana@test.com");
        a.toString();
    }
}