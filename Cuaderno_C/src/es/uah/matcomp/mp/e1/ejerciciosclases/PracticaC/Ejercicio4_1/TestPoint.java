package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

public class TestPoint {
    public static void main(String[] args) {

        // Crea un punto (10,20)
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Cambia el punto a (100,10)
        p1.setXY(100, 10);
        System.out.println(p1);
    }
}
