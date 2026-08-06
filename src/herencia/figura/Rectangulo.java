package herencia.figura;

/*
 * ------------------------------------------------------------
 * Clase Rectangulo
 * ------------------------------------------------------------
 *
 * Explicación:
 * Rectangulo hereda de Figura.
 *
 * Se agregan los atributos base y altura.
 *
 * Se sobrescribe calcularArea()
 * utilizando la fórmula:
 *
 * área = base * altura
 *
 * Casos de prueba:
 * 1. Crear un Rectángulo.
 * 2. Calcular su área.
 */

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String nombre,
                      double base,
                      double altura) {

        super(nombre);

        this.base = base;
        this.altura = altura;

    }

    @Override
    public double calcularArea() {

        return base * altura;

    }

}