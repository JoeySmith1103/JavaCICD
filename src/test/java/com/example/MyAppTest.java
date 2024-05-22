package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyAppTest {
    @Test
    public void testAddNumbers() {
        MyApp app = new MyApp();
        int result = app.addNumbers(3, 4);
        assertEquals(7, result, "3 + 4 should equal 7");
    }
}
