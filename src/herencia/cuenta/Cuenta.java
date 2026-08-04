package herencia.cuenta;

/*
 * ------------------------------------------------------------
 * Ejercicio 2: Cuenta y CuentaCorriente
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Cuenta representa una cuenta bancaria básica.
 * Contiene un saldo protegido para que las clases hijas puedan
 * acceder a él directamente.
 *
 * La clase incluye métodos para depositar, retirar y mostrar
 * el saldo.
 *
 * La clase hija modificará el comportamiento del método retirar()
 * utilizando @Override.
 *
 * Casos de prueba:
 * 1. Crear una cuenta.
 * 2. Depositar dinero.
 * 3. Retirar dinero.
 * 4. Mostrar el saldo.
 */

public class Cuenta {

    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado: Q" + monto);
    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado: Q" + monto);
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }

}