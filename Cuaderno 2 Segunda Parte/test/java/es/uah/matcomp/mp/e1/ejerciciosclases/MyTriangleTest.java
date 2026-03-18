package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class MyTriangleTest {

    @Test
    void constructorCoords() {
        new MyTriangle(0, 0, 3, 0, 0, 4);
    }

    @Test
    void constructorPoints() {
        new MyTriangle(new MyPoint(0, 0), new MyPoint(1, 0), new MyPoint(0, 1));
    }

    @Test
    void testToString() {
        MyTriangle t = new MyTriangle(0, 0, 3, 0, 0, 4);
        t.toString();
    }

    @Test
    void getPerimeter() {
        MyTriangle t = new MyTriangle(0, 0, 3, 0, 0, 4);
        t.getPerimeter();
    }

    @Test
    void getTypeScalene() {
        // a != b, b != c, a != c  →  rama "Scalene"
        MyTriangle t = new MyTriangle(0, 0, 3, 0, 0, 4);
        t.getType();
    }

    @Test
    void getTypeIsoscelesAB() {
        // a == b pero a != c  →  primera sub-rama del ||  (a==b)
        // (0,0)(0,1)(0,2): a=1, b=1, c=2
        MyTriangle t = new MyTriangle(0, 0, 0, 1, 0, 2);
        t.getType();
    }

    @Test
    void getTypeIsoscelesBC() {
        // a != b, b == c  →  segunda sub-rama del ||  (b==c)
        // (0,0)(0,2)(0,1): a=2, b=1, c=1
        MyTriangle t = new MyTriangle(0, 0, 0, 2, 0, 1);
        t.getType();
    }

    @Test
    void getTypeIsoscelesAC() {
        // a != b, b != c, a == c  →  tercera sub-rama del ||  (a==c)
        // (0,0)(1,0)(0,1): a=1, b=sqrt(2), c=1
        MyTriangle t = new MyTriangle(0, 0, 1, 0, 0, 1);
        t.getType();
    }
}