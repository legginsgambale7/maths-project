public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int findGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(10.5, 4.2));
        System.out.println("Is Even: " + isEven(7));
        System.out.println("Greatest Common Divisor: " + findGreatestCommonDivisor(8, 6));
    }
}
