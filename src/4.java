import java.util.Scanner;
public class MathOperations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.println("Sum: " + (num1 + num2));
    System.out.println("Difference: " + (num1 - num2));
    System.out.println("Product: " + (num1 * num2));
    System.out.println("Quotient: " + (num1 / num2));
  }
}