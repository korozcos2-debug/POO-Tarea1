package herencia.transporte;

/*
 * ------------------------------------------------------------
 * Ejercicio 4: Transporte y Bus
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Transporte representa un medio de transporte general.
 *
 * Contiene un atributo protegido llamado capacidad, el cual
 * indica la cantidad máxima de pasajeros.
 *
 * Esta clase será utilizada como clase padre para que otras
 * clases puedan reutilizar sus atributos y métodos.
 *
 * Casos de prueba:
 * 1. Crear un transporte.
 * 2. Mostrar su descripción.
 * 3. Posteriormente crear un Bus.
 */

public class Transporte {

    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {

        System.out.println("Capacidad de pasajeros: " + capacidad);

    }

}