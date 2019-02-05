package main;

public class Main {
    public static double fahrenheit(double celsius) {
        return 9.0/5.0 * celsius + 32.0;
    }

    public static double reaumur(double celsius) {
        return 4.0/5.0 * celsius;
    }

    public static void main (String [] args) {

        System.out.println("Celsius "+ "Farenheit "+ "Reamur");
        for(int celsius = 0; celsius <= 100; celsius += 5) {
            System.out.println(+celsius+" \t"+ fahrenheit(celsius) + " \t"+ reaumur(celsius)+" \t");
        }
    }
}
