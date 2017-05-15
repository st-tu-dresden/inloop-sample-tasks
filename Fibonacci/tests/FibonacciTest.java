import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        //test some test values
        assertEquals("The result of fibonacci(0) should be 0.", 0, Fibonacci.fibonacci(0));
        assertEquals("The result of fibonacci(3) should be 2.", 2, Fibonacci.fibonacci(3));
        assertEquals("The result of fibonacci(6) should be 8.", 8, Fibonacci.fibonacci(6));
    }


    @Test
    public void testFibonacciIllegalArgument() {
        //test exception
        try {
            Fibonacci.fibonacci(-1);
            fail("Fibonacci.fibonacci() should throw a IllegalArgumentException if the argument is negative!");
        } catch (IllegalArgumentException e) {}
    }

}
