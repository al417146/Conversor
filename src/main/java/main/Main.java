package main;

import conversor.Fahrenheit;
import conversor.Reaumur;
import tabla.TablaConversion;

public class Main {
    public static void main (String [] args) {
        TablaConversion tabla = new TablaConversion();
        tabla.addConversor(new Reaumur());
        tabla.addConversor(new Fahrenheit());
        System.out.println(tabla.escribeTabla());
    }
}
