package herencia.facturacion;

/*
 * ------------------------------------------------------------
 * Clase FacturaContado
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase FacturaContado hereda de Factura.
 *
 * Se agrega un porcentaje de descuento que se aplicará
 * al total de la factura.
 *
 * Se utiliza super() para inicializar los atributos heredados.
 *
 * Se sobrescribe calcularTotal() para aplicar el descuento.
 *
 * Casos de prueba:
 * 1. Crear una factura al contado.
 * 2. Aplicar descuento.
 * 3. Verificar que el total nunca sea negativo.
 */

public class FacturaContado extends Factura {

    private double descuento;

    public FacturaContado(int numero,
                          Cliente cliente,
                          double total,
                          double descuento) {

        super(numero, cliente, total);
        this.descuento = descuento;

    }

    @Override
    public double calcularTotal() {

        double totalFinal = total - descuento;

        if (totalFinal < 0) {
            totalFinal = 0;
        }

        return totalFinal;

    }

    @Override
    public void mostrarFactura() {

        super.mostrarFactura();
        System.out.println("Descuento : Q" + descuento);
        System.out.println("Total Final : Q" + calcularTotal());

    }

}