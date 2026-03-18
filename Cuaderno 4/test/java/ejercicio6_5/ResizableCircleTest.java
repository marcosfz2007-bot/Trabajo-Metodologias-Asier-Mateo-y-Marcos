package ejercicio6_5;



import org.junit.jupiter.api.Test;

class ResizableCircleTest {

    @Test
    void constructor() {
        new ResizableCircle(5.0);
    }

    @Test
    void resize() {
        ResizableCircle rc = new ResizableCircle(5.0);
        rc.resize(50);
    }

    @Test
    void getArea() {
        ResizableCircle rc = new ResizableCircle(5.0);
        rc.getArea();
    }

    @Test
    void getPerimeter() {
        ResizableCircle rc = new ResizableCircle(5.0);
        rc.getPerimeter();
    }

    @Test
    void testToString() {
        ResizableCircle rc = new ResizableCircle(5.0);
        rc.toString();
    }
}