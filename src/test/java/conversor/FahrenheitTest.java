package conversor;

import conversor.Conversor;
import conversor.Fahrenheit;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitTest {
    private static Conversor fahrenheit;

//    @BeforeClass
    @BeforeAll
    public static void inicia() {
        fahrenheit = new Fahrenheit();
    }

//    @AfterClass
    @AfterAll
    public static void finaliza() {
        fahrenheit = null;
    }

    @Test
    public void convierte82CelsiusTest() {
        assertEquals(179.6, fahrenheit.convierte(82), 0.001);
    }
}
