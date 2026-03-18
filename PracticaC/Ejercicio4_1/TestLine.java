package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

public class TestLine {
    public static void main(String[] args) {

        // Crea línea con coordenadas
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        // Crea puntos
        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 6);

        // Crea línea con objetos
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }
}
