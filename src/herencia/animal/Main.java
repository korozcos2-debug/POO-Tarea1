package herencia.animal;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Animal es la clase padre.
 * - Perro hereda de Animal mediante extends.
 *
 * Método sobrescrito:
 * - hacerSonido()
 *
 * Uso de super:
 * - super(nombre) para inicializar el atributo heredado.
 *
 * Casos de prueba:
 * 1. Crear un Animal.
 * 2. Ejecutar hacerSonido().
 * 3. Crear un Perro.
 * 4. Ejecutar hacerSonido() del Perro.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("ANIMAL");
        System.out.println("=================================");

        Animal animal = new Animal("Animal Genérico");
        animal.hacerSonido();

        System.out.println();

        System.out.println("=================================");
        System.out.println("PERRO");
        System.out.println("=================================");

        Perro perro = new Perro("Max");
        perro.hacerSonido();

    }

}