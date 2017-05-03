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
    }

}
