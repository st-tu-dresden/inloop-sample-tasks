public class Fibonacci {
	public static int fib(final int x) {
		int a = 0;
		int b = 1;

		for (int i = 0; i < x; i++) {
			int sum = a + b;
			a = b;
			b = sum;
		}

		return a;
	}
}
