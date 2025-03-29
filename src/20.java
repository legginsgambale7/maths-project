import java.util.Scanner;

public class MathematicalOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        String operator = scanner.next();

        switch(operator) {
            case " + ": 
                System.out.println(num1 + " + 5 equals " + (num1 + 5));
                break;
            case " - ": 
                System.out.println(num1 + " - 5 equals " + (num1 - 5));
                break;
            case " * ": 
                System.out.println(num1 + " * 5 equals " + (num1 * 5));
                break;
            case " / ": 
                if (num1 != 0) {
                    System.out.println(num1 + " / 5 equals " + (double)(num1 / 5));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
        }

        scanner.close();
    }
}
