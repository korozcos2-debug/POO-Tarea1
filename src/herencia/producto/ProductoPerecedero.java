package herencia.producto;

import java.time.LocalDate;

/*
 * ------------------------------------------------------------
 * Clase ProductoPerecedero
 * ------------------------------------------------------------
 *
 * Explicación:
 * ProductoPerecedero hereda de Producto.
 *
 * Se agrega el atributo fechaVencimiento utilizando LocalDate.
 *
 * Se utiliza super() para inicializar los atributos heredados.
 *
 * Se sobrescribe el método mostrarInformacion()
 * para agregar la fecha de vencimiento.
 *
 * Además, se implementa el método estaVencido(),
 * el cual determina si el producto ya venció
 * comparando la fecha actual con la fecha de vencimiento.
 */

public class ProductoPerecedero extends Producto {

    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre,
                              double precio,
                              LocalDate fechaVencimiento) {

        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Fecha de vencimiento: "
                + fechaVencimiento);

    }

    public boolean estaVencido() {

        return LocalDate.now().isAfter(fechaVencimiento);

    }

}