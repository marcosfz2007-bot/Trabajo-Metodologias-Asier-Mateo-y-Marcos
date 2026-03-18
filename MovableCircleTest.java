package ejercicio6_4;

// MovableCircle: un círculo que tiene un centro (MovablePoint) y un radio.
// Implementa Movable delegando el movimiento en su centro.
// Esto se llama COMPOSICIÓN: MovableCircle "tiene un" MovablePoint.
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center; // composición: contiene un MovablePoint

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "(" + center.x + ", " + center.y + ") speed=(" + center.xSpeed + ", " + center.ySpeed + "), radius=" + radius;
    }

    // Delegamos el movimiento al centro
    @Override
    public void moveUp()    { center.moveUp(); }

    @Override
    public void moveDown()  { center.moveDown(); }

    @Override
    public void moveLeft()  { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }
}

