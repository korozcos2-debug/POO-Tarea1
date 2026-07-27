package Encapsulamiento;



public class Producto {

    // Atributos privados
    private String codigo;
    private String nombre;
    private double precio;

    // Constructor con parámetros
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para aplicar descuento
    public void aplicarDescuento(double porcentaje) {

        if (porcentaje >= 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
        } else {
            System.out.println("Porcentaje de descuento inválido.");
        }

    }

    // Método para mostrar la información del producto
    public void mostrar() {
        System.out.println("Código : " + codigo);
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : Q" + precio);
        System.out.println("----------------------------");
    }

}