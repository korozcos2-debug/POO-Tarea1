package herencia.vehiculo;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Vehiculo es la clase padre.
 * - Moto hereda de Vehiculo mediante extends.
 *
 * Método sobrescrito:
 * - mostrarInfo()
 *
 * Uso de super:
 * - super(marca, velocidad) para inicializar los atributos heredados.
 * - super.mostrarInfo() para reutilizar el método de la clase padre.
 *
 * Casos de prueba:
 * 1. Crear un Vehículo.
 * 2. Mostrar su información.
 * 3. Crear una Moto.
 * 4. Mostrar la información de la Moto.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("VEHÍCULO");
        System.out.println("=================================");

        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        vehiculo.mostrarInfo();

        System.out.println();

        System.out.println("=================================");
        System.out.println("MOTO");
        System.out.println("=================================");

        Moto moto = new Moto("Yamaha", 220, 600);
        moto.mostrarInfo();

    }

}