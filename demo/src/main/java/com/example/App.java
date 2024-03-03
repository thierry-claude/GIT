package main.java.com.example;

public class App {

    /** addition de deux nombres */
    public int add(int a, int b) {
        return a + b;
    }

    /** multiplication de deux nombres */
    public int multiply(int a, int b) {
        return a * b;
    }

    /** division de deux nombres */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}