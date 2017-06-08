public class Fibonacci {

  public static int fibonacci (int n) {
    if (n < 0)
      throw new IllegalArgumentException("Fibonacci is not defined for negative numbers!");
    if (n == 0)
      return 0;
    int prev1 = 1, prev2 = 1, tmp = 0;
    for (int i = 0; i < (n-2); i++) {
      tmp = prev2;
      prev2 += prev1;
      prev1 = tmp;
    }
    return prev2;
  }

}
