import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(15, Calculator.multiply(3, 5), "Regular multiplication should work");
        assertEquals(25, Calculator.multiply(5, 5), "Regular multiplication should work");
        assertEquals(20, Calculator.multiply(4, 5), "Regular multiplication should work");
       // assertEquals(20, Calculator.multiply(3, 5), "Regular multiplication should work");
    }

    @org.junit.jupiter.api.Test
    void multiply1() {

        assertEquals(25, Calculator.multiply(5, 5), "Regular multiplication should work");

    }

    @org.junit.jupiter.api.Test
    void multiply2() {

        assertEquals(20, Calculator.multiply(4, 5), "Regular multiplication should work");
        // assertEquals(20, Calculator.multiply(3, 5), "Regular multiplication should work");
    }

    @org.junit.jupiter.api.Test
    void multiply3() {
        assertEquals(20, Calculator.multiply(3, 5), "Regular multiplication should work");
    }


}