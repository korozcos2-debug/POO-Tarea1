package herencia.transporte;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Transporte es la clase padre.
 * - Bus hereda de Transporte mediante extends.
 *
 * Método sobrescrito:
 * - descripcion()
 *
 * Uso de super:
 * - super(capacidad) para inicializar el atributo heredado.
 * - super.descripcion() para reutilizar el método de la clase padre.
 *
 * Casos de prueba:
 * 1. Crear un Transporte.
 * 2. Mostrar su descripción.
 * 3. Crear un Bus.
 * 4. Mostrar la descripción del Bus.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("TRANSPORTE");
        System.out.println("=================================");

        Transporte transporte = new Transporte(40);
        transporte.descripcion();

        System.out.println();

        System.out.println("=================================");
        System.out.println("BUS");
        System.out.println("=================================");

        Bus bus = new Bus(55, "Ruta Centro - Universidad");
        bus.descripcion();

    }

}