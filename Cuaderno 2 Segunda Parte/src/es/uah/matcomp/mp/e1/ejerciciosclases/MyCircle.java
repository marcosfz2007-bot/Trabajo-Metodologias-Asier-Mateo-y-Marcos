package es.uah.matcomp.mp.e1.ejerciciosclases;

public class MyCircle {

    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    // Constructor por defecto → centro (0,0), radio 1
    public MyCircle() {}

    // Constructor con coordenadas del centro y radio
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor con MyPoint y radio
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // --- Radio ---
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    // --- Centro ---
    public MyPoint getCenter() { return center; }
    public void setCenter(MyPoint center) { this.center = center; }

    public int getCenterX() { return center.getX(); }
    public void setCenterX(int x) { center.setX(x); }

    public int getCenterY() { return center.getY(); }
    public void setCenterY(int y) { center.setY(y); }

    public int[] getCenterXY() { return center.getXY(); }
    public void setCenterXY(int x, int y) { center.setXY(x, y); }

    // Área: π·r²
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Circunferencia: 2·π·r
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Distancia entre centros — reutiliza distance() de MyPoint
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

    // Formato: "MyCircle[radius=r,center=(x,y)]"
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }
}