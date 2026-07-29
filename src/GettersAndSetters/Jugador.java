package GettersAndSetters;


public class Jugador {
    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPuntajeActual() { return puntajeActual; }
    public int getPuntajeMaximo() { return puntajeMaximo; }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje < 0) {
            System.out.println("Error: El puntaje actual no puede ser negativo.");
            return;
        }
        this.puntajeActual = nuevoPuntaje;
        if (nuevoPuntaje > puntajeMaximo) {
            this.puntajeMaximo = nuevoPuntaje;
            System.out.println("¡Nuevo récord máximo alcanzado!: " + puntajeMaximo);
        }
    }
}
