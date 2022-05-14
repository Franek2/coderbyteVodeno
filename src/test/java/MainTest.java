import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void multiply_test() {
        assertEquals(4D, Main.performMathOperation(OperationType.MULTIPLY, 2D, 2D));
    }

    @Test
    public void divide_test() {
        assertEquals(8D, Main.performMathOperation(OperationType.DIVIDE, 16D, 2D));
    }

    @Test
    public void reminder_test() {
        assertEquals(1D, Main.performMathOperation(OperationType.REMINDER, 11D, 2D));
    }
}