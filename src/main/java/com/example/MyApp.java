package main.java.com.example;

public class MyApp {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        int result = app.addNumbers(3, 4);
        System.out.println("The sum is: " + result);
    }
}
