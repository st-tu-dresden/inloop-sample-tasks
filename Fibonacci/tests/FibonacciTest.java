import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci f;

    @Before
    public void setUp() {
        f = new Fibonacci;
    }

    @Test
    public void testcalcFib() {
        assertEquals("The result of calcFib(0) should be 0.", 0, f.testcalcFib(0));
        assertEquals("The result of calcFib(3) should be 2.", 2, f.testcalcFib(3));
        assertEquals("The result of calcFib(6) should be 8.", 8, f.testcalcFib(6));

        //test exception
        try {
            new f.testcalcFib(-1);
            fail("Fibonacci.testcalcFib() should throw a IllegalArgumentException if the argument is negative!");
        } catch (IllegalArgumentException e) {}
    }

}
