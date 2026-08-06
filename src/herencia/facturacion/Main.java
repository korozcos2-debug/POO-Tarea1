package herencia.facturacion;

/*
 * ------------------------------------------------------------
 * Clase Main
 * ------------------------------------------------------------
 *
 * Explicación:
 *
 * Este programa realiza las pruebas del sistema de facturación
 * utilizando herencia.
 *
 * Cómo se aplicó la herencia:
 * - Factura es la clase padre.
 * - FacturaContado y FacturaCredito heredan de Factura.
 * - Ambas clases reutilizan los atributos numero, cliente y total.
 *
 * Métodos sobrescritos:
 * - calcularTotal()
 * - mostrarFactura()
 *
 * Uso de super:
 * - super(numero, cliente, total) para inicializar los atributos
 *   heredados.
 * - super.mostrarFactura() para reutilizar el código de la clase padre.
 *
 * Casos de prueba realizados:
 * 1. Crear un cliente.
 * 2. Crear una factura normal.
 * 3. Crear una factura al contado con descuento.
 * 4. Crear una factura al crédito con recargo.
 * 5. Crear una factura con total negativo para comprobar
 *    la validación.
 */

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Carlos Hernández",
                "1234567-8");

        System.out.println("==================================");
        System.out.println("FACTURA NORMAL");
        System.out.println("==================================");

        Factura factura =
                new Factura(
                        1,
                        cliente,
                        1500);

        factura.mostrarFactura();

        System.out.println();

        System.out.println("==================================");
        System.out.println("FACTURA AL CONTADO");
        System.out.println("==================================");

        FacturaContado contado =
                new FacturaContado(
                        2,
                        cliente,
                        1500,
                        200);

        contado.mostrarFactura();

        System.out.println();

        System.out.println("==================================");
        System.out.println("FACTURA AL CRÉDITO");
        System.out.println("==================================");

        FacturaCredito credito =
                new FacturaCredito(
                        3,
                        cliente,
                        1500,
                        250,
                        12);

        credito.mostrarFactura();

        System.out.println();

        System.out.println("==================================");
        System.out.println("VALIDACIÓN DE TOTAL NEGATIVO");
        System.out.println("==================================");

        Factura facturaError =
                new Factura(
                        4,
                        cliente,
                        -800);

        facturaError.mostrarFactura();

    }

}