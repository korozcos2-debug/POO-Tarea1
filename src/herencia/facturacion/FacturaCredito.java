package herencia.facturacion;

/*
 * ------------------------------------------------------------
 * Clase FacturaCredito
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase FacturaCredito hereda de Factura.
 *
 * Se agrega un recargo y la cantidad de cuotas.
 *
 * Se utiliza super() para inicializar la clase padre.
 *
 * Se sobrescribe calcularTotal() para sumar el recargo.
 *
 * Casos de prueba:
 * 1. Crear una factura al crédito.
 * 2. Aplicar recargo.
 * 3. Mostrar el número de cuotas.
 */

public class FacturaCredito extends Factura {

    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero,
                          Cliente cliente,
                          double total,
                          double recargo,
                          int cuotas) {

        super(numero, cliente, total);

        this.recargo = recargo;
        this.cuotas = cuotas;

    }

    @Override
    public double calcularTotal() {

        return total + recargo;

    }

    @Override
    public void mostrarFactura() {

        super.mostrarFactura();

        System.out.println("Recargo : Q" + recargo);
        System.out.println("Cuotas  : " + cuotas);
        System.out.println("Total Final : Q" + calcularTotal());

    }

}