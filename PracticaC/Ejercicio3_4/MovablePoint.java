package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_4;

// MovablePoint hereda de Point y añade velocidad
public class MovablePoint extends Point {

    // Velocidad en cada eje
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    // Constructor con posición y velocidad
    public MovablePoint(float x, float y, float ySpeed, float xSpeed) {
        super(x, y); // inicializa x e y en Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor solo con velocidad
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor por defecto
    public MovablePoint(){
        super(); // llama al constructor de Point
    }

    // Devuelve velocidad en x
    public float getXSpeed() {
        return xSpeed;
    }

    // Devuelve velocidad en y
    public float getYSpeed() {
        return ySpeed;
    }

    // Cambia velocidad en x
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Cambia velocidad en y
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Cambia ambas velocidades
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Devuelve las velocidades en un array
    public float[] getSpeed(){
        return new float[] {xSpeed, ySpeed};
    }

    // Representación en texto (añade la velocidad al Point)
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Mueve el punto según su velocidad
    public MovablePoint move(){
        setX(getX() + xSpeed); // usa getters/setters heredados
        setY(getY() + ySpeed);
        return this; // devuelve el propio objeto (encadenable)
    }
}