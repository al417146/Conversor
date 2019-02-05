package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private Main main = new Main();
    @Test
    public void fahrenheitTest() {
        assertEquals(179.6, main.fahrenheit(82), 0.001);
    }

    @Test
    public void reamurTest() {
        assertEquals(65.6, main.reaumur(82), 0.001);
    }
}
