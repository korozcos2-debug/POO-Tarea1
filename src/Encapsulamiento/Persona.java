package Encapsulamiento;

public class Persona {

    // Atributos privados (Encapsulación)
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para mostrar los datos
    public void mostrar() {
        System.out.println("Nombre   : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad     : " + edad);
        System.out.println("----------------------------");
    }
}