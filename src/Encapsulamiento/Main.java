package Encapsulamiento;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("EJERCICIO 1 - PERSONA");
        System.out.println("====================================");

        Persona persona1 = new Persona("Juan", "Perez", 20);
        Persona persona2 = new Persona("Maria", "Lopez", 25);
        Persona persona3 = new Persona("Carlos", "Ramirez", 30);

        persona1.mostrar();
        persona2.mostrar();
        persona3.mostrar();


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 2 - RECTANGULO");
        System.out.println("====================================");

        Rectangulo rectangulo1 = new Rectangulo(8, 5);
        Rectangulo rectangulo2 = new Rectangulo(6, 7);

        System.out.println("Area Rectangulo 1: " + rectangulo1.area());
        System.out.println("Perimetro Rectangulo 1: " + rectangulo1.perimetro());

        System.out.println("Area Rectangulo 2: " + rectangulo2.area());
        System.out.println("Perimetro Rectangulo 2: " + rectangulo2.perimetro());

        if (rectangulo1.area() > rectangulo2.area()) {
            System.out.println("El Rectangulo 1 tiene mayor area.");
        } else if (rectangulo2.area() > rectangulo1.area()) {
            System.out.println("El Rectangulo 2 tiene mayor area.");
        } else {
            System.out.println("Ambos rectangulos tienen la misma area.");
        }


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 3 - PRODUCTO");
        System.out.println("====================================");

        Producto producto1 = new Producto("P001", "Laptop", 7500);
        Producto producto2 = new Producto("P002", "Mouse", 250);

        producto1.aplicarDescuento(10);
        producto2.aplicarDescuento(20);

        producto1.mostrar();
        producto2.mostrar();


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 4 - CUENTA");
        System.out.println("====================================");

        Cuenta cuenta = new Cuenta("Carlos Lopez", 1500);

        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(2500);

        cuenta.mostrar();


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 5 - LIBRO");
        System.out.println("====================================");

        Libro libro1 = new Libro("Java Basico", "Juan Perez", 250);
        Libro libro2 = new Libro("Programacion Avanzada", "Ana Lopez", 480);
        Libro libro3 = new Libro("Estructuras de Datos", "Luis Garcia", 320);

        libro1.mostrar();
        libro2.mostrar();
        libro3.mostrar();


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 6 - CALCULADORA");
        System.out.println("====================================");

        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.sumar(10, 5));
        System.out.println("Resta: " + calculadora.restar(10, 5));
        System.out.println("Multiplicacion: " + calculadora.multiplicar(10, 5));
        System.out.println("Division: " + calculadora.dividir(10, 5));
        System.out.println("Division entre cero: " + calculadora.dividir(10, 0));


        System.out.println("\n====================================");
        System.out.println("EJERCICIO 7 - FECHA");
        System.out.println("====================================");

        Fecha fecha1 = new Fecha(10, 5, 2024);
        Fecha fecha2 = new Fecha(32, 8, 2024);
        Fecha fecha3 = new Fecha(25, 13, 2024);

        fecha1.mostrar();
        fecha2.mostrar();
        fecha3.mostrar();

    }

}