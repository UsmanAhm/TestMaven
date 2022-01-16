import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(20, Calculator.multiply(4, 5),
                "Regular multiplication should work");
    }
}