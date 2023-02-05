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
        System.out.println("Fin");
    }
}
/**
 * 1. A partir de la aplicación de conversión entre Celsius y Fahrenheit, ¿has tenido que modificar radicalmente tu programa
 *    para incluir la conversión de Celsius a Reaumur?
 *    RESPUESTA:
 *          No, ya que Conversor es una Interfaz que es implementada tanto por las clases Reaumur (dónde dispone de un método para
 *          calcular la temperatura en Reaumur a partir de un valor double de Celsius) y Fahrenheit (dónde también dispone de un método
 *          que devuelve el valor en Fahrenheit a partir de un valor en Celsius dado). La única modificación que he hecho ha sido en el método
 *          escribeTabla() de TablaConversión, dónde he puesto en la primera línea de la StringBuilder los datos de
 *          "Celsius", "Reaumur" y "Fahrenheit". Y cuándo se finaliza de imprimir la tabla, imprimir en pantalla el texto "Fin".
 *          Aunque sería solamente por cuestiones estéticas.
 *
 * 2. ¿Cómo podrías incluir la conversión a una cuarta escala?
 *    RESPUESTA:
 *          De la misma manera de que con Fahrenheit y Reaumur. Para añadir una cuarta escala, crearía una nueva clase
 *          que implemente la interfaz Conversor. Luego en esa clase implementaría el método convierte, dónde este me
 *          devolverá el valor obtenido al haber aplicado la fórmula de conversión de dicha escala.
 *          Después en Main, usaría el Objeto de TablaConversión y le añadiría (mediante addConversor) el nuevo Objeto
 *          de esa nueva escala al atributo conversores de TablaConversión (que es un ArrayList).
 *          Por ello, cuándo Main llame a escribeTabla(), se imprimirá también los elementos de esa escala.
 */
