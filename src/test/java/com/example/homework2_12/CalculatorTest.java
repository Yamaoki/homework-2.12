package com.example.homework2_12;

import com.example.homework2_12.service.CalculatorService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    CalculatorService calculator = new CalculatorService();

    @Test
    public void PlusPositiveNumbers() {
        int result = calculator.plus(5,5);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void PlusNegativeNumbers() {
        int result = calculator.plus(-5,-5);
        Assertions.assertEquals(-10, result);
    }
    @Test
    public void MinusPositiveNumbers() {
        int result = calculator.minus(5,5);
        Assertions.assertEquals(0, result);

    }
    @Test
    public void MinusNegativeNumbers() {
        int result = calculator.minus(-5,-5);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void MinusNegativeOneNumber() {
        int result = calculator.minus(-5,5);
        Assertions.assertEquals(-10, result);
    }
    @Test
    public void MinusNegativeTwoNumber() {
        int result = calculator.minus(5,-5);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void MultiplyNegativeNumbers() {
        int result = calculator.multiply(-5,-5);
        Assertions.assertEquals(25, result);
    }
    @Test
    public void MultiplyPositiveNumbers() {
        int result = calculator.multiply(5,5);
        Assertions.assertEquals(25, result);
    }
    @Test
    public void MultiplyNegativeOneNumber() {
        int result = calculator.multiply(-5,5);
        Assertions.assertEquals(-25, result);
    }
    @Test
    public void MultiplyNegativeTwoNumber() {
        int result = calculator.multiply(5,-5);
        Assertions.assertEquals(-25, result);
    }
    @Test
    public void DividePositiveNumbers() {
        int result = (int) calculator. divide(5,5);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void DivideNegativeNumbers() {
        int result = (int) calculator. divide(-5,-5);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void DivideNegativeOneNumber() {
        int result = (int) calculator. divide(-5,5);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void DivideNegativeTwoNumber() {
        int result = (int) calculator. divide(5,-5);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void DivideZeroNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> calculator.divide(5, 0));
    }
}
