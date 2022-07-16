package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int a = 2;
        int b = 2;
        int expected = a + b;

        int result = calculator.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void multimply() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 2;
        int expected1 = a * b;
        int result = calculator.multimply(a, b);

        Assert.assertEquals(expected1, result);
    }
}