package lcas.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    App runner;
    
    @BeforeEach
    void setup() {
        runner = new App();
    }
    @Test
    void testCalculateMoles1() {
        assertEquals("Number of Moles: 0.0446136013754195\nPressure: 1.0\nTemperature: 273.15\nVolume: 1", runner.calculateMoles());
    }
}
