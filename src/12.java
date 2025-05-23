import java.util.*;

class MathOperations {
  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int divide(int x, int y) {
    if (y == 0) throw new IllegalArgumentException("Cannot divide by zero");
    return x / y;
  }
}
