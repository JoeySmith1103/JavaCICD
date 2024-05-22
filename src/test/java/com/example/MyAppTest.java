package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MyAppTest {

    @Test
    public void testAddNumbers() {
        MyApp app = new MyApp();
        int result = app.addNumbers(3, 4);
        assertEquals(7, result, "3 + 4 should equal 7");
    }

    @Test
    public void testSubtractNumbers() {
        MyApp app = new MyApp();
        int result = app.subtractNumbers(9, 5);
        assertEquals(3, result, "9 - 5 should not equal 3");
    }

    @Test
    public void testMultiplyNumbers() {
        MyApp app = new MyApp();
        int result = app.multiplyNumbers(3, 4);
        assertEquals(12, result, "3 * 4 should equal 12");
    }

    @Test
    public void testDivideNumbers() {
        MyApp app = new MyApp();
        int result = app.divideNumbers(12, 4);
        assertEquals(3, result, "12 / 4 should equal 3");
    }

    @Test
    public void testDivideByZero() {
        MyApp app = new MyApp();
        assertThrows(IllegalArgumentException.class, () -> {
            app.divideNumbers(12, 0);
        }, "Division by zero should throw IllegalArgumentException");
    }
}
