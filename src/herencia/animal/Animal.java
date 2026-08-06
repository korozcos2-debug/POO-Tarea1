package herencia.animal;

/*
 * ------------------------------------------------------------
 * Ejercicio 6: Animal y Perro
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Animal representa un animal de forma general.
 *
 * Contiene un atributo protegido llamado nombre y un método
 * hacerSonido(), el cual será sobrescrito por la clase Perro.
 *
 * Casos de prueba:
 * 1. Crear un Animal.
 * 2. Mostrar su nombre.
 * 3. Ejecutar el método hacerSonido().
 */

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }

}