package herencia.libro;

/*
 * ------------------------------------------------------------
 * Ejercicio 9: Libro y LibroDigital
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Libro representa un libro físico de forma general.
 *
 * Contiene los atributos titulo y autor, los cuales serán
 * heredados por la clase LibroDigital.
 *
 * Se utiliza protected para permitir el acceso a los atributos
 * desde la clase hija.
 *
 * Casos de prueba:
 * 1. Crear un Libro.
 * 2. Mostrar su información.
 */

public class Libro {

    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {

        System.out.println("Título : " + titulo);
        System.out.println("Autor  : " + autor);

    }

}