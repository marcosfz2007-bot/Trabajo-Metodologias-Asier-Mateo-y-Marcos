package ejercicio6_6;

// Dog: tiene dos versiones de greets (sobrecarga de métodos)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Sobrecarga: cuando saluda a otro perro, el saludo es distinto
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}

