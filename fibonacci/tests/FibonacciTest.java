import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	@Test
	public void smallValues() {
		assertEquals(0, Fibonacci.fib(0));
		assertEquals(1, Fibonacci.fib(1));
		assertEquals(1, Fibonacci.fib(2));
		assertEquals(2, Fibonacci.fib(3));
		assertEquals(3, Fibonacci.fib(4));
		assertEquals(5, Fibonacci.fib(5));
	}

	@Test
	public void largeValue() {
		assertEquals(1836311903, Fibonacci.fib(46));
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalArgument() {
		Fibonacci.fib(-1);
	}
}
