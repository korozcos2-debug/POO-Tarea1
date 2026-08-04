package herencia.cuenta;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * Este programa prueba el funcionamiento de la herencia entre
 * Cuenta y CuentaCorriente.
 *
 * Cómo se aplicó la herencia:
 * - Cuenta es la clase padre.
 * - CuentaCorriente hereda los atributos y métodos de Cuenta.
 * - Se reutilizó el constructor mediante super(saldo).
 *
 * Método sobrescrito:
 * - retirar(double monto)
 *
 * Uso de super:
 * - Se utilizó super(saldo) para inicializar el saldo heredado.
 *
 * Casos de prueba:
 * 1. Crear una Cuenta.
 * 2. Depositar dinero.
 * 3. Retirar un monto permitido.
 * 4. Crear una CuentaCorriente.
 * 5. Retirar utilizando el sobregiro.
 * 6. Intentar retirar un monto mayor al permitido.
 * 7. Mostrar el saldo después de cada operación.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("CUENTA NORMAL");
        System.out.println("==================================");

        Cuenta cuenta = new Cuenta(1000);

        cuenta.mostrarSaldo();

        cuenta.depositar(500);

        cuenta.mostrarSaldo();

        cuenta.retirar(300);

        cuenta.mostrarSaldo();

        cuenta.retirar(1500);

        cuenta.mostrarSaldo();

        System.out.println();

        System.out.println("==================================");
        System.out.println("CUENTA CORRIENTE");
        System.out.println("==================================");

        CuentaCorriente corriente = new CuentaCorriente(1000, 500);

        corriente.mostrarSaldo();

        corriente.retirar(1200);

        corriente.mostrarSaldo();

        corriente.retirar(400);

        corriente.mostrarSaldo();

        corriente.retirar(1000);

        corriente.mostrarSaldo();

    }

}