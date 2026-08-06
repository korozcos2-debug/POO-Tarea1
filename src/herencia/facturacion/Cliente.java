package herencia.facturacion;

/*
 * ------------------------------------------------------------
 * Ejercicio 10: Sistema de Facturación
 * ------------------------------------------------------------
 *
 * Clase Cliente
 *
 * Explicación:
 * Representa al cliente que realizará una compra.
 *
 * Esta clase no hereda de ninguna otra.
 *
 * Será utilizada por la clase Factura mediante composición.
 *
 * Casos de prueba:
 * 1. Crear un cliente.
 * 2. Mostrar sus datos dentro de una factura.
 */

public class Cliente {

    private String nombre;
    private String nit;

    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

}