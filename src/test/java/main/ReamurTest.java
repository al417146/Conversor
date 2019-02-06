package main;

import conversor.Conversor;
import conversor.Reamur;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReamurTest {
    private static Conversor reamur;

    @BeforeClass
    public static void inicia() {
        reamur = new Reamur();
    }

    @AfterClass
    public static void finaliza() {
        reamur = null;
    }

    @Test
    public void convierte82CelsiusTest() {
        assertEquals(65.6, reamur.convierte(82), 0.001);
    }
}
