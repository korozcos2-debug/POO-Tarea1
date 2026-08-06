package herencia.empleado;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Empleado es la clase padre.
 * - Gerente hereda de Empleado.
 *
 * Método sobrescrito:
 * - calcularSalario()
 * - mostrarInformacion()
 *
 * Uso de super:
 * - super(nombre, salario) para inicializar los atributos heredados.
 *
 * Casos de prueba:
 * 1. Crear un Empleado.
 * 2. Mostrar su información.
 * 3. Crear un Gerente.
 * 4. Mostrar la información del Gerente.
 * 5. Comparar el salario base con el salario total.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("EMPLEADO");
        System.out.println("=================================");

        Empleado empleado = new Empleado("Carlos López", 4500.00);
        empleado.mostrarInformacion();

        System.out.println();

        System.out.println("=================================");
        System.out.println("GERENTE");
        System.out.println("=================================");

        Gerente gerente = new Gerente("Ana Pérez", 7000.00, 1500.00);
        gerente.mostrarInformacion();

    }

}