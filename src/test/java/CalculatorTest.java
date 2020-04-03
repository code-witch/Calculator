import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // arrange
        Calculator calc = new Calculator();
        double expectedResult = 10.0;
        // act
        double actualResult = calc.add(5.0,5.0);
        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract() {
        // arrange
        Calculator calc = new Calculator();
        double expectedResult = 0.0;
        // act
        double actualResult = calc.subtract(5.0,5.0);
        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        // arrange
        Calculator calc = new Calculator();
        double expectedResult = 25.0;
        // act
        double actualResult = calc.multiply(5.0,5.0);
        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide() {
        // arrange
        Calculator calc = new Calculator();
        double expectedResult = 5.0;
        // act
        double actualResult = calc.divide(25.0,5.0);
        // assert
        assertEquals(expectedResult, actualResult);
    }
}