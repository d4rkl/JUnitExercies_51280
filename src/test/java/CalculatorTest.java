import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculation = new Calculator();
        int sum = calculation.add(2, 5);
        int testSum = 7;

        assertEquals(sum, testSum);
    }
}
