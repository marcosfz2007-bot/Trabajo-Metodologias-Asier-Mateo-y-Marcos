package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_3;

// Point3D hereda de Point2D (añade la coordenada z)
public class Point3D extends Point2D {

    // Coordenada z
    private float z = 0.0f;

    // Constructor por defecto (llama al de Point2D)
    public Point3D() {
        super();
    }

    // Constructor con x, y y z
    public Point3D(float x, float y, float z) {
        super(x, y); // inicializa x e y en la superclase
        this.z = z;
    }

    // Devuelve la coordenada z
    public float getZ() {
        return z;
    }

    // Cambia la coordenada z
    public void setZ(float z) {
        this.z = z;
    }

    // Cambia las tres coordenadas a la vez
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);   // usa método heredado de Point2D
        this.z = z;
    }

    // Devuelve las tres coordenadas en un array
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z}; // usa getters heredados
    }

    // Representación en texto del punto 3D
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}