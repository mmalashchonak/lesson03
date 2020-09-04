package com.company;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        long c = (long) a * b;
        return c;
    }

    public double division(int a, int b) {
        double c = (double) a / b;
        return c;
    }
}
