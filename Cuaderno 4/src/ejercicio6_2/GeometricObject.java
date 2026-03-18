package ejercicio6_2;

// INTERFAZ: es un "contrato". Cualquier clase que la implemente
// DEBE tener los métodos getArea() y getPerimeter().
// En una interfaz, todos los métodos son abstractos por defecto.
public interface GeometricObject {
    double getArea();
    double getPerimeter();
}
