package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

public class TestLineSub {
    public static void main(String[] args) {

        // Crea línea con herencia
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        // Muestra longitud y pendiente
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient: " + l1.getGradient());
    }
}
