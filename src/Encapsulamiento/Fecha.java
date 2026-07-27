package Encapsulamiento;



public class Fecha {

    // Atributos privados
    private int dia;
    private int mes;
    private int anio;

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Método para validar la fecha
    public boolean esValida() {

        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            return true;
        } else {
            return false;
        }

    }

    // Método para mostrar la fecha
    public void mostrar() {

        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);

        if (esValida()) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha es inválida.");
        }

        System.out.println("----------------------------");
    }

}