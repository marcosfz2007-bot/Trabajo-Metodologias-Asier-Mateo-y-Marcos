public class Square extends Rectangle {

    protected double side;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    Square (double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
}





