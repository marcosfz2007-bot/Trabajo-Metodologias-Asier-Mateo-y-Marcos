package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

public class TestPerson {

    public static void main(String[] args) {

        // Crea un objeto Person
        Person p = new Person("Juan", "Madrid");
        System.out.println(p); // usa toString de Person

        // Crea un objeto Student (hereda de Person)
        Student s = new Student("Ana", "Toledo", "Computer Science", 2, 1500);
        System.out.println(s); // usa toString de Student (y de Person con super)

        // Crea un objeto Staff (también hereda de Person)
        Staff st = new Staff("Luis", "Alcalá", "Engineering", 3000);
        System.out.println(st); // usa toString de Staff (y de Person con super)

    }
}