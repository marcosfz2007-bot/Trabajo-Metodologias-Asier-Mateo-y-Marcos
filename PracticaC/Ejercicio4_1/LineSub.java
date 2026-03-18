package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio4_1;

// Clase que usa herencia (menos recomendable en este caso)
public class LineSub extends Point {

    // Solo guarda el punto final
    private Point end;

    // Constructor con coordenadas
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // punto inicial heredado
        this.end = new Point(endX, endY);
    }

    // Constructor con objetos
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    // Representación en texto
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    // Devuelve el punto inicial (heredado)
    public Point getBegin() {
        return new Point(getX(), getY());
    }

    // Devuelve el punto final
    public Point getEnd() {
        return end;
    }

    // Cambia el punto inicial
    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    // Cambia el punto final
    public void setEnd(Point end) {
        this.end = end;
    }

    // Métodos de acceso a coordenadas
    public int getBeginX() { return getX(); }
    public int getBeginY() { return getY(); }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int x) { setX(x); }
    public void setBeginY(int y) { setY(y); }
    public void setBeginXY(int x, int y) { setX(x); setY(y); }

    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    // Longitud
    public int getLength() {
        int dx = getX() - end.getX();
        int dy = getY() - end.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    // Pendiente
    public double getGradient() {
        int dx = end.getX() - getX();
        int dy = end.getY() - getY();
        return Math.atan2(dy, dx);
    }
}
