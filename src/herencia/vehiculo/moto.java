package herencia.vehiculo;

/*
 * ------------------------------------------------------------
 * Clase Moto
 * ------------------------------------------------------------
 *
 * Explicación:
 * La clase Moto hereda de Vehiculo.
 *
 * Se agrega el atributo cilindrada para representar
 * la capacidad del motor en centímetros cúbicos (cc).
 *
 * Se utiliza super() para inicializar los atributos heredados.
 *
 * Se sobrescribe mostrarInfo() para agregar la cilindrada.
 *
 * Casos de prueba:
 * 1. Crear una Moto.
 * 2. Mostrar toda su información.
 */

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();

        System.out.println("Cilindrada: " + cilindrada + " cc");

    }

}