package ejercicio6_3;



import org.junit.jupiter.api.Test;

class MovablePointTest {

    @Test
    void constructor() {
        new MovablePoint(0, 0, 2, 3);
    }

    @Test
    void moveUp() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveUp();
    }

    @Test
    void moveDown() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveDown();
    }

    @Test
    void moveLeft() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveLeft();
    }

    @Test
    void moveRight() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveRight();
    }

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.toString();
    }
}