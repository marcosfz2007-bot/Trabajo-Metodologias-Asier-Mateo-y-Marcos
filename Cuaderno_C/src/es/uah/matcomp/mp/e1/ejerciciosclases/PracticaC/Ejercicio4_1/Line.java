package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

// Clase Line: una línea se compone de dos puntos
public class Line {

    // Punto inicial y final
    private Point begin;
    private Point end;

    // Constructor con objetos Point
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor con coordenadas
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    // Representación en texto
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }

    // Devuelve el punto inicial
    public Point getBegin() {
        return begin;
    }

    // Devuelve el punto final
    public Point getEnd() {
        return end;
    }

    // Cambia el punto inicial
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    // Cambia el punto final
    public void setEnd(Point end) {
        this.end = end;
    }

    // Devuelve coordenadas del inicio
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    // Devuelve coordenadas del final
    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Cambia coordenadas del inicio
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Cambia coordenadas del final
    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Calcula la longitud de la línea
    public int getLength() {
        int dx = begin.getX() - end.getX();
        int dy = begin.getY() - end.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    // Calcula la pendiente en radianes
    public double getGradient() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return Math.atan2(dy, dx);
    }
}