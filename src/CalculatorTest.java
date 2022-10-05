import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAddTwoNumbers() {
        System.out.println("Test 1");
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3,4));

    }

    @Test
    public void testMinusTwoNumbers() {
        System.out.println("Test 2");
        Calculator calc = new Calculator();
        assertEquals(8, calc.minus(10,1));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        System.out.println("Test 3");
        Calculator calc = new Calculator();
        assertEquals(4, calc.multiply(2,2));
    }




}