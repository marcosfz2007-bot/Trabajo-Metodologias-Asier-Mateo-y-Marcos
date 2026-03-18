package ejercicio6_6;

// Superclase abstracta Animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // Método abstracto: cada animal saluda a su manera
    public abstract void greets();
}

