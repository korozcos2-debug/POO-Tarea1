package herencia.producto;

import java.time.LocalDate;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 * En esta clase se realizan las pruebas del ejercicio.
 *
 * Cómo se aplicó la herencia:
 * - Producto es la clase padre.
 * - ProductoPerecedero hereda de Producto mediante extends.
 * - ProductoPerecedero reutiliza los atributos nombre y precio.
 *
 * Métodos sobrescritos:
 * - mostrarInformacion()
 *
 * Uso de super:
 * - super(nombre, precio) para inicializar los atributos heredados.
 * - super.mostrarInformacion() para reutilizar el método de la clase padre.
 *
 * Casos de prueba realizados:
 * 1. Crear un Producto normal.
 * 2. Mostrar la información del Producto.
 * 3. Crear un ProductoPerecedero con fecha futura.
 * 4. Verificar que NO esté vencido.
 * 5. Crear un ProductoPerecedero con fecha pasada.
 * 6. Verificar que SÍ esté vencido.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("PRODUCTO NORMAL");
        System.out.println("=================================");

        Producto producto = new Producto(
                "Teclado Mecánico",
                350.00);

        producto.mostrarInformacion();

        System.out.println();

        System.out.println("=================================");
        System.out.println("PRODUCTO PERECEDERO (NO VENCIDO)");
        System.out.println("=================================");

        ProductoPerecedero leche = new ProductoPerecedero(
                "Leche Entera",
                12.50,
                LocalDate.now().plusDays(7));

        leche.mostrarInformacion();

        System.out.println("¿Está vencido?: "
                + leche.estaVencido());

        System.out.println();

        System.out.println("=================================");
        System.out.println("PRODUCTO PERECEDERO (VENCIDO)");
        System.out.println("=================================");

        ProductoPerecedero yogurt = new ProductoPerecedero(
                "Yogurt",
                8.75,
                LocalDate.now().minusDays(5));

        yogurt.mostrarInformacion();

        System.out.println("¿Está vencido?: "
                + yogurt.estaVencido());

    }

}