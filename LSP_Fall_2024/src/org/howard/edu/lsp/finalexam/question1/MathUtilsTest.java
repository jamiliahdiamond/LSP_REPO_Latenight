package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    // Initialize MathUtils object for all tests
    private MathUtils mathUtils = new MathUtils();

    // Factorial tests
    @Test
    void testFactorialOfZero() {
        // Test edge case: factorial of 0
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        // Test normal case: factorial of a positive number
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        // Test error handling: factorial of a negative number
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
                     "Factorial of negative number should throw IllegalArgumentException");
    }

    // isPrime tests
    @Test
    void testIsPrimeWithPrimeNumber() {
        // Test with a known prime number
        assertTrue(mathUtils.isPrime(7), "7 should be prime");
    }

    @Test
    void testIsPrimeWithNonPrimeNumber() {
        // Test with a known non-prime number
        assertFalse(mathUtils.isPrime(4), "4 should not be prime");
    }

    @Test
    void testIsPrimeWithOne() {
        // Test edge case: 1 is not considered prime
        assertFalse(mathUtils.isPrime(1), "1 should not be prime");
    }

    // GCD tests
    @Test
    void testGCDOfTwoPositiveNumbers() {
        // Test GCD of two positive numbers
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    void testGCDWithOneZero() {
        // Test when one number is zero
        assertEquals(5, mathUtils.gcd(0, 5), "GCD of 0 and 5 should be 5");
    }

    @Test
    void testGCDWithBothZeros() {
        // Test error handling when both numbers are zero
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
                     "GCD of 0 and 0 should throw IllegalArgumentException");
    }
}