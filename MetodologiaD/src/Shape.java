public abstract class Shape {

    protected String color = "red";
    protected Boolean filled = true;

    Shape () {

    }


    Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        this.filled = filled;
        return false;
    }
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return  String.format("Shape[color=Xs, filled=Xo", this.color,this.filled);
    }
}
