package herencia.animal;

/*
 * ------------------------------------------------------------
 * Clase Perro
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Perro hereda de Animal.
 *
 * Se utiliza super(nombre) para inicializar el atributo heredado.
 *
 * Se sobrescribe el método hacerSonido() para representar
 * el sonido específico que realiza un perro.
 *
 * Casos de prueba:
 * 1. Crear un Perro.
 * 2. Ejecutar hacerSonido().
 * 3. Verificar la sobrescritura del método.
 */

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }

}