package ejercicio6_6;



import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void constructor() {
        new Cat("Misi");
    }

    @Test
    void getName() {
        Cat c = new Cat("Misi");
        c.getName();
    }

    @Test
    void greets() {
        Cat c = new Cat("Misi");
        c.greets();
    }
}