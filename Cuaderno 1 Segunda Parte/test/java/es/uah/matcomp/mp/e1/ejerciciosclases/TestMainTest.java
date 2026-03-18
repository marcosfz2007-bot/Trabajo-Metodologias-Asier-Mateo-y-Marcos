package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class TestMainTest {

    @Test
    void main() {
        String[] args = {};
        TestMain.main(args);
    }

    @Test
    void testCircle() {
        TestMain.testCircle();
    }

    @Test
    void testRectangle() {
        TestMain.testRectangle();
    }

    @Test
    void testEmployee() {
        TestMain.testEmployee();
    }

    @Test
    void testInvoiceItem() {
        TestMain.testInvoiceItem();
    }

    @Test
    void testAccount() {
        TestMain.testAccount();
    }

    @Test
    void testDate() {
        TestMain.testDate();
    }

    @Test
    void testTime() {
        TestMain.testTime();
    }

    @Test
    void testBall() {
        TestMain.testBall();
    }

    @Test
    void testBallNoBounce() {
        // Llamamos testBall() normal
        TestMain.testBall();

        // Simulamos manualmente un caso donde la pelota NO choca con ninguna pared
        Ball ball = new Ball(50.0f, 25.0f, 5, 1.0f, 1.0f);
        ball.move(); // x=51, y=26 → no choca con nada → ambos if son false
    }
}