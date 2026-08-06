package herencia.libro;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Libro es la clase padre.
 * - LibroDigital hereda de Libro mediante extends.
 *
 * Método sobrescrito:
 * - mostrarInfo()
 *
 * Uso de super:
 * - super(titulo, autor) para inicializar los atributos heredados.
 * - super.mostrarInfo() para reutilizar el método de la clase padre.
 *
 * Casos de prueba:
 * 1. Crear un Libro.
 * 2. Mostrar su información.
 * 3. Crear un LibroDigital.
 * 4. Mostrar la información del LibroDigital.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("LIBRO");
        System.out.println("=================================");

        Libro libro = new Libro(
                "Programación en Java",
                "Juan Pérez");

        libro.mostrarInfo();

        System.out.println();

        System.out.println("=================================");
        System.out.println("LIBRO DIGITAL");
        System.out.println("=================================");

        LibroDigital ebook = new LibroDigital(
                "Java Orientado a Objetos",
                "María López",
                15.80);

        ebook.mostrarInfo();

    }

}