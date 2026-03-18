package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_3;

public class TestPoint {

    public static void main(String[] args) {

        // Crea un punto 2D con coordenadas (3.5, 4.5)
        Point2D p2 = new Point2D(3.5f, 4.5f);
        System.out.println(p2); // usa toString → "(3.5,4.5)"

        // Obtiene las coordenadas en un array
        float[] xy = p2.getXY();
        System.out.println(xy[0] + "," + xy[1]); // imprime x,y

        // Crea un punto 3D (hereda de Point2D)
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3); // "(1.0,2.0,3.0)"

        // Cambia las tres coordenadas a la vez
        p3.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println(p3); // "(7.0,8.0,9.0)"

        // Obtiene las tres coordenadas en un array
        float[] xyz = p3.getXYZ();
        System.out.println(xyz[0] + "," + xyz[1] + "," + xyz[2]); // imprime x,y,z
    }
}