package herencia.transporte;

/*
 * ------------------------------------------------------------
 * Clase Bus
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Bus hereda de Transporte.
 *
 * Se agrega el atributo ruta, que identifica el recorrido
 * del autobús.
 *
 * Se utiliza super(capacidad) para inicializar el atributo
 * heredado de la clase padre.
 *
 * Se sobrescribe el método descripcion() para mostrar tanto
 * la capacidad como la ruta asignada.
 *
 * Casos de prueba:
 * 1. Crear un Bus.
 * 2. Mostrar su capacidad.
 * 3. Mostrar la ruta.
 */

public class Bus extends Transporte {

    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {

        super.descripcion();

        System.out.println("Ruta: " + ruta);

    }

}