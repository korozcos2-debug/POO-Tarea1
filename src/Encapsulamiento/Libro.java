package Encapsulamiento;

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método que indica si el libro es largo
    public boolean esLargo() {

        if (paginas > 300) {
            return true;
        } else {
            return false;
        }

    }

    // Método para mostrar la información del libro
    public void mostrar() {
        System.out.println("Título  : " + titulo);
        System.out.println("Autor   : " + autor);
        System.out.println("Páginas : " + paginas);

        if (esLargo()) {
            System.out.println("Es un libro largo.");
        } else {
            System.out.println("No es un libro largo.");
        }

        System.out.println("----------------------------");
    }

}