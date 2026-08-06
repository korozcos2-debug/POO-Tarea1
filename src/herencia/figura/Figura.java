package herencia.figura;

/*
 * ------------------------------------------------------------
 * Ejercicio 8: Figura, Rectángulo y Círculo
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Figura representa una figura geométrica genérica.
 *
 * Se crea el método calcularArea(), el cual será sobrescrito
 * por las clases hijas Rectangulo y Circulo.
 *
 * Casos de prueba:
 * 1. Crear una Figura.
 * 2. Ejecutar calcularArea().
 */

public class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0;
    }

    public void mostrarInformacion() {

        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());

    }

}