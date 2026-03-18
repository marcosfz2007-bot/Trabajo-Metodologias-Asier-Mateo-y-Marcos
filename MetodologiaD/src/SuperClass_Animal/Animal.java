package SuperClass_Animal;

abstract public class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void greets();
}

