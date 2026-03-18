package es.uah.matcomp.mp.e1.ejerciciosclases.PracticaC.Ejercicio3_2;

// Student hereda de Person
public class Student extends Person {

    // Atributos propios de Student
    private String program;
    private int year;
    private double fee;

    // Constructor: inicializa Person y luego los atributos propios
    public Student(String name, String address, String program, int year, double fee){
        super(name, address); // llama al constructor de Person
        this.program = program;
        this.fee = fee;
        this. year = year; // asigna el año (aunque hay un espacio innecesario)
    }

    // Devuelve el programa
    public String getProgram() {
        return program;
    }

    // Cambia el programa
    public void setProgram(String program) {
        this.program = program;
    }

    // Devuelve el año
    public int getYear() {
        return year;
    }

    // Cambia el año
    public void setYear(int year) {
        this.year = year;
    }

    // Devuelve la matrícula
    public double getFee() {
        return fee;
    }

    // Cambia la matrícula
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return "Student[" + super.toString() + // usa toString de Person
                ",program=" + program +
                ",year=" + year +
                ",fee=" + fee + "]";
    }
}