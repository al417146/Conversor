package conversor;

import conversor.Conversor;
import conversor.Reaumur;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaumurTest {
    private static Conversor reamur;

//    @BeforeClass
    @BeforeAll
    public static void inicia() {
        reamur = new Reaumur();
    }

//    @AfterClass
    @AfterAll
    public static void finaliza() {
        reamur = null;
    }

    @Test
    public void convierte82CelsiusTest() {
        assertEquals(65.6, reamur.convierte(82), 0.001);
    }
}
