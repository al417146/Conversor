package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void fahrenheitTest() {
        assertEquals(179.6, Main.fahrenheit(82), 0.001);
    }

    @Test
    public void reamurTest() {
        assertEquals(65.6, Main.reaumur(82), 0.001);
    }
}
