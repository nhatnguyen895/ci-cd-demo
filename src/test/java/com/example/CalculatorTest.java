package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Kiểm tra 5 + 10 = 15
        assertEquals(15, calc.add(5, 10));
    }
}