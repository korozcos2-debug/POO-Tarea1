package herencia.persona;

/*
 * ------------------------------------------------------------
 * Clase Estudiante
 * ------------------------------------------------------------
 *
 * Explicación:
 * - Estudiante hereda de Persona utilizando extends.
 * - Se agrega el atributo carnet, que identifica al estudiante.
 * - Se utiliza super(nombre, edad) para inicializar los atributos
 *   heredados de la clase Persona.
 * - Se sobrescribe el método mostrar() utilizando @Override para
 *   mostrar la información heredada y el carnet.
 *
 * Casos de prueba:
 * 1. Crear un Estudiante.
 * 2. Verificar que herede nombre y edad.
 * 3. Verificar que muestre correctamente el carnet.
 */

public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad);
        this.carnet = carnet;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }

}