package herencia.libro;

/*
 * ------------------------------------------------------------
 * Clase LibroDigital
 * ------------------------------------------------------------
 *
 * Explicación:
 * LibroDigital hereda de Libro.
 *
 * Se agrega el atributo tamanoMB para representar
 * el tamaño del archivo digital.
 *
 * Se utiliza super() para inicializar los atributos heredados.
 *
 * Se sobrescribe mostrarInfo() para incluir el tamaño
 * del archivo.
 *
 * Casos de prueba:
 * 1. Crear un LibroDigital.
 * 2. Mostrar toda su información.
 */

public class LibroDigital extends Libro {

    private double tamanoMB;

    public LibroDigital(String titulo,
                        String autor,
                        double tamanoMB) {

        super(titulo, autor);

        this.tamanoMB = tamanoMB;

    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();

        System.out.println("Tamaño del archivo: "
                + tamanoMB + " MB");

    }

}