package com.example.addition_ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    Addition addition = new Addition();

    @Test
    void testPositiveNumbers() {
        assertEquals(30, addition.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-15, addition.add(-10, -5));
    }

    @Test
    void testZero() {
        assertEquals(10, addition.add(10, 0));
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        assertEquals(0, addition.add(10, -10));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(2000000, addition.add(1000000, 1000000));
    }
}

