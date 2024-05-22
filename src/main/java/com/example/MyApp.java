package main.java.com.example;

public class MyApp {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println("Addition: " + app.addNumbers(3, 4));
        System.out.println("Subtraction: " + app.subtractNumbers(9, 5));
        System.out.println("Multiplication: " + app.multiplyNumbers(3, 4));
        System.out.println("Division: " + app.divideNumbers(12, 4));
    }
}
