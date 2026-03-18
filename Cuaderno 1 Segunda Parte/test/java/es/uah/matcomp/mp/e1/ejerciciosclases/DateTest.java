package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(1, 6, 2024);
        date.getDay();
    }

    @Test
    void getMonth() {
        Date date = new Date(1, 6, 2024);
        date.getMonth();
    }

    @Test
    void getYear() {
        Date date = new Date(1, 6, 2024);
        date.getYear();
    }

    @Test
    void setDay() {
        Date date = new Date(1, 6, 2024);
        date.setDay(15);
    }

    @Test
    void setMonth() {
        Date date = new Date(1, 6, 2024);
        date.setMonth(12);
    }

    @Test
    void setYear() {
        Date date = new Date(1, 6, 2024);
        date.setYear(2025);
    }

    @Test
    void setDate() {
        Date date = new Date(1, 6, 2024);
        date.setDate(10, 10, 2025);
    }

    @Test
    void testToString() {
        Date date = new Date(1, 6, 2024);
        date.toString();
    }
}