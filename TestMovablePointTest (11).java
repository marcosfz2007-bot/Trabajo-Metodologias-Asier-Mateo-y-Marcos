package ejercicio6_4;

class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Inicial: " + mc);

        mc.moveRight();
        System.out.println("Tras moveRight: " + mc);

        mc.moveDown();
        System.out.println("Tras moveDown: " + mc);

        // Podemos usar la variable de tipo Movable (polimorfismo con interfaz)
        Movable m = new MovablePoint(10, 10, 3, 3);
        m.moveLeft();
        System.out.println("MovablePoint tras moveLeft: " + m);
    }
}
