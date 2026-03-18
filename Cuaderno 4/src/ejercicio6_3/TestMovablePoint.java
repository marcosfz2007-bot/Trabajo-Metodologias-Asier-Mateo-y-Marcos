package ejercicio6_3;

class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Inicial: " + p);

        p.moveRight();
        System.out.println("Tras moveRight: " + p); // x=2

        p.moveDown();
        System.out.println("Tras moveDown: " + p);  // y=3

        p.moveLeft();
        System.out.println("Tras moveLeft: " + p);  // x=0

        p.moveUp();
        System.out.println("Tras moveUp: " + p);    // y=0
    }
}
