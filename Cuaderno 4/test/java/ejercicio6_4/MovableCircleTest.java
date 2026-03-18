package ejercicio6_4;



import org.junit.jupiter.api.Test;

class MovableCircleTest {

    @Test
    void constructor() {
        new MovableCircle(0, 0, 1, 1, 5);
    }

    @Test
    void moveUp() {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        mc.moveUp();
    }

    @Test
    void moveDown() {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        mc.moveDown();
    }

    @Test
    void moveLeft() {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        mc.moveLeft();
    }

    @Test
    void moveRight() {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        mc.moveRight();
    }

    @Test
    void testToString() {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        mc.toString();
    }
}