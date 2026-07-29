package GettersAndSetters;


public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }
}
