import org.example.RectangleCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void RectangleCalculator(){

        int width = 3;
        int height = 5;
        int c = 4;

        RectangleCalculator calculator = new RectangleCalculator();
        int expected1 = calculator.area(width, height);
        int expected2 = calculator.perimeter(width, height);
        int expected3 = calculator.isTriangle(width, height, c);


        assertEquals(expected1,15);
        assertEquals(expected2,16);

        assertEquals(expected3,1);



    }
}
