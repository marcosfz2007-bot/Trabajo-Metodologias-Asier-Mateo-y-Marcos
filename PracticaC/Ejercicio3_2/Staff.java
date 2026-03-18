package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

// Staff hereda de Person
public class Staff extends Person {

    // Atributos propios de Staff
    private String school;
    private double pay;

    // Constructor: primero inicializa Person, luego sus atributos
    public Staff(String name, String address, String school, double pay) {
        super(name, address); // llama al constructor de Person
        this.school = school;
        this.pay = pay;
    }

    // Devuelve el colegio
    public String getSchool() {
        return school;
    }

    // Cambia el colegio
    public void setSchool(String school) {
        this.school = school;
    }

    // Devuelve el salario
    public double getPay() {
        return pay;
    }

    // Cambia el salario
    public void setPay(double pay) {
        this.pay = pay;
    }

    // Representación en texto (usa también la de Person)
    @Override
    public String toString() {
        return "Staff[" + super.toString() +   // reutiliza toString de Person
                ",school=" + school +
                ",pay=" + pay + "]";
    }
}