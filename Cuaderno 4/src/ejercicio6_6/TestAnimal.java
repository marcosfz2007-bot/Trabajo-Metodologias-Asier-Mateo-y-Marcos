package ejercicio6_6;

public class TestAnimal {
    public static void main(String[] args) {

        // Uso directo de las subclases
        Cat cat1 = new Cat("Misi");
        cat1.greets(); // Meow

        Dog dog1 = new Dog("Rex");
        dog1.greets(); // Woof

        BigDog bigDog1 = new BigDog("Goliath");
        bigDog1.greets(); // Wooow

        System.out.println("--- Polimorfismo ---");

        // Polimorfismo: variable Animal apunta a subclases
        Animal animal1 = new Cat("Felix");
        animal1.greets(); // Meow  → llama Cat.greets()

        Animal animal2 = new Dog("Buddy");
        animal2.greets(); // Woof  → llama Dog.greets()

        Animal animal3 = new BigDog("Zeus");
        animal3.greets(); // Wooow → llama BigDog.greets()

        // Animal animal4 = new Animal("X"); → ERROR: Animal es abstracta

        System.out.println("--- Downcasts ---");

        Dog dog2 = (Dog) animal2;           // OK: animal2 es Dog
        BigDog bigDog2 = (BigDog) animal3;  // OK: animal3 es BigDog
        Dog dog3 = (Dog) animal3;           // OK: BigDog ES Dog (hereda de Dog)

        // Cat cat2 = (Cat) animal2; → ClassCastException en tiempo de ejecución:
        // animal2 es Dog, no se puede convertir a Cat

        dog2.greets(dog3);        // dog2 es Dog, dog3 es Dog → Woooof
        dog3.greets(dog2);        // dog3 real es BigDog, parámetro es Dog → Wooooow
        dog2.greets(bigDog2);     // dog2 es Dog, bigDog2 pasa como Dog → Woooof
        bigDog2.greets(dog2);     // BigDog.greets(Dog) → Wooooow
        bigDog2.greets(bigDog1);  // BigDog.greets(BigDog) → Wooooooow
    }
}
