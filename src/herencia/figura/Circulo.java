package herencia.figura;

/*
 * ------------------------------------------------------------
 * Clase Circulo
 * ------------------------------------------------------------
 *
 * Explicación:
 * Circulo hereda de Figura.
 *
 * Se agrega el atributo radio.
 *
 * Se sobrescribe calcularArea()
 * utilizando la fórmula:
 *
 * π * radio²
 *
 * Casos de prueba:
 * 1. Crear un Círculo.
 * 2. Calcular su área.
 */

public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double radio) {

        super(nombre);

        this.radio = radio;

    }

    @Override
    public double calcularArea() {

        return Math.PI * radio * radio;

    }

}