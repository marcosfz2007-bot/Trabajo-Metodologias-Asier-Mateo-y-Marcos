package ejercicio6_6;

// Cat: saluda con "Meow"
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}

