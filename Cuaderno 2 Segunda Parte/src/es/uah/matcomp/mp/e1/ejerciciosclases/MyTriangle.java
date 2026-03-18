package es.uah.matcomp.mp.e1.ejerciciosclases;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructor con 6 coordenadas
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Constructor con tres MyPoint
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Formato: "MyTriangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]"
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    // Perímetro — reutiliza distance() de MyPoint
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    // Tipo: "Equilateral", "Isosceles" o "Scalene"
    public String getType() {

        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        if (a == b && b == c) {
            return "Equilateral";
        }

        if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        return "Scalene";
    }
}