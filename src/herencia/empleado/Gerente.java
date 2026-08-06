package herencia.empleado;

/*
 * ------------------------------------------------------------
 * Clase Gerente
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Gerente hereda de Empleado.
 *
 * Se agrega el atributo bono, el cual representa un incentivo
 * adicional al salario base.
 *
 * Se utiliza super(nombre, salario) para inicializar los
 * atributos heredados.
 *
 * Se sobrescribe el método calcularSalario() para sumar
 * el salario base más el bono.
 *
 * Casos de prueba:
 * 1. Crear un Gerente.
 * 2. Verificar que herede nombre y salario.
 * 3. Calcular el salario total incluyendo el bono.
 */

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salario + bono;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Gerente : " + nombre);
        System.out.println("Salario Base : Q" + salario);
        System.out.println("Bono : Q" + bono);
        System.out.println("Salario Total : Q" + calcularSalario());

    }

}