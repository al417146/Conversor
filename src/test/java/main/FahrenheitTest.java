package main;

import conversor.Conversor;
import conversor.Fahrenheit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrenheitTest {
    private static Conversor fahrenheit;

    @BeforeClass
    public static void inicia() {
        fahrenheit = new Fahrenheit();
    }

    @AfterClass
    public static void finaliza() {
        fahrenheit = null;
    }

    @Test
    public void convierte82CelsiusTest() {
        assertEquals(179.6, fahrenheit.convierte(82), 0.001);
    }
}
