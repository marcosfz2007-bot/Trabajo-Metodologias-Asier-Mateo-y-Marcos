package ejercicio6_5;// Una clase puede implementar MÚLTIPLES interfaces a la vez.
// Aquí ResizableCircle extiende Circle (herencia) e implementa Resizable (interfaz).

public class TestResizable {
    public static void main(String[] args) {
        // Prueba de Circle normal
        CircleBase c = new CircleBase(5.0);
        System.out.println(c);
        System.out.println("Área: " + c.getArea());
        System.out.println("Perímetro: " + c.getPerimeter());

        // Prueba de ResizableCircle
        ResizableCircle rc = new ResizableCircle(5.0);
        System.out.println("\nAntes de resize: " + rc);

        rc.resize(50);  // radio se reduce al 50%
        System.out.println("Tras resize(50): " + rc);

        rc.resize(200); // radio se dobla
        System.out.println("Tras resize(200): " + rc);
    }
}
