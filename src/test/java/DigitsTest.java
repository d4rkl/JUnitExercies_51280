import org.example.DigitsCounter;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitsTest {

    private ArrayList<String> digits;

    @Test
    public void testDigits() {
        DigitsCounter counter = new DigitsCounter();

        double result = counter.average(25);
        double expectedValue = 3.5;

        assertEquals(expectedValue, result);

    }
    @BeforeEach
    public void executedBeforeEach() {
        digits = new ArrayList<String>();
        System.out.println("@Before: Executed Before Each");
    }
}
