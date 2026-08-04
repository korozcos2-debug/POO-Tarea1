package herencia.persona;

/*
 * ------------------------------------------------------------
 * Clase Docente
 * ------------------------------------------------------------
 *
 * Explicación:
 * - Docente hereda de Persona mediante la palabra reservada extends.
 * - Se agrega el atributo especialidad, propio del docente.
 * - Se utiliza super(nombre, edad) para inicializar los atributos
 *   heredados desde la clase Persona.
 * - Se sobrescribe el método mostrar() utilizando @Override para
 *   mostrar también la especialidad.
 *
 * Casos de prueba:
 * 1. Crear un Docente.
 * 2. Verificar que herede nombre y edad.
 * 3. Verificar que muestre la especialidad.
 */

public class Docente extends Persona {

    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }

}