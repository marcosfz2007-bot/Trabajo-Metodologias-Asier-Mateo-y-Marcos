package ejercicio6_5;// Una clase puede implementar MÚLTIPLES interfaces a la vez.
// Aquí ResizableCircle extiende Circle (herencia) e implementa Resizable (interfaz).

// ResizableCircle hereda de CircleBase e implementa además Resizable
class ResizableCircle extends CircleBase implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    // radius *= percent / 100.0  (si percent=50, el radio se reduce a la mitad)
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }
}

