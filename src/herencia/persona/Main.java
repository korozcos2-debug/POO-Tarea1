package herencia.persona;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - La clase Persona es la clase padre.
 * - Las clases Docente y Estudiante heredan de Persona.
 * - Ambas reutilizan los atributos nombre y edad.
 *
 * Métodos sobrescritos:
 * - Docente sobrescribe mostrar().
 * - Estudiante sobrescribe mostrar().
 *
 * Uso de super:
 * - En los constructores se utiliza super(nombre, edad)
 *   para inicializar los atributos heredados.
 * - En mostrar() se utiliza super.mostrar() para reutilizar
 *   el código de la clase padre.
 *
 * Casos de prueba:
 * 1. Crear una Persona.
 * 2. Mostrar los datos de Persona.
 * 3. Crear un Docente.
 * 4. Mostrar los datos del Docente.
 * 5. Crear un Estudiante.
 * 6. Mostrar los datos del Estudiante.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("========== PERSONA ==========");
        Persona persona = new Persona("Carlos", 30);
        persona.mostrar();

        System.out.println();

        System.out.println("========== DOCENTE ==========");
        Docente docente = new Docente(
                "María",
                45,
                "Programación Java");
        docente.mostrar();

        System.out.println();

        System.out.println("========== ESTUDIANTE ==========");
        Estudiante estudiante = new Estudiante(
                "Luis",
                20,
                "20240001");
        estudiante.mostrar();

    }

}