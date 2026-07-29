package GettersAndSetters;



public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0.");
        }
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            this.stock -= cantidad;
            System.out.println("Venta exitosa de " + cantidad + " unidades.");
        } else {
            System.out.println("Error: Stock insuficiente para vender " + cantidad + " unidades.");
        }
    }
}
