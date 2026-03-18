package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

// Cat hereda de Mammal (y Mammal hereda de Animal)
public class Cat extends Mammal {

    // Constructor que pasa el nombre a la superclase
    public Cat(String name) {
        super(name);
    }

    // Método propio de Cat: saludo característico
    public void greets() {
        System.out.println("Meow");
    }

    // Representación en texto (reutiliza Mammal/Animal)
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}