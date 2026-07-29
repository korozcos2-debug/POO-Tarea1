package GettersAndSetters;



public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() == 8 && telefono.matches("\\d+")) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: El teléfono debe tener exactamente 8 dígitos numéricos.");
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: El email debe contener un carácter '@'.");
        }
    }

    public void mostrarContacto() {
        System.out.println("Contacto: " + nombre + " | Tel: " + telefono + " | Email: " + email);
    }
}
