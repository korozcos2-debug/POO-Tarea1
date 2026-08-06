package herencia.vehiculo;

/*
 * ------------------------------------------------------------
 * Ejercicio 7: Vehículo y Moto
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Vehiculo representa un vehículo de forma general.
 *
 * Contiene los atributos marca y velocidad, que serán heredados
 * por la clase Moto.
 *
 * Se utiliza protected para permitir el acceso a los atributos
 * desde la clase hija.
 *
 * Casos de prueba:
 * 1. Crear un Vehículo.
 * 2. Mostrar su información.
 */

public class Vehiculo {

    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {

        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidad + " km/h");

    }

}