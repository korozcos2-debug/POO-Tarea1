package Encapsulamiento;

public class Cuenta {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor con parámetros
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }

    }

    // Método para retirar dinero
    public void retirar(double monto) {

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado correctamente.");
        }

    }

    // Método para mostrar la información de la cuenta
    public void mostrar() {
        System.out.println("Titular : " + titular);
        System.out.println("Saldo   : Q" + saldo);
        System.out.println("----------------------------");
    }

}