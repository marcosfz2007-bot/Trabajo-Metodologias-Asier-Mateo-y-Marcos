package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_4;

public class TestMovablePoint {

    public static void main(String[] args) {

        // Crea un punto con posición (1,2) y velocidad (4,3)
        MovablePoint p = new MovablePoint(1.0f,2.0f,3.0f,4.0f);

        // Muestra el punto inicial
        System.out.println(p);

        // Mueve el punto según su velocidad
        p.move();
        System.out.println("After move: " + p);

        // Cambia la velocidad a (1,1)
        p.setSpeed(1.0f,1.0f);

        // Vuelve a mover el punto
        p.move();
        System.out.println("After second move: " + p);
    }
}
