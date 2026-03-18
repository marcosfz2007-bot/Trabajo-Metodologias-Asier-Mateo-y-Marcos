package ejercicio6_6;



import org.junit.jupiter.api.Test;

class BigDogTest {

    @Test
    void constructor() {
        new BigDog("Goliath");
    }

    @Test
    void getName() {
        BigDog bd = new BigDog("Goliath");
        bd.getName();
    }

    @Test
    void greets() {
        BigDog bd = new BigDog("Goliath");
        bd.greets();
    }

    @Test
    void greetsDog() {
        BigDog bd = new BigDog("Goliath");
        Dog d = new Dog("Rex");
        bd.greets(d);
    }

    @Test
    void greetsBigDog() {
        BigDog bd1 = new BigDog("Goliath");
        BigDog bd2 = new BigDog("Zeus");
        bd1.greets(bd2);
    }
}