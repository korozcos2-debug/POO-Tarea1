package herencia.producto;

/*
 * ------------------------------------------------------------
 * Ejercicio 3: Producto y ProductoPerecedero
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Producto representa un producto genérico.
 *
 * Se utilizará como clase padre para que otras clases
 * reutilicen sus atributos y métodos.
 *
 * Se emplea protected para permitir el acceso desde
 * las clases hijas.
 *
 * Casos de prueba:
 * 1. Crear un producto.
 * 2. Mostrar sus datos.
 * 3. Posteriormente crear un ProductoPerecedero.
 */

public class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion() {

        System.out.println("Producto : " + nombre);
        System.out.println("Precio   : Q" + precio);

    }

}