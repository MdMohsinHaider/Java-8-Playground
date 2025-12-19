package com.lib.mathutils;

/**
 * Optimized implementation of the ArithmeticOperation interface for integers.
 * Contains static utility methods for direct usage.
 */
public class ArithmeticHelper implements ArithmeticOperation {
    /**
     * Adds two integers. Uses Math.addExact for overflow-safety.
     */
    @Override
    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    /**
     * Subtracts second integer from first. Uses Math.subtractExact for overflow-safety.
     */
    @Override
    public int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    /**
     * Multiplies two integers. Uses Math.multiplyExact for overflow-safety.
     */
    @Override
    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    /**
     * Divides two integers, throws ArithmeticException on division by zero.
     */
    @Override
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisor cannot be zero.");
        return a / b;
    }

    /**
     * Returns modulus of integer division, throws ArithmeticException on division by zero.
     */
    @Override
    public int modulus(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisor cannot be zero.");
        return a % b;
    }

    /**
     * Returns divisor for two numbers (second operand).
     *
     * @param a dividend
     * @param b divisor
     * @return the divisor value {@code b}
     */
    public int getDivisor(int a, int b) {
        return b;
    }

    /**
     * Returns dividend for two numbers (first operand).
     *
     * @param a dividend
     * @param b divisor
     * @return the dividend value {@code a}
     */
    public int getDividend(int a, int b) {
        return a;
    }
}

