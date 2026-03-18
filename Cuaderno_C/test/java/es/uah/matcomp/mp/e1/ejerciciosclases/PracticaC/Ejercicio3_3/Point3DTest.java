package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void constructorVacio() {
        Point3D p = new Point3D();

        assertEquals(0.0f, p.getX());
        assertEquals(0.0f, p.getY());
        assertEquals(0.0f, p.getZ());
    }

    @Test
    void constructorConParametros() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        assertEquals(1.0f, p.getX());
        assertEquals(2.0f, p.getY());
        assertEquals(3.0f, p.getZ());
    }

    @Test
    void setZ() {
        Point3D p = new Point3D();

        p.setZ(5.0f);

        assertEquals(5.0f, p.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p = new Point3D();

        p.setXYZ(6.0f, 7.0f, 8.0f);

        assertEquals(6.0f, p.getX());
        assertEquals(7.0f, p.getY());
        assertEquals(8.0f, p.getZ());
    }

    @Test
    void getXYZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        float[] xyz = p.getXYZ();

        assertEquals(1.0f, xyz[0]);
        assertEquals(2.0f, xyz[1]);
        assertEquals(3.0f, xyz[2]);
    }

    @Test
    void toStringTest() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        assertEquals("(1.0,2.0,3.0)", p.toString());
    }
}