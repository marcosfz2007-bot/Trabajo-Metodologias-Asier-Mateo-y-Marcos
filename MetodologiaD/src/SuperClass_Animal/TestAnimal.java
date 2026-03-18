package SuperClass_Animal;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println();
        Cat cat1 = new Cat("Whiskers");
        cat1.greets();

        Dog dog1 = new Dog("Buddy");
        dog1.greets();

        BigDog bigDog1 = new BigDog("Max");
        bigDog1.greets();

        System.out.println();
        Animal animal1 = new Cat("Kitty");
        animal1.greets();

        Animal animal2 = new Dog("Rex");
        animal2.greets();

        Animal animal3 = new BigDog("Titan");
        animal3.greets();



        System.out.println();
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;


        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}

