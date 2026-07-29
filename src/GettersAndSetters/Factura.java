package GettersAndSetters;



public class Factura {
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public String getCodigoFactura() { return codigoFactura; }
    public void setCodigoFactura(String codigoFactura) { this.codigoFactura = codigoFactura; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) this.cantidad = cantidad;
        else System.out.println("Error: La cantidad debe ser mayor a 0.");
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) this.precioUnitario = precioUnitario;
        else System.out.println("Error: El precio unitario debe ser mayor a 0.");
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("--- FACTURA ---");
        System.out.println("Código: " + codigoFactura);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: Q" + precioUnitario);
        System.out.println("Total a Pagar: Q" + calcularTotal());
    }
}
