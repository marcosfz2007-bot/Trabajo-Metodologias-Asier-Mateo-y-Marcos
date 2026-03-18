package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void getId() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getId();
    }

    @Test
    void getFirstName() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getFirstName();
    }

    @Test
    void getLastName() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getLastName();
    }

    @Test
    void getSalary() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getSalary();
    }

    @Test
    void getName() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getName();
    }

    @Test
    void setSalary() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.setSalary(4000);
    }

    @Test
    void getAnnualSalary() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.getAnnualSalary();
    }

    @Test
    void raiseSalary() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.raiseSalary(10);
    }

    @Test
    void testToString() {
        Employee emp = new Employee(1, "John", "Doe", 3000);
        emp.toString();
    }
}