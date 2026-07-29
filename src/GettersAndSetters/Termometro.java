package GettersAndSetters;



public class Termometro {
    private double celsius;

    public double getCelsius() { return celsius; }
    public void setCelsius(double temperatura) {
        if (temperatura < -273.15) {
            System.out.println("Error: Temperatura por debajo del cero absoluto.");
        } else {
            this.celsius = temperatura;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
