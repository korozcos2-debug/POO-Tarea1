package GettersAndSetters;



public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria(String titular, double saldoInicial, int pinInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.pin = pinInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado != this.pin) {
            System.out.println("Error: PIN incorrecto. Acceso denegado.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
            return;
        }
        this.saldo -= monto;
        System.out.println("Retiro exitoso de Q" + monto + ". Nuevo saldo: Q" + this.saldo);
    }
}
