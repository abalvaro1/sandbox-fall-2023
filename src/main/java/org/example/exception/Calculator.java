package org.example.exception;

public class Calculator {

    // driver
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(2.0f,0.0f));

    }
    public int divide(int a, int b) {
        int returnValue = 0;

        try {
            returnValue = a / b;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException");
            e.printStackTrace();
        }

        return returnValue;
    }

    public float divide(float a, float b) {
        return a / b;
    }
}
