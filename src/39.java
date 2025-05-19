public class MathOperations {
    public static void main(String[] args) {
        // Example of basic arithmetic operations
        int result1 = 5 + 3;
        int result2 = 7 - 2;
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        // Example of comparison using == and != operators
        boolean isEqual = true;
        boolean isNotEqual = false;
        if (isEqual) {
            System.out.println("Is equal");
        } else {
            System.out.println("Is not equal");
        }

        // Example of input/output operations using System.out.print and System.out.println
        System.out.print("Input: ");
        System.out.println("Value: " + 10);

        System.out.print("Output: ");
        int output = 20;
        if (output > 5) {
            System.out.println("Greater than 5");
        } else {
            System.out.println("Not greater than 5");
        }

        // Example of error handling using try-catch blocks
        String input = "10";
        try {
            int result2 = Integer.parseInt(input);
            System.out.println("Value: " + result2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
