package herencia.facturacion;

/*
 * ------------------------------------------------------------
 * Clase Factura
 * ------------------------------------------------------------
 *
 * Explicación:
 * Esta es la clase padre del sistema.
 *
 * Contiene:
 * - número
 * - cliente
 * - total
 *
 * Las clases hijas modificarán la forma de calcular el total.
 *
 * Casos de prueba:
 * 1. Crear una factura.
 * 2. Mostrar sus datos.
 */

public class Factura {

    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero,
                   Cliente cliente,
                   double total) {

        this.numero = numero;
        this.cliente = cliente;

        if (total >= 0) {
            this.total = total;
        } else {
            this.total = 0;
        }

    }

    public double calcularTotal() {

        return total;

    }

    public void mostrarFactura() {

        System.out.println("------------------------------");
        System.out.println("Factura No. " + numero);
        System.out.println("Cliente : " + cliente.getNombre());
        System.out.println("NIT     : " + cliente.getNit());
        System.out.println("Total   : Q" + calcularTotal());

    }

}