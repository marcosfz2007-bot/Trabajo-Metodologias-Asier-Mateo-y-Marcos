public class Circle {
    // Atributos privados (no se pueden usar directamente desde fuera de la clase)
    private double radius = 1.0;
    private String color = "red";
    // ── CONSTRUCTORES (sobrecargados) ─────────────────────────────────────────
    // Constructor 1: sin argumentos → valores por defecto
    public Circle() {
        this.radius = 1.0;   // Punto 5: "this" diferencia el atributo del parámetro
        this.color  = "red";
    }
    // Constructor 2: solo radio
    public Circle(double radius) {
        this.radius = radius;
        this.color  = "red";
    }
    // Constructor 3 (Punto 1): radio Y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color  = color;
    }
    // ── GETTERS (Punto 2) ─────────────────────────────────────────────────────
    // Métodos públicos para leer los atributos privados
    public double getRadius() {
        return radius;
    }
    public String getColor() {   // getter para color
        return color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    // ── SETTERS (Punto 4) ─────────────────────────────────────────────────────
    // Métodos públicos para MODIFICAR los atributos privados
    public void setRadius(double radius) {
        this.radius = radius;  // "this.radius" → atributo del objeto | "radius" → parámetro del método
    }
    public void setColor(String color) {
        this.color = color;    // "this.color" → atributo del objeto | "color" → parámetro del método
    }
    // ── toString (Punto 6) ────────────────────────────────────────────────────
    // Devuelve una descripción del objeto en texto
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
