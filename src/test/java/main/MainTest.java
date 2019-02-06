package main;

import conversor.Conversor;
import conversor.Fahrenheit;
import conversor.Reamur;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
//    private Main main = new Main();
    private Conversor fahrenheit = new Fahrenheit();
    private Conversor reaumur = new Reamur();
    @Test
    public void fahrenheitTest() {
        assertEquals(179.6, fahrenheit.convierte(82), 0.001);
    }

    @Test
    public void reamurTest() {
        assertEquals(65.6, reaumur.convierte(82), 0.001);
    }
}
