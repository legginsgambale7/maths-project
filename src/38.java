public class MathOperations {
    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println("The sum is: " + result);

        result = subtract(10, 4);
        System.out.println("The difference is: " + result);

        result = multiply(7, 2);
        System.out.println("The product is: " + result);

        result = divide(16, 4); // Division of a number by itself results in 1
        System.out.println("The quotient is: " + result);
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        if (num2 == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return num1 / num2;
    }
}
