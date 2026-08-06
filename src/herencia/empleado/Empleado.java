package herencia.empleado;

/*
 * ------------------------------------------------------------
 * Ejercicio 5: Empleado y Gerente
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Empleado representa a un trabajador de una empresa.
 *
 * Contiene los atributos nombre y salario, los cuales serán
 * heredados por la clase Gerente.
 *
 * Se utiliza el modificador protected para permitir que la
 * clase hija pueda acceder a estos atributos.
 *
 * Casos de prueba:
 * 1. Crear un Empleado.
 * 2. Calcular su salario.
 * 3. Mostrar la información.
 */

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrarInformacion() {

        System.out.println("Empleado : " + nombre);
        System.out.println("Salario Base : Q" + calcularSalario());

    }

}