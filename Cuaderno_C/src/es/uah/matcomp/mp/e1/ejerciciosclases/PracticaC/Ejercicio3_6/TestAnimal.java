package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

public class TestAnimal {

    public static void main(String[] args) {

        // Crea un Animal y lo muestra
        Animal a = new Animal("Animal1");
        System.out.println(a);

        // Crea un Mammal y lo muestra
        Mammal m = new Mammal("Mammal1");
        System.out.println(m);

        // Crea un Cat, lo muestra y ejecuta su saludo
        Cat c = new Cat("nombre1");
        System.out.println(c);
        c.greets(); // imprime "Meow"

        // Crea dos perros
        Dog d1 = new Dog("nombre2");
        Dog d2 = new Dog("nombre3");

        // Muestra el primer perro
        System.out.println(d1);

        // Llama al saludo básico
        d1.greets(); // "Woof"

        // Llama al saludo sobrecargado (con otro perro)
        d1.greets(d2); // "Woooof"
    }


    //Animal a = new Dog("Rex");
    //a.greets();
    //esto no se puede hacer, ya que Animal es el tipo de variable
    //y no tiene método greets() b
}
