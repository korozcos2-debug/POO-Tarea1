package Encapsulamiento;

public class Calculadora {

    // Método para sumar
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir
    public double dividir(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }

        return num1 / num2;
    }

}