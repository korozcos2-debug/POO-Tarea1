package herencia.cuenta;

/*
 * ------------------------------------------------------------
 * Clase CuentaCorriente
 * ------------------------------------------------------------
 *
 * Explicación:
 * - CuentaCorriente hereda de la clase Cuenta.
 * - Se agrega el atributo limiteSobregiro, que permite retirar
 *   más dinero del saldo disponible hasta un límite establecido.
 * - Se utiliza super(saldo) para inicializar el saldo heredado.
 * - Se sobrescribe el método retirar() para cambiar su
 *   funcionamiento respecto a la clase padre.
 *
 * Casos de prueba:
 * 1. Retirar un monto menor al saldo.
 * 2. Retirar un monto utilizando el sobregiro.
 * 3. Intentar retirar un monto que supere el límite permitido.
 */

public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {

        if (monto <= (saldo + limiteSobregiro)) {
            saldo -= monto;
            System.out.println("Retiro realizado: Q" + monto);
            System.out.println("Se utilizó el saldo y/o el sobregiro permitido.");
        } else {
            System.out.println("Operación rechazada.");
            System.out.println("Se supera el límite de sobregiro.");
        }

    }

}