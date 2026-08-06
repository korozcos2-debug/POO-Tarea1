package herencia.figura;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Figura es la clase padre.
 * - Rectangulo y Circulo heredan de Figura.
 *
 * Métodos sobrescritos:
 * - calcularArea()
 *
 * Uso de super:
 * - super(nombre) para inicializar el nombre de la figura.
 *
 * Casos de prueba:
 * 1. Crear una Figura.
 * 2. Crear un Rectángulo.
 * 3. Crear un Círculo.
 * 4. Mostrar las áreas calculadas.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("FIGURA");
        System.out.println("=================================");

        Figura figura = new Figura("Figura Genérica");
        figura.mostrarInformacion();

        System.out.println();

        System.out.println("=================================");
        System.out.println("RECTÁNGULO");
        System.out.println("=================================");

        Rectangulo rectangulo =
                new Rectangulo("Rectángulo", 8, 5);

        rectangulo.mostrarInformacion();

        System.out.println();

        System.out.println("=================================");
        System.out.println("CÍRCULO");
        System.out.println("=================================");

        Circulo circulo =
                new Circulo("Círculo", 4);

        circulo.mostrarInformacion();

    }

}