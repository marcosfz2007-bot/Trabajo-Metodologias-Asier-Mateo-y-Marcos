package ejercicio6_6;



import org.junit.jupiter.api.Test;

class DogTest {

    @Test
    void constructor() {
        new Dog("Rex");
    }

    @Test
    void getName() {
        Dog d = new Dog("Rex");
        d.getName();
    }

    @Test
    void greets() {
        Dog d = new Dog("Rex");
        d.greets();
    }

    @Test
    void greetsDog() {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Buddy");
        d1.greets(d2);
    }
}