package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(10, 30, 45);
        time.getHour();
    }

    @Test
    void getMinute() {
        Time time = new Time(10, 30, 45);
        time.getMinute();
    }

    @Test
    void getSecond() {
        Time time = new Time(10, 30, 45);
        time.getSecond();
    }

    @Test
    void setHour() {
        Time time = new Time(10, 30, 45);
        time.setHour(12);
    }

    @Test
    void setMinute() {
        Time time = new Time(10, 30, 45);
        time.setMinute(0);
    }

    @Test
    void setSecond() {
        Time time = new Time(10, 30, 45);
        time.setSecond(0);
    }

    @Test
    void setTime() {
        Time time = new Time(10, 30, 45);
        time.setTime(11, 0, 0);
    }

    @Test
    void testToString() {
        Time time = new Time(10, 30, 45);
        time.toString();
    }

    @Test
    void nextSecond() {
        // Caso normal
        new Time(10, 30, 45).nextSecond();
        // second llega a 60 → minute sube
        new Time(10, 30, 59).nextSecond();
        // minute llega a 60 → hour sube
        new Time(10, 59, 59).nextSecond();
        // hour llega a 24 → reset a 0
        new Time(23, 59, 59).nextSecond();
    }

    @Test
    void previousSecond() {
        // Caso normal
        new Time(10, 30, 45).previousSecond();
        // second llega a -1 → minute baja
        new Time(10, 30, 0).previousSecond();
        // minute llega a -1 → hour baja
        new Time(10, 0, 0).previousSecond();
        // hour llega a -1 → reset a 23
        new Time(0, 0, 0).previousSecond();
    }
}