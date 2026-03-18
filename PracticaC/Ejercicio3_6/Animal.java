package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_6;

// Clase base Animal
public class Animal {

    // Nombre del animal
    private String name;

    // Constructor que inicializa el nombre
    public Animal(String name) {
        this.name = name;
    }

    // Representación en texto del animal
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}