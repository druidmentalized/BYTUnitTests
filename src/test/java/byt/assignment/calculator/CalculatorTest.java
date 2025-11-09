package byt.assignment.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        var calc = new Calculator(2.0, 3.0, '+');
        assertEquals(5.0, calc.calculate(), 1e-9);
    }

    @Test
    void subtract_shouldReturnDifference() {
        var calc = new Calculator(5.0, 3.0, '-');
        assertEquals(2.0, calc.calculate(), 1e-9);
    }

    @Test
    void multiply_shouldReturnProduct() {
        var calc = new Calculator(4.0, 2.5, '*');
        assertEquals(10.0, calc.calculate(), 1e-9);
    }

    @Test
    void divide_shouldReturnQuotient() {
        var calc = new Calculator(9.0, 3.0, '/');
        assertEquals(3.0, calc.calculate(), 1e-9);
    }

    @Test
    void divideByZero_shouldThrowArithmeticException() {
        var calc = new Calculator(1.0, 0.0, '/');
        assertThrows(ArithmeticException.class, calc::calculate);
    }

    @Test
    void invalidOperator_shouldThrowIllegalArgumentException() {
        var calc = new Calculator(1.0, 2.0, '?');
        assertThrows(IllegalArgumentException.class, calc::calculate);
    }
}
