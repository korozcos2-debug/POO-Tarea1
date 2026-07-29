package GettersAndSetters;



public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1) Prueba Persona ---");
        Persona p = new Persona();
        p.setEdad(-5); // Lanza error automáticamente

        System.out.println("\n--- 2) Prueba Producto ---");
        Producto prod = new Producto();
        prod.setStock(10);
        prod.vender(12); // Lanza error por falta de stock

        System.out.println("\n--- 3) Prueba Cuenta Bancaria ---");
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 500.0, 1234);
        cuenta.retirar(100, 9999); // PIN incorrecto
        cuenta.retirar(100, 1234); // Retiro exitoso

        System.out.println("\n--- 4) Prueba Curso ---");
        Curso c = new Curso();
        c.setNota1(60); c.setNota2(70); c.setNota3(65);
        System.out.println("Promedio: " + c.promedio() + " - Estado: " + c.estado());

        System.out.println("\n--- 5) Prueba Estudiante ---");
        Estudiante est = new Estudiante();
        est.setPromedio(88);
        System.out.println("¿Es becado?: " + est.esBecado());

        System.out.println("\n--- 6) Prueba Termómetro ---");
        Termometro t = new Termometro();
        t.setCelsius(25);
        System.out.println("Fahrenheit: " + t.getFahrenheit());

        System.out.println("\n--- 7) Prueba Reloj ---");
        Reloj r = new Reloj();
        r.setHora(9); r.setMinuto(5); r.setSegundo(32);
        System.out.println("Hora formateada: " + r.mostrarHora());

        System.out.println("\n--- 8) Prueba Contacto ---");
        Contacto con = new Contacto();
        con.setNombre("Ana");
        con.setTelefono("12345"); // Invalido (no tiene 8 dígitos)
        con.setEmail("ana@correo.com");

        System.out.println("\n--- 9) Prueba Jugador ---");
        Jugador jug = new Jugador();
        jug.actualizarPuntaje(50);
        jug.actualizarPuntaje(120); // Notifica nuevo récord

        System.out.println("\n--- 10) Prueba Factura ---");
        Factura f = new Factura();
        f.setCodigoFactura("FAC-001");
        f.setDescripcion("Teclado Mecánico");
        f.setCantidad(2);
        f.setPrecioUnitario(150.00);
        f.mostrarFactura();
    }
}
