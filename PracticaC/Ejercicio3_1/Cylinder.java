package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this.height= 1.0;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        this.height = h;
    }

    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
