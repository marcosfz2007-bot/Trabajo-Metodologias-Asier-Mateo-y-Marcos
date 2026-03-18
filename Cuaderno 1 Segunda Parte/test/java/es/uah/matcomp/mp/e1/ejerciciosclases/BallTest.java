package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.getX();
    }

    @Test
    void setX() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.setX(3.0f);
    }

    @Test
    void getY() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.getY();
    }

    @Test
    void setY() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.setY(4.0f);
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.getRadius();
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.setRadius(10);
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.getXDelta();
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.setXDelta(1.0f);
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.getYDelta();
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.setYDelta(1.0f);
    }

    @Test
    void move() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.move();
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.reflectHorizontal();
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.reflectVertical();
    }

    @Test
    void testToString() {
        Ball ball = new Ball(1.0f, 2.0f, 5, 0.5f, 0.5f);
        ball.toString();
    }
}