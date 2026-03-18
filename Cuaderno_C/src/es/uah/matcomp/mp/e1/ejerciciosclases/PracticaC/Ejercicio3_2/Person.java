package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

// Clase base Person
public class Person {

    // Atributos privados
    private String name;
    private String address;

    // Constructor que inicializa nombre y dirección
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Devuelve el nombre
    public String getName(){
        return name;
    }

    // Devuelve la dirección
    public String getAddress(){
        return address;
    }

    // Cambia la dirección
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    // Devuelve el objeto como texto
    @Override
    public String toString(){
        return "Person[name=" + name + ",address=" + address + "]";
    }
}