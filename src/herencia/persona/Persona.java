package herencia.persona;

/*
 * ------------------------------------------------------------
 * Ejercicio 1: Persona, Docente y Estudiante
 * ------------------------------------------------------------
 *
 * Objetivo:
 * Aplicar el concepto de herencia utilizando una clase padre
 * llamada Persona y dos clases hijas llamadas Docente y
 * Estudiante.
 *
 * Explicación:
 * - Persona es la clase base.
 * - Contiene atributos protegidos (protected) para que las
 *   clases hijas puedan acceder a ellos.
 * - El método mostrar() podrá ser sobrescrito por las clases
 *   hijas utilizando @Override.
 *
 * Casos de prueba:
 * 1. Crear un objeto Persona.
 * 2. Mostrar su información.
 * 3. Posteriormente crear un Docente.
 * 4. Crear un Estudiante.
 * 5. Verificar la sobrescritura del método mostrar().
 */

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}