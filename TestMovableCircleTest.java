package ejercicio6_4;

// MovablePoint: un punto con posición (x,y) y velocidad (xSpeed, ySpeed)
// El ~ en el diagrama indica acceso de paquete (sin modificador explícito)
public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // Implementamos los 4 métodos de la interfaz Movable
    @Override
    public void moveUp()    { y -= ySpeed; }

    @Override
    public void moveDown()  { y += ySpeed; }

    @Override
    public void moveLeft()  { x -= xSpeed; }

    @Override
    public void moveRight() { x += xSpeed; }
}

