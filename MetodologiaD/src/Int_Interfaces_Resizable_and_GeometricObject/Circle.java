package Int_Interfaces_Resizable_and_GeometricObject;

public class Circle implements GeometricObject {

    protected double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%d]", this.radius);
    }
    @Override
    public double getPerimeter() {
        return 2*(Math.PI*(this.radius));
    }
    @Override
    public double getArea(){
        return Math.PI*(Math.pow(this.radius, 2));
    }
}
