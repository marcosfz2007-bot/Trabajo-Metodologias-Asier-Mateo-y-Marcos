package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

// Mammal hereda de Animal (clase intermedia en la jerarquía)
public class Mammal extends Animal {

    // Constructor que pasa el nombre a Animal
    public Mammal(String name) {
        super(name);
    }

    // Representación en texto (añade nivel Mammal)
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}