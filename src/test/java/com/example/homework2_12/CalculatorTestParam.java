package com.example.homework2_12;

import com.example.homework2_12.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTestParam {
    CalculatorService calc = new CalculatorService();

    @ParameterizedTest
    @MethodSource("paramPlusTest")
    public void plusTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, calc.plus(a, b));
    }

    public static Stream<Arguments> paramPlusTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(-5, -5, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("paramMinusTest")
    public void minusTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, calc.minus(a, b));
    }
    public static Stream<Arguments> paramMinusTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(-5, -5, 0),
                Arguments.of(-5, 5, -10),
                Arguments.of(5, -5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("paramMultiplyTest")
    public void multiplyTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, calc.multiply(a, b));
    }

    public static Stream<Arguments> paramMultiplyTest() {
        return Stream.of(
                Arguments.of(-5, -5, 25),
                Arguments.of(5, 5, 25),
                Arguments.of(-5, 5, -25),
                Arguments.of(5, -5, -25)
        );
    }
    @ParameterizedTest
    @MethodSource("paramDivideTest")
    public void divideTest(Integer a, Integer b, double result) {
        Assertions.assertEquals(result, calc.divide(a, b));
    }

    public static Stream<Arguments> paramDivideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(-5, -5, 1),
                Arguments.of(-5, 5, -1),
                Arguments.of(5, -5, -1));
    }
}
