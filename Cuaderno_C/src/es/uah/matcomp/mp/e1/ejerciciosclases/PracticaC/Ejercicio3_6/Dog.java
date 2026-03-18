package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

// Dog hereda de Mammal (y este de Animal)
public class Dog extends Mammal {

    // Constructor que pasa el nombre a la superclase
    public Dog(String name) {
        super(name);
    }

    // Saludo básico del perro
    public void greets() {
        System.out.println("Woof");
    }

    // Sobrecarga del método greets (otro perro como parámetro)
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    // Representación en texto (reutiliza la de Mammal/Animal)
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}