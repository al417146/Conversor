package main;

import conversor.Conversor;
import conversor.Fahrenheit;
import conversor.Reaumur;

public class Main {
//    public double fahrenheit(double celsius) {
//        return 9.0/5.0 * celsius + 32.0;
//    }

//    public  double reaumur(double celsius) {
//        return 4.0/5.0 * celsius;
//    }

    public static void main (String [] args) {
        Main main = new Main();
        Conversor fahrenheit = new Fahrenheit();
        Conversor reaumur = new Reaumur();
        System.out.println("Celsius "+ "Farenheit "+ "Reaumur");
        for(int celsius = 0; celsius <= 100; celsius += 5) {
            System.out.println(+celsius+" \t"+ fahrenheit.convierte(celsius) + " \t"+ reaumur.convierte(celsius)+" \t");
        }
    }
}
