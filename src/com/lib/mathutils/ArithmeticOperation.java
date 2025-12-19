package com.lib.mathutils;

/**
 * Interface defining basic arithmetic operations for two operands.
 */
public interface ArithmeticOperation {
    /**
     * Adds two numbers.
     *
     * @param a first operand
     * @param b second operand
     * @return the sum of {@code a} and {@code b}
     */
    int add(int a, int b);

    /**
     * Subtracts the second number from the first.
     *
     * @param a first operand
     * @param b second operand
     * @return the difference of {@code a} and {@code b}
     */
    int subtract(int a, int b);

    /**
     * Multiplies two numbers.
     *
     * @param a first operand
     * @param b second operand
     * @return the product of {@code a} and {@code b}
     */
    int multiply(int a, int b);

    /**
     * Divides the first number by the second, truncating results toward zero.
     *
     * @param a dividend
     * @param b divisor
     * @return the integer quotient of {@code a} divided by {@code b}
     * @throws ArithmeticException if {@code b == 0}
     */
    int divide(int a, int b);

    /**
     * Returns the modulus (remainder) after division of two numbers.
     *
     * @param a dividend
     * @param b divisor
     * @return the remainder of {@code a} divided by {@code b}
     * @throws ArithmeticException if {@code b == 0}
     */
    int modulus(int a, int b);
}

