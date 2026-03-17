public class Main {
    public static void main(String[] args) {
        // ── PUNTO 1: Constructor con radio Y color ────────────────────────────
        System.out.println("=== Punto 1: Tercer constructor (radio + color) ===");
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Radio: " + c3.getRadius() + " | Color: " + c3.getColor());
        // ── PUNTO 2: Getter de color ──────────────────────────────────────────
        System.out.println("\n=== Punto 2: Getter getColor() ===");
        Circle c2 = new Circle(2.0);
        System.out.println("Color por defecto: " + c2.getColor());
        // ── PUNTO 3: public vs private ────────────────────────────────────────
        // Al declarar el atributo radius como private,Java restringe su acceso únicamente
        // al código interno de la propia clase Circle, impidiendo que otras clases puedan leerlo
        // o modificarlo directamente. Si se intenta acceder desde TestCircle, dará error.
        // ── PUNTO 4: Setters ──────────────────────────────────────────────────
        System.out.println("\n=== Punto 4: Setters ===");
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("green");
        System.out.println("radius: " + c4.getRadius() + " | color: " + c4.getColor());
        // ── PUNTO 5: Keyword "this" ───────────────────────────────────────────
        // "this" se usa dentro de la clase Circle para referirse al
        // atributo del objeto cuando existe un parámetro con el mismo nombre.
        // Puedes ver esto en los constructores de Circle.java.
        System.out.println("\n=== Punto 5: 'this' (ver código en Circle.java) ===");
        Circle c5 = new Circle(7.0, "yellow");
        System.out.println("Creado con this: " + c5.getRadius() + " | " + c5.getColor());
        // ── PUNTO 6: toString() ───────────────────────────────────────────────
        System.out.println("\n=== Punto 6: toString() ===");
        Circle c6a = new Circle(5.5);
        System.out.println(c6a.toString());   // llamada explícita
        Circle c6b = new Circle(6.6);
        System.out.println(c6b);              // llamada implícita (Java llama toString sola)
        System.out.println("Operador + también llama toString: " + c6b);
    }
}