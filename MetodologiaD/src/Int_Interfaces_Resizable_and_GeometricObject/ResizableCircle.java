package Int_Interfaces_Resizable_and_GeometricObject;

public class ResizableCircle extends Circle implements Resizable {

    ResizableCircle(double radius) {
        super((radius));
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[Circle[radius=%d]]", this.radius);
    }

    @Override
    public void resize(int percent) {
        this.radius *=percent/100.0;
    }

}
